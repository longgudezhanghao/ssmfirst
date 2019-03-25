package com.dzf.interceptors;

import com.dzf.pojo.People;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SessionInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = Logger.getLogger(SessionInterceptor.class);

//    检查当前会话是否有people，如果有，放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object people = request.getSession().getAttribute("SESSION_PEOPLE");
        if(people == null){
            LOGGER.warn("NO");
            return false;
        }

        if(people instanceof People){
//            可以再去数据库中查一次确认是否有
            People people1 = (People)people;
            people1.setPassword(null);
            request.getSession().setAttribute("SESSION_PEOPLE",people1);
            LOGGER.info(people1.getName()+"Ok");
            return true;
        }else{
            LOGGER.warn("CAO");
            return false;
        }
    }
}
