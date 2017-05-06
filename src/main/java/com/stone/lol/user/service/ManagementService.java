package com.stone.lol.user.service;

import com.stone.lol.user.entity.po.User;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 15:20
 */
public interface ManagementService {
    void add(User user);

    void remove(String id);

    void update(User user);

    User getByUsername(String username);

    void getList();
}
