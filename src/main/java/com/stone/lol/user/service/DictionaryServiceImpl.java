package com.stone.lol.user.service;

import com.stone.lol.user.dao.DictionaryDao;
import com.stone.lol.user.entity.po.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 数据字典Service类
 * Created by stone on 2017/6/10.
 */
@Service
@Transactional
public class DictionaryServiceImpl implements DictionaryService {
    private final DictionaryDao dictionaryDao;

    @Autowired
    public DictionaryServiceImpl(DictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }

    @Override
    public boolean add(Dictionary dictionary) {
        dictionaryDao.add(dictionary);
        return true;
    }

    @Override
    public void remove(String id) {
        dictionaryDao.remove(id);
    }

    @Override
    public void update(Dictionary dictionary) {
        dictionaryDao.update(dictionary);
    }

    @Override
    public List getDictionaryByParent(String parentId) {
        return dictionaryDao.getDictionaryByParent(parentId);
    }


}
