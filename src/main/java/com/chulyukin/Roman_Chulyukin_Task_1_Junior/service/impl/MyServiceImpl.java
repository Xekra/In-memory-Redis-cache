package com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.impl;

import com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys.MapCache;
import com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MyServiceImpl implements MyService {

    @Autowired

    MapCache mapCache = new MapCache();

    @Override
    public Map<String, Object> getMapFromService() {
        return mapCache.getCache();
    }

    @Override
    public void setKeyValue(String key, Object value) {
        mapCache.add(key, value);
        //simpleCache.put(key,value);
    }

    @Override
    public void deleteObject(String key) {
        mapCache.remove(key);
    }

    @Override
    public Object valueByKey(String key) {
        return mapCache.get(key);
        //return simpleCache.get(key);
    }

    @Override
    public List<String> keysByPattern(String pattern) {
        return mapCache.listOfKeys(pattern);
    }
}
