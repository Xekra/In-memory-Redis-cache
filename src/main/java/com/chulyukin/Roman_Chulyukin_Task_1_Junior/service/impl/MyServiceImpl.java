package com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.impl;

import com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys.MapCacheDemo;
import com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MyServiceImpl implements MyService {

    @Autowired

    MapCacheDemo mapCacheDemo = new MapCacheDemo();

    @Override
    public Map<String, Object> getMapFromService() {
        return mapCacheDemo.getCache();
    }

    @Override
    public void setKeyValue(String key, Object value) {
        mapCacheDemo.add(key, value);
        //simpleCache.put(key,value);
    }

    @Override
    public void deleteObject(String key) {
        mapCacheDemo.remove(key);
    }

    @Override
    public Object valueByKey(String key) {
        return mapCacheDemo.get(key);
        //return simpleCache.get(key);
    }

    @Override
    public List<String> keysByPattern(String pattern) {
        return mapCacheDemo.listOfKeys(pattern);
    }
}
