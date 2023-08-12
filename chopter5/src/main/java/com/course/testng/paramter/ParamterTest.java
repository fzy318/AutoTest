package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * TestNG参数化传参-用xml文件传参方式
 * */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void registerTest(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
}
