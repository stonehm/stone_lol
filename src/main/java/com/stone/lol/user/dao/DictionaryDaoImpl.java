package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.Dictionary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据字典DAO实现类
 * Created by stone on 2017/6/10.
 */
@Repository
public class DictionaryDaoImpl implements DictionaryDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public DictionaryDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String add(Dictionary dictionary) {
        sessionFactory.getCurrentSession().save(dictionary);
        return dictionary.getId();
    }

    @Override
    public void remove(String id) {
        Dictionary dictionary = new Dictionary();
        dictionary.setId(id);
        sessionFactory.getCurrentSession().delete(dictionary);
    }

    @Override
    public void update(Dictionary dictionary) {
        sessionFactory.getCurrentSession().update(dictionary);
    }

    @Override
    public List getDictionaryByParent(String parentId) {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Dictionary.class).add(Restrictions.eq("parent.id", parentId)).list();
    }
}
