package com.chulyukin.Roman_Chulyukin_Task_1_Junior;

import com.chulyukin.Roman_Chulyukin_Task_1_Junior.service.impl.MyServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
* Первый раз пишу тесты для задачи. Добавил ради эксперемента*/

public class MyServiceImplTests {

    private MyServiceImpl myService = new MyServiceImpl();


    @Before
    public void before() {
        System.out.println("Code executes before each test method");
        myService.setKeyValue("Natasha", 25);
        myService.setKeyValue("Roman", "Chulyukin");
        myService.setKeyValue("Vasya", 31);
        myService.setKeyValue("12_32", "Klik");
    }

    //Тестирование на добавление объекта в БД
    @Test
    public void whenAddNewCacheObjectThenReturnMapWithNewCacheObject() {

        assertThat(myService.getMapFromService().size(), is(4));
        myService.setKeyValue("Sasha", 23);
        assertThat(myService.getMapFromService().size(), is(5));

    }

    //Тестирование на удаление объекта в БД
    @Test
    public void whenRemoveCacheObjectThenRemoveCacheObjectByName() {
        myService.deleteObject("Vasya");
        assertThat(myService.getMapFromService().size(), is(3));
    }

    @After
    public void afterMethod() {
        System.out.println("Code executes after each test method");
    }
}
