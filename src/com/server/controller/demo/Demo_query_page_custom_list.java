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
import com.util.Page;
import com.vo.User;

/**查询用户*/
@RestController("demo_query_page_custom_list")
@RequestMapping("server/controller/demo_query_page_custom_list")
public class Demo_query_page_custom_list extends BaseController{
	
	/**查询用户列表*/
	@RequestMapping(value="/queryUserList", method = RequestMethod.POST)	
    public @ResponseBody ObjectMessage queryUserList(User user, Page page,HttpServletRequest request){
		List<User> userList=new ArrayList<User>();
		int pageNumber=page.getPageNumber();
        int pageSize=page.getPagesize();
        page.setTotalRecord(986);
        for(int i=1;i<=pageSize;i++){
    		User userTemp=new User();
    		userTemp.setUserName("李"+(pageSize*(pageNumber-1)+i));
    		userTemp.setPassword("123");
    		userList.add(userTemp);
        }
        return ObjectMessage.success("操作成功",userList,page);
    }
}
