package com.server.controller.demo;

import java.net.MalformedURLException;
import java.net.URL;

import com.util.HttpAccessClient;

public class Demo_form_loginController_HttpClient {

	public static void main(String[] args) {

		methodOne_f2j_jsonDataExchange();
	}

	/**访问方式一DEMO：普通FORM表单请求,然后JSON格式返回*/	
    public static void methodOne_f2j_jsonDataExchange(){
		//9971840c-ef8c-4514-879e-537e1d04ade8
		//普通表单-数据格式请求
		String contentType_form="application/x-www-form-urlencoded;";
				
		//整个controller的URL
		String accessController="http://183.62.139.75:8080/StandardApiAction_login.action";
		accessController="http://183.62.139.75:8080/StandardApiAction_queryUserVehicle.action";
		//访问客户端
		HttpAccessClient httpAccessClient=new HttpAccessClient();
		
	    try {
	    	//访问Server的输入输出参数对象
	    	String requestParamString=null;
	    	String responseResultStrig=null;

	    	//把多个参数用&和=拼接成字符串，然后用POST方式提交到服务器
			StringBuffer paramStringBuffer=new StringBuffer();
			paramStringBuffer.append("jsession=" + "9971840c-ef8c-4514-879e-537e1d04ade8");
			requestParamString=paramStringBuffer.toString();
			URL url=new URL(accessController);
			
			responseResultStrig=httpAccessClient.sendStringData(url, contentType_form, requestParamString);
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
