package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String add(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user.getId();
    }

    @Override
    public void delete(String id) {
        User user = new User();
        user.setId(id);
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public User getByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        List list = session.createCriteria(User.class).add(Restrictions.eq("username", username)).list();
        return list.size() > 0 ? (User) list.get(0) : null;
    }

    @Override
    public List<User> getList() {
        return null;
    }
}
