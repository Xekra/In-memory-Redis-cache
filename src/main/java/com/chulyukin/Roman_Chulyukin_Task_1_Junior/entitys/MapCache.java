package com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

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
                .filter(x -> x.contentEquals(pattern))
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
