package com.chulyukin.Roman_Chulyukin_Task_1_Junior.dialect;

import com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
/* Нет пока полного понимания работы SpringBoot приложения.
   Создал этот класс для взаимодействия сервиса с контроллером. Возможно мог бы обойтись без него.*/
@Component
public class MyDialect {

    @Autowired
    MyService myService;

    public Map<String, Object> getMapData() {
        return myService.getMapFromService();
    }

    public void setKeyValue(String key, Object value) {
        myService.setKeyValue(key, value);
    }

    public void deleteObject(String key) {
        myService.deleteObject(key);
    }

    public Object valueByKey(String key) {
        return myService.valueByKey(key);
    }

    public List<String> keysByPattern(String pattern) {
        return myService.keysByPattern(pattern);
    }
}
