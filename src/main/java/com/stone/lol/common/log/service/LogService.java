package com.stone.lol.common.log.service;

import com.stone.lol.user.entity.po.User;

/**
 * Created by Lenovo on 2017/5/3.
 */
public interface LogService {
    void addLog(User user, String msg);
}
