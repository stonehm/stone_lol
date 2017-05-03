package com.stone.lol.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Lenovo on 2017/5/3.
 */
@Service
public class LogServiceImpl implements LogService {
    private static final Logger logger = LoggerFactory.getLogger(LogService.class);

    @Override
    public void addLog(String msg) {
        logger.info("msg={}", msg);
    }
}
