package com.server.controller.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.server.controller.BaseController;

/**接收多图片,作者：张勇(Mark Smith)*/
@RestController("demo_form_simple_fileUploadController")
@RequestMapping("server/controller/demo_form_simple_fileUploadController")
public class Demo_form_simple_fileUploadController extends BaseController{
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)  
    public @ResponseBody String upload(MultipartFile fileupload) {  
  
            File f=new File("/temp_"+fileupload.getOriginalFilename());  
            try {  
                FileUtils.copyInputStreamToFile(fileupload.getInputStream(),f );  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
               
            return "fileuploaddone";    
  
    }  
	
	@RequestMapping(value = "/uploadPicture",method = RequestMethod.POST)  
    public @ResponseBody String uploadPicture(MultipartFile fileupload) {  
  
            File f=new File("/temp_"+fileupload.getOriginalFilename());  
            try {  
                FileUtils.copyInputStreamToFile(fileupload.getInputStream(),f );  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
               
            return "fileuploaddone";    
  
    }
}
