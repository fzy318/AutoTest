package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



/*
* 套件测试：套件配置类
* */

public class SuiteConfig {
//    @Test
//    public void testSuiteConfig1(){
//        System.out.println("这是testSuiteConfig1");
//    }
//    @Test
//    public void testSuiteConfig2(){
//        System.out.println("这是testSuiteConfig2");
//    }

    @BeforeSuite
    public void beforeSuite(){ System.out.println("before suite运行啦"); }

    @AfterSuite
    public void afterSuite(){ System.out.println("after suite运行啦"); }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 运行成功了");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 运行成功了");
    }
}
