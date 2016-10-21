package com.server.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.base.BaseInfo;
import com.vo.SysMenuVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**管理系统拦截器*/
public class AdminAuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, 
    		                 HttpServletResponse response, 
    		                 Object handler) throws Exception {
    	
        Object session=request.getSession().getAttribute(BaseInfo.sys_authentication_key);
        if(session!=null)
        {
            String url = request.getRequestURL().toString();
            @SuppressWarnings("unchecked")
			List<SysMenuVO> list= (List<SysMenuVO>)request.getSession().getAttribute(BaseInfo.sys_user_menu_key);
            for (SysMenuVO sysMenuVO : list) {
                if (url.contains(sysMenuVO.getLink())) {
                    return true;
                }
            }
            return false;

        }else
        {
            PrintWriter out = response.getWriter();
            StringBuilder builder = new StringBuilder();
            builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
            builder.append("top.$.messager.confirm('信息提示','页面过期，请重新登录！',function(event){top.location.href=\"" +request.getContextPath()+"/index\""+ "});");
            builder.append("</script>");
            out.print(builder.toString());
            out.close();
            return false;
        }
    }
}
