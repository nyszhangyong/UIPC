package com.server.controller.demo.HttpAccessDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import com.util.HttpAccessClient;
import com.util.HttpPostUtil;

/**HTTP协议数据交互演示样例*/
public class Demo_HttpAccessServerController_HttpClient{

	public static void main(String[] args){
		
		//访问方式一DEMO：普通FORM表单请求,然后JSON格式返回
	    //methodOne_f2j_jsonDataExchange();
		//访问方式一DEMO：JSON格式请求,并且JSON格式返回
	    //methodOne_j2j_jsonDataExchange();
		//访问方式一DEMO：普通FORM表单请求,对象格式返回	
	    //methodOne_f2o_jsonDataExchange();
		//访问方式二DEMO：普通FORM表单请求,对象格式返回	
	    //methodTwo_f2o_jsonDataExchange();
		//访问方式二DEMO：普通FORM数组表单请求,对象格式返回	
	    methodTwo_f2o_arrayDataExchange();
	}
	
	/**访问方式二DEMO：普通FORM数组表单请求,对象格式返回*/	
    public static void methodTwo_f2o_arrayDataExchange(){
    	//JSON格式请求
    	//String contentType_json="application/json;";
    	
    	//普通表单请求-单一字符串形式
    	//String contentType_form="application/x-www-form-urlencoded;";
    	
    	//多媒体表单请求-多附件（图片、文件）
    	//String contentType_multipart="multipart/form-data;";
		
		//整个controller的URL
		String accessController="http://127.0.0.1:8080/UIPC/server/controller/demo_HttpAccessServerController";
		//URL url=new URL(accessController+"/methodTwo_f2o_jsonDataExchange");

	    try {
			//访问客户端
			HttpPostUtil baseHttpClient=new HttpPostUtil(accessController+"/methodTwo_f2o_arrayDataExchange");
	    	//访问Server的输入输出参数对象
	    	String responseResultStrig=null;

	    	//把多个参数用键值形式保存，然后用POST方式提交到服务器
	    	baseHttpClient.addTextParameter("userName", "admin3");
	    	baseHttpClient.addTextParameter("password", "admin3");
    	    baseHttpClient.addFileParameter("headPhotoFile", new File("D:\\zhangyong.jpg"));
	    	baseHttpClient.addTextParameter("userName", "admin33");
	    	baseHttpClient.addTextParameter("password", "admin33");
    	    baseHttpClient.addFileParameter("headPhotoFile", new File("D:\\zhangyong.jpg"));
			
			
			responseResultStrig=baseHttpClient.send();
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	/**访问方式二DEMO：普通FORM表单请求,对象格式返回*/	
    public static void methodTwo_f2o_jsonDataExchange(){
    	//JSON格式请求
    	//String contentType_json="application/json;";
    	
    	//普通表单请求-单一字符串形式
    	//String contentType_form="application/x-www-form-urlencoded;";
    	
    	//多媒体表单请求-多附件（图片、文件）
    	//String contentType_multipart="multipart/form-data;";
		
		//整个controller的URL
		String accessController="http://127.0.0.1:8080/UIPC/server/controller/demo_HttpAccessServerController";
		//URL url=new URL(accessController+"/methodTwo_f2o_jsonDataExchange");

	    try {
			//访问客户端
			HttpPostUtil baseHttpClient=new HttpPostUtil(accessController+"/methodTwo_f2o_jsonDataExchange");
	    	//访问Server的输入输出参数对象
	    	String responseResultStrig=null;

	    	//把多个参数用键值形式保存，然后用POST方式提交到服务器
	    	baseHttpClient.addTextParameter("userName", "admin3");
	    	baseHttpClient.addTextParameter("password", "admin3");
    	    baseHttpClient.addFileParameter("headPhotoFile", new File("D:\\zhangyong.jpg"));

			
			
			responseResultStrig=baseHttpClient.send();
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	/**访问方式一DEMO：普通FORM表单请求,对象格式返回*/	
    public static void methodOne_f2o_jsonDataExchange(){
		
		//普通表单-数据格式请求
		String contentType_form="application/x-www-form-urlencoded;";
				
		//整个controller的URL
		String accessController="http://127.0.0.1:8080/UIPC/server/controller/demo_HttpAccessServerController";
		
		//访问客户端
		HttpAccessClient httpAccessClient=new HttpAccessClient();
		
	    try {
	    	//访问Server的输入输出参数对象
	    	String requestParamString=null;
	    	String responseResultStrig=null;

	    	//把多个参数用&和=拼接成字符串，然后用POST方式提交到服务器
			StringBuffer paramStringBuffer=new StringBuffer();
			paramStringBuffer.append("userName=" + "admin22");
			paramStringBuffer.append("&password=" + "admin22");	
			requestParamString=paramStringBuffer.toString();
			URL url=new URL(accessController+"/methodOne_f2o_jsonDataExchange");
			
			responseResultStrig=httpAccessClient.sendStringData(url, contentType_form, requestParamString);
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	/**访问方式一DEMO：普通FORM表单请求,然后JSON格式返回*/	
    public static void methodOne_f2j_jsonDataExchange(){
		
		//普通表单-数据格式请求
		String contentType_form="application/x-www-form-urlencoded;";
				
		//整个controller的URL
		String accessController="http://127.0.0.1:8080/UIPC/server/controller/demo_HttpAccessServerController";
		
		//访问客户端
		HttpAccessClient httpAccessClient=new HttpAccessClient();
		
	    try {
	    	//访问Server的输入输出参数对象
	    	String requestParamString=null;
	    	String responseResultStrig=null;

	    	//把多个参数用&和=拼接成字符串，然后用POST方式提交到服务器
			StringBuffer paramStringBuffer=new StringBuffer();
			paramStringBuffer.append("userName=" + "admin");
			paramStringBuffer.append("&password=" + "admin");	
			requestParamString=paramStringBuffer.toString();
			URL url=new URL(accessController+"/methodOne_f2j_jsonDataExchange");
			
			responseResultStrig=httpAccessClient.sendStringData(url, contentType_form, requestParamString);
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	/**访问方式一DEMO：JSON格式请求,并且JSON格式返回*/	
    public static void methodOne_j2j_jsonDataExchange(){
		
    	//JSON格式请求
    	String contentType_json="application/json;";
				
		//整个controller的URL
		String accessController="http://127.0.0.1:8080/UIPC/server/controller/demo_HttpAccessServerController";
		
		//访问客户端
		HttpAccessClient httpAccessClient=new HttpAccessClient();
		
	    try {
	    	//访问Server的输入输出参数对象
	    	String requestParamString=null;
	    	String responseResultStrig=null;

	    	//把多个参数用&和=拼接成字符串，然后用POST方式提交到服务器
			StringBuffer paramStringBuffer=new StringBuffer();
			paramStringBuffer.append("{\"userName\":\"admin1\",\"password\":\"admin2\"} ");
			requestParamString=paramStringBuffer.toString();
			URL url=new URL(accessController+"/methodOne_j2j_jsonDataExchange");
			
			responseResultStrig=httpAccessClient.sendStringData(url, contentType_json, requestParamString);
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}