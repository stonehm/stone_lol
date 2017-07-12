package com.stone.lol.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: 孙皓亮
 * Date: 2017/5/5
 * Time: 9:36
 */
public class RequestInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);
    private static ThreadLocal<Long> requestTime = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String queryStr = request.getQueryString();
        requestTime.set(System.currentTimeMillis());
        logger.info("{}|{}|{}", request.getSession().getId(), request.getMethod(),
                request.getRequestURL() + (queryStr == null ? "" : "?" + queryStr));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("{}|time|{}|", request.getSession().getId(), System.currentTimeMillis() - requestTime.get());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
