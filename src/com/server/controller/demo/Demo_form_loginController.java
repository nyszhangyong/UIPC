package com.server.controller.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.server.controller.BaseController;
import com.vo.User;

/**身份验证*/
@RestController("demo_form_loginController")
@RequestMapping("server/controller/demo_form_loginController")
public class Demo_form_loginController extends BaseController{

	/**登陆账号、密码验证*/
	@RequestMapping(value="/loginConfirmation", method = RequestMethod.POST)	
    public String loginConfirmation(User user,HttpServletRequest request){
		String userName=user.getUserName();
		String password=user.getPassword();
		return "{\"userName\":\""+userName+"\",\"password\":\""+password+"\"} ";
    }
	
}
