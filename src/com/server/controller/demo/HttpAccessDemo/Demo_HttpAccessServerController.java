package com.server.controller.demo.HttpAccessDemo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.server.controller.BaseController;
import com.util.FilesUtils;
import com.vo.User;

/**HTTP协议数据交互演示样例*/
@RestController("demo_HttpAccessServerController")
@RequestMapping("server/controller/demo_HttpAccessServerController")
public class Demo_HttpAccessServerController extends BaseController{

	/**JSON格式请求*/
	/**普通表单请求-单一字符串形式*/
	/**多媒体表单请求-多附件（图片、文件）*/
	@RequestMapping(value="/jsonDataExchange", method = RequestMethod.POST)	
    public String jsonDataExchange(User user,HttpServletRequest request){
		String userName=user.getUserName();
		String password=user.getPassword();
		setUploadFile(request,user);
		return "{\"userName\":\""+userName+"\",\"password\":\""+password+"\"} ";
    }

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