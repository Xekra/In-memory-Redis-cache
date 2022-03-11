package com.chulyukin.Roman_Chulyukin_Task_1_Junior.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface MyService {

    Map<String, Object> getMapFromService();

    void setKeyValue(String key, Object value);

    void deleteObject(String key);

    Object valueByKey(String key);

    List<String> keysByPattern(String pattern);
}
