package com.server.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.util.NetworkUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CostTimeInterceptor extends HandlerInterceptorAdapter {

    private static final Logger log = LoggerFactory.getLogger(CostTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, 
    		                 HttpServletResponse response, 
    		                 Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,  
    		               HttpServletResponse response, 
    		               Object handler,
                           ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        if (log.isInfoEnabled()) {
            log.info("["+ NetworkUtil.getIpAddr(request)+"][" + request.getRequestURI() + "] executeTime : " + executeTime + "ms");
        }
    }
}
