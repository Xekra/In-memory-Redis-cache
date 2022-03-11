package com.chulyukin.Roman_Chulyukin_Task_1_Junior.controller;


import com.chulyukin.Roman_Chulyukin_Task_1_Junior.dialect.MyDialect;
import com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys.CacheObject;

import com.chulyukin.Roman_Chulyukin_Task_1_Junior.entitys.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class MyController {

    @Autowired
    MyDialect myDialect;

    @PostMapping("/operation")
    public ResponseEntity<Void> determineParametrs(@RequestBody Operation operation) {

        if (operation.getCommandName().equalsIgnoreCase("SET")) {
            System.out.println("Select method  " + operation.getCommandName() + " " + operation.getCacheObject().getKey()
                                + " " + operation.getCacheObject().getValue());
            methodSET(operation.getCacheObject());
            return ResponseEntity.ok().build();
        }
        if (operation.getCommandName().equalsIgnoreCase("GET")) {
            System.out.println("Select method  " + operation.getCommandName() + " " + operation.getCacheObject().getKey());

            System.out.println(methodGETByKey(operation.getCacheObject().getKey()));
            return ResponseEntity.ok().build();
        }
        if (operation.getCommandName().equalsIgnoreCase("DELETE")) {
            System.out.println(methodDEL(operation.getCacheObject().getKey()));
        }
        if (operation.getCommandName().equalsIgnoreCase("KEYS")) {
            List<String> listKeys = myDialect.keysByPattern(operation.getPattern());
            System.out.println(listKeys);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping()
    public Map<String, Object>  methodGETAll() {
        return myDialect.getMapData();
    }


    public Object methodGETByKey(String key) {
        return myDialect.valueByKey(key);
    }


    public String methodSET(CacheObject cacheObject) {
        if (cacheObject.getKey() == null) {
            return "Object is null";
        } else {
            myDialect.setKeyValue(cacheObject.getKey(), cacheObject.getValue());
            return "ok";

        }
    }

    public String methodDEL(String key) {
        myDialect.deleteObject(key);
        return "DELETE";
    }

}
