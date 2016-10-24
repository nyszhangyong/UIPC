package com.server.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**管理系统拦截器*/
public class AdminAuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, 
    		                 HttpServletResponse response, 
    		                 Object handler) throws Exception {
    	
        return true;
    }
}
