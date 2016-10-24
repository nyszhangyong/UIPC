package com.util;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**HTTP协议访问工具类*/
public class HttpAccessServer {
	
	private Map<String, String> textParams = new HashMap<String, String>();
	private Map<String, File> fileparams = new HashMap<String, File>();
	private DataOutputStream dataOutputStream;
	public static final String charsetName="UTF-8";
	private HttpURLConnection httpURLConnection;
	
	//JSON格式请求
	static String contentType_json="application/json;";
	
	//普通表单请求-单一字符串形式
	static String contentType_form="application/x-www-form-urlencoded;";
	
	//多媒体表单请求-多附件（图片、文件）
	static String contentType_multipart="multipart/form-data;";
		
	/**访问方式一：正常访问，所有值拼接成？key=value加&形式字符串
	 * @throws Exception */
	public String sendStringData(URL url,String contentType,String requestParamString) throws Exception {
	    String responseResultStrig=null;
			//HttpURLConnection的一些必须设置
			initConnection(url,contentType);
		    //维持长连接
		    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
		    //建立输入流，向指向的URL传入参数
		    OutputStream outputStream=httpURLConnection.getOutputStream();
		    outputStream.write(requestParamString.getBytes(charsetName));
		    outputStream.flush();
		    int resultCode=httpURLConnection.getResponseCode();
			if (resultCode == 200) {			      
				InputStream responseInputStream = httpURLConnection.getInputStream();
				InputStreamReader responseInputStreamReader = new InputStreamReader(responseInputStream,charsetName);
				BufferedReader responseBufferedReader = new BufferedReader(responseInputStreamReader);
				StringBuffer requestParamStringBuffer = new StringBuffer();
				String requestParamString1 = null;
				while ((requestParamString1 = responseBufferedReader.readLine()) != null) {
					requestParamStringBuffer.append(requestParamString1);
				}
				responseBufferedReader.close();
				responseInputStreamReader.close();
				responseInputStream.close();
				responseResultStrig=requestParamStringBuffer.toString();
			} else {
				throw new RuntimeException("访问服务器失败，resultCode="+resultCode); 
			}		

		return responseResultStrig;
	}
	
	/**访问方式二：特殊访问，所有值放入Map对象中，Map<String, String>和Map<String, File>中，文件以流的形式传递，参数以表单数据的形式传递到后台*/
	public byte[] send_multimediaData(URL url,String contentType) throws Exception {
		//HttpURLConnection的一些必须设置
		initConnection(url,contentType);
	    //建立输出流，向指向的URL传入参数
	    OutputStream outputStream=httpURLConnection.getOutputStream();
		dataOutputStream = new DataOutputStream(outputStream);
		//文件数据
		writeFileParams();
		//普通字符串数据
		writeStringParams();
		//添加结尾数据
		paramsEnd();
		//建立输入流，接收服务器返回的结果数据
		InputStream inputStream = httpURLConnection.getInputStream();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int temp_int;
		while ((temp_int = inputStream.read()) != -1) {
			byteArrayOutputStream.write(temp_int);
		}
		httpURLConnection.disconnect();
		return byteArrayOutputStream.toByteArray();
	}
	
    /**HttpURLConnection访问基础参数设置*/
	private void initConnection(URL accessUrl,String contentType) throws Exception {
	    //接下来，创建连接对象,并且为连接对象设置访问参数
	    httpURLConnection=(HttpURLConnection)accessUrl.openConnection();
	    //允许输出
	    httpURLConnection.setDoOutput(true);
	    //允许输入
	    httpURLConnection.setDoInput(true);
	    //不允许缓存（因为这是开发调试环境，缓存可能隐藏潜在的程序缺陷）
	    httpURLConnection.setUseCaches(false);  
	    //采用POST方式连接
	    httpURLConnection.setRequestMethod("POST");
	    
	    //注意：setReadTimeout和setConnectTimeout必须同时设置，否则会造成访问超时无响应
	    //设置从主机读取数据超时（单位：毫秒）	    
	    httpURLConnection.setReadTimeout(500000);
	    //设置连接主机超时（单位：毫秒） 
	    httpURLConnection.setConnectTimeout(500000);
	    
	    httpURLConnection.setRequestProperty("Content-Type",contentType);
	}
	
	/**增加一个文件到form表单数据中*/
	public void addFileParameter(String name, File value) {
		fileparams.put(name, value);
	}
	
    /**增加一个普通字符串数据到form表单数据中*/
	public void addTextParameter(String name, String value) {
		textParams.put(name, value);
	}
	
    /**文件数据*/
	private void writeFileParams() throws Exception {
		Set<String> keySet = fileparams.keySet();
		for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
			String name = it.next();
			File value = fileparams.get(name);
			dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + name+ "\"; filename=\"" + encode(value.getName()) + "\"\r\n");
			dataOutputStream.writeBytes("Content-Type: " + getContentType(value) + "\r\n");
			dataOutputStream.writeBytes("\r\n");
			dataOutputStream.write(getBytes(value));
			dataOutputStream.writeBytes("\r\n");
		}
	}
	
    /**普通字符串数据*/
	private void writeStringParams() throws Exception {
		Set<String> keySet = textParams.keySet();
		for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
			String name = it.next();
			String value = textParams.get(name);
			dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + name+ "\"\r\n");
			dataOutputStream.writeBytes("\r\n");
			dataOutputStream.writeBytes(encode(value) + "\r\n");
		}
	}
	
	/**添加结尾数据*/
	private void paramsEnd() throws Exception {
		dataOutputStream.writeBytes("\r\n");
	}
	
    /**获取文件的上传类型，图片扩展名格式为image/png,image/jpg等。*/
	private String getContentType(File file) throws Exception {
		
		ImageInputStream imageInputStream = ImageIO.createImageInputStream(file);
		
		//如果文件为null，则直接返回二进制流类型
		if (imageInputStream == null) {
			//application/octet-stream意思是二进制流
			return "application/octet-stream";
		}
		
		Iterator<ImageReader> imageReaderIterator = ImageIO.getImageReaders(imageInputStream);
		
		//如果文件无值，则直接返回二进制流类型
		if (!imageReaderIterator.hasNext()) {
			imageInputStream.close();
			return "application/octet-stream";
		}
		imageInputStream.close();
		
		//将文件扩展名FormatName返回的值转换成小写，默认为大写
		return "image/" + imageReaderIterator.next().getFormatName().toLowerCase();

	}
	
	/**对包含中文的字符串进行转码，例如UTF-8。服务器那边要进行一次解码*/
    private String encode(String value) throws Exception{
    	return URLEncoder.encode(value, charsetName);
    }
    
    /**把文件转换成字节数组*/
	private byte[] getBytes(File file) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(file);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] bytes = new byte[1024];
		int temp_int;
		while ((temp_int = fileInputStream.read(bytes)) != -1) {
			byteArrayOutputStream.write(bytes, 0, temp_int);
		}
		fileInputStream.close();
		return byteArrayOutputStream.toByteArray();
	}
}
