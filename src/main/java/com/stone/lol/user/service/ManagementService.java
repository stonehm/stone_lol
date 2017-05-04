package com.stone.lol.user.service;

import com.stone.lol.user.entity.po.User;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 15:20
 */
public interface ManagementService {
    void add(User user);

    void remove();

    void update();

    void getByUsername();

    void getList();
}
