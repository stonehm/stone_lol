package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 16:03
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String add(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user.getId();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User getByUsername() {
        return null;
    }

    @Override
    public List<User> getList() {
        return null;
    }
}
