package com.stone.lol.user.service;

import com.stone.lol.user.dao.UserDao;
import com.stone.lol.user.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 15:23
 */
@Service
@Transactional
public class ManagementServiceImpl implements ManagementService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean add(User user) {
        if (user == null || user.getUsername() == null || user.getPassword() == null || user.getName() == null)
            return false;
        if (getByUsername(user.getUsername()) != null) return false;
        userDao.add(user);
        return true;
    }

    @Override
    public void remove(String id) {
        if (id != null && !"".equals(id))
            userDao.delete(id);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public User getByUsername(String username) {
        if (username == null || "".equals(username))
            return null;
        return userDao.getByUsername(username);
    }

    @Override
    public void getList() {

    }
}
