package com.server.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**身份验证*/
@RestController("authenticationController")
@RequestMapping("server/controller/authenticationController")
public class AuthenticationController extends BaseController{

	/**登陆账号、密码验证*/
	@RequestMapping(value="/loginConfirmation", method = RequestMethod.POST)
    public String loginConfirmation(HttpServletRequest request){
		return "ok";
    }

}
