package com.server.controller.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.server.controller.BaseController;

/**身份验证*/
@RestController("demo_query_loginController")
@RequestMapping("server/controller/demo_query_loginController")
public class Demo_query_loginController extends BaseController{

	/**根据账号获得密码*/
	@RequestMapping(value="/loginConfirmation", method = RequestMethod.POST)
    public String loginConfirmation(String  userName,HttpServletRequest request){
		String password="123456";
		return "{\"userName\":\""+userName+"\",\"password\":\""+password+"\"} ";
    }

}
