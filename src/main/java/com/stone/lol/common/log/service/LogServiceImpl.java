package com.stone.lol.common.log.service;

import com.stone.lol.common.log.entity.po.Log;
import com.stone.lol.user.entity.po.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class LogServiceImpl implements LogService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addLog(User user, String msg) {
        Session session = sessionFactory.getCurrentSession();
        Log log = new Log();
        log.setUsername(user.getUsername());
        log.setTime(new Date());
        log.setDetails(msg);
        session.save(log);
    }
}
