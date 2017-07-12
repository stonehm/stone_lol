package com.stone.lol.user.service;


import com.stone.lol.user.entity.po.Dictionary;

import java.util.List;

public interface DictionaryService {
    boolean add(Dictionary dictionary);

    void remove(String id);

    void update(Dictionary dictionary);

    List getDictionaryByParent(String parentId);

}
