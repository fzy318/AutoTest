package com.course.testng;
import org.testng.annotations.*;


public class BasicAnootation {
    //最基本的注解 用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行的方法");
    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("BeforeMethod这是测试方法执行之前运行的方法");
    }

    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod这是测试方法执行之后运行的方法");
    }


}
