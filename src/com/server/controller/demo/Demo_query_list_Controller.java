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

/**查询用户*/
@RestController("demo_query_list_Controller")
@RequestMapping("server/controller/demo_query_list_Controller")
public class Demo_query_list_Controller extends BaseController{

	/**查询用户列表*/
	@RequestMapping(value="/queryUserList", method = RequestMethod.POST)	
    public @ResponseBody ObjectMessage queryUserList(User user,HttpServletRequest request){
		User user1=new User();
		user1.setUserName("张三");
		user1.setPassword("123");
		User user2=new User();
		user2.setUserName("李四");
		user2.setPassword("456");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
        return ObjectMessage.success("操作成功",userList,null);
    }
}
