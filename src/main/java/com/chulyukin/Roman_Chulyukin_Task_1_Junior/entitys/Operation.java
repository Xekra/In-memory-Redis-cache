package com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys;

public class Operation {
    String commandName;
    CacheObject cacheObject;
    String pattern;

    public Operation(String commandName, CacheObject cacheObject, String pattern) {
        this.commandName = commandName;
        this.cacheObject = cacheObject;
        this.pattern = pattern;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public CacheObject getCacheObject() {
        return cacheObject;
    }

    public void setCacheObject(CacheObject cacheObject) {
        this.cacheObject = cacheObject;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
