package com.server.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class RequestInterceptor extends HandlerInterceptorAdapter {

    public static final Logger  logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(logger.isDebugEnabled()){
            logger.info("请求URL-->"+request.getRequestURI());
            @SuppressWarnings("rawtypes")
			Map map = request.getParameterMap();
            @SuppressWarnings({ "unchecked", "rawtypes" })
			Set<Map.Entry> set = map.entrySet();
            for(@SuppressWarnings("rawtypes")
			Iterator<Map.Entry> iter = set.iterator();iter.hasNext();){
                @SuppressWarnings("rawtypes")
				Map.Entry entry = iter.next();
                String key = String.valueOf(entry.getKey());
                Object valueObj = entry.getValue();
                String value = "";
                if(valueObj instanceof String[]){
                    String[] values = (String[])valueObj;
                    for(int i=0;i<values.length;i++){
                        value = values[i] + ",";
                    }
                    value = value.substring(0, value.length()-1);
                }else{
                    value = valueObj.toString();
                }
                logger.info("name="+key+",value="+value);
            }
        }
        return true;
    }
}
