package com.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesUtils {
    public static String saveFile(HttpServletRequest request, MultipartFile multipartFile) throws IOException {
        String exname = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
        String path = request.getSession().getServletContext().getRealPath("upload");
        SimpleDateFormat pathFormat = new SimpleDateFormat("/yyyy-MM/dd/");
        String abPath = pathFormat.format(new Date());
        String fileName = UUIDFactory.getUUID() + exname;
        File targetFile = new File(path + abPath, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        multipartFile.transferTo(targetFile);
        return abPath + fileName;

    }
    public static boolean isPicFile(MultipartFile multipartFile)
    {
        String exname = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
        if (exname.equals(".png") || exname.equals(".jpg") || exname.equals(".jpeg") || exname.equals(".bmp")) {
            return  true;
        }else {
            return false;
        }
    }
    public static boolean isAppFile(MultipartFile multipartFile)
    {
        String exname = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
        if (exname.equals(".ipa") || exname.equals(".apk")) {
            return  true;
        }else {
            return false;
        }
    }


}
