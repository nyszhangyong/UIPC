package com.server.controller.demo.HttpAccessDemo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.server.controller.BaseController;
import com.util.FilesUtils;
import com.util.ObjectMessage;
import com.vo.User;

/**HTTP协议数据交互演示样例*/
@RestController("demo_HttpAccessServerController")
@RequestMapping("server/controller/demo_HttpAccessServerController")
public class Demo_HttpAccessServerController extends BaseController{

	/**访问方式一DEMO：普通FORM表单请求,对象格式返回*/
	@RequestMapping(value="/methodOne_f2o_jsonDataExchange", method = RequestMethod.POST)	
    public ObjectMessage methodOne_f2o_jsonDataExchange(User user,HttpServletRequest request){
		return ObjectMessage.success("成功", user, null);
    }
	
	/**访问方式一DEMO：普通FORM表单请求,然后JSON格式返回*/
	@RequestMapping(value="/methodOne_f2j_jsonDataExchange", method = RequestMethod.POST)	
    public @ResponseBody ObjectMessage methodOne_f2j_jsonDataExchange(User user,HttpServletRequest request){
		return ObjectMessage.success("成功", user, null);
    }
	
	/**访问方式一DEMO：JSON格式请求,并且JSON格式返回*/
	@RequestMapping(value="/methodOne_j2j_jsonDataExchange", method = RequestMethod.POST)	
    public @ResponseBody ObjectMessage methodOne_j2j_jsonDataExchange(@RequestBody User user,HttpServletRequest request){
		return ObjectMessage.success("成功", user, null);
    }

	/**访问方式二DEMO：普通FORM表单请求,对象格式返回*/
	@RequestMapping(value="/methodTwo_f2o_jsonDataExchange", method = RequestMethod.POST)	
    public ObjectMessage methodTwo_f2o_jsonDataExchange(User user,HttpServletRequest request){
		setUploadFile(request,user);
		return ObjectMessage.success("成功", user, null);
    }
	
	/**访问方式二DEMO：普通表单请求-单一字符串形式*/
	/**访问方式二DEMO：多媒体表单请求-多附件（图片、文件）*/
    private void setUploadFile(HttpServletRequest request,User user){
		try {
	        if(user.getHeadPhotoFile()!=null){
	            String headPhotoName= toFile(request,user.getHeadPhotoFile());
	            user.setHeadPhotoName(headPhotoName);
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    protected String toFile(HttpServletRequest request,MultipartFile multipartFile)throws Exception{
        return FilesUtils.saveFile(request,multipartFile);
    }
}