package com.server.controller.demo;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.controller.BaseController;
import com.util.ObjectMessage;
import com.vo.User;

/**身份验证*/
@RestController("demo_form_loginController")
@RequestMapping("server/controller/demo_form_loginController")
public class Demo_form_loginController extends BaseController{

	/**登陆账号、密码验证*/
	@RequestMapping(value="/loginConfirmation", method = RequestMethod.POST)
	@ResponseBody
    public ObjectMessage loginConfirmation(User user,HttpServletRequest request){
		User user1=new User();
		user1.setUserName("张三");
		user1.setPassword("123");
		User user2=new User();
		user2.setUserName("李四");
		user2.setPassword("456");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
        return ObjectMessage.success("操作成功",userList);
//		String userName=user.getUserName();
//		String password=user.getPassword();
//		return "{\"userName\":\""+userName+"\",\"password\":\""+password+"\"} ";
    }
	
	/**查询：买家-全部订单*/
	@RequestMapping(value="/getBuyersAllOrdersList", method = RequestMethod.POST)
    public ObjectMessage getBuyersAllOrdersList(HttpServletRequest request){
		User user1=new User();
		user1.setUserName("张三");
		user1.setPassword("123");
		User user2=new User();
		user2.setUserName("李四");
		user2.setPassword("456");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
        return ObjectMessage.success("操作成功",userList);
    }

}
