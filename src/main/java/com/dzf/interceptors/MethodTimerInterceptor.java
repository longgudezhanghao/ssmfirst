package com.dzf.interceptors;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器
public class MethodTimerInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = Logger.getLogger(MethodTimerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Long start = System.currentTimeMillis();
//将器存在请求中
        request.setAttribute("start",start);

        LOGGER.info(request.getRequestURI()+" arrive");
//放回true才会找下一个拦截器
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        Long start = (Long)request.getAttribute("start");

        Long end = System.currentTimeMillis();

        Long spendTime = end -start;

        if(spendTime>=1000){
             LOGGER.warn("nonormal"+spendTime+"haomiao");
        }else{
            LOGGER.info("时间正常"+spendTime+"haomiao");
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
