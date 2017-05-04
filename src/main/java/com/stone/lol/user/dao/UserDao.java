package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.User;

import java.util.List;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 16:01
 */
public interface UserDao {
    String add(User user);

    void delete(String id);

    void update(User user);

    User getByUsername();

    List<User> getList();
}
