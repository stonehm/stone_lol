package com.stone.lol.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * User: 孙皓亮
 * Date: 2017/5/5
 * Time: 9:26
 */
public class SessionListener implements HttpSessionListener {

    private static final Logger logger = LoggerFactory.getLogger(SessionListener.class);

    public SessionListener() {
    }

    public void sessionCreated(HttpSessionEvent se) {
        logger.info("sessionCreated[id={}]", se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("sessionDestroyed[id={}]", se.getSession().getId());
    }

}
