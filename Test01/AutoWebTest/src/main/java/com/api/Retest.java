package com.api;

import org.testng.annotations.*;

/**
 * 对BeforeSuit,BeforeClass,BeforeMethod,BeforeTest,test等的注解的执行书序的复习
 */
public class Retest {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit执行了");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass执行了");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod执行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest执行了");
    }
    @Test
    public void test(){
        System.out.println("test执行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest执行了");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod执行了");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass执行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite执行了");
    }
}
