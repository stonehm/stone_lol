package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.Dictionary;

import java.util.List;

/**
 * 数据字典DAO.
 */
public interface DictionaryDao {
    String add(Dictionary dictionary);

    void remove(String id);

    void update(Dictionary dictionary);

    List getDictionaryByParent(String parentId);
}
