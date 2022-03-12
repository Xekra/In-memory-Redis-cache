package com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys;
/*
* Создал класс, чтобы хранить пару ключ значение
*/
public class CacheObject {

    private String key;
    private String value;

    public CacheObject(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
