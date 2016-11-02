package com.server.controller.demo;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.server.controller.BaseController;
import com.vo.User;
import com.vo.UserInfo;

/**接收多文件和数组数据*/
@RestController("demo_form_multipartFormDataController")
@RequestMapping("server/controller/demo_form_multipartFormDataController")
public class Demo_form_multipartFormDataController extends BaseController{

	/**接收多文件和数组数据*/
	@RequestMapping("/receiveUserInfo")	
    public String receiveUserInfo(UserInfo userInfo){
		List<User> userListTemp=userInfo.getUserList();
		for(User userTemp:userListTemp){
			System.out.println(userTemp.getUserName());
		}
		return "成功！";
    }
	
}
