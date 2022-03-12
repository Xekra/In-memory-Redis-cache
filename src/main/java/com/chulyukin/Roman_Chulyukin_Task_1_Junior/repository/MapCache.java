package com.chulyukin.Roman_Chulyukin_Task_1_Junior.repository;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;
/*
Данный класс является хранилищем ключ значение.
Хотел реализовать его как LRU Cache, но не получилось и сделал простой HashMap.
*/
@Repository
public class MapCache {

    private final Map<String, Object> cache = new HashMap<>();

    public MapCache() {
    }

    public Map<String, Object> getCache() {
        return cache;
    }

    public void add(String key, Object value) {
        if (key == null) {
            return;
        }
        if (value == null) {
            cache.remove(key);
        } else {
            cache.put(key, value);
        }
    }

    public List<String> listOfKeys(String pattern) {
        return cache.keySet().stream()
                .filter(x -> x.contains(pattern))
                .collect(Collectors.toList());
    }


    public void remove(String key) {
        cache.remove(key);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }

}
