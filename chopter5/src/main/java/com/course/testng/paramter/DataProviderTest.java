package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void providerParamTest(String name,int age){
        System.out.println("测试第二种传参方式：name="+name+" ;age="+age);

    }

    @DataProvider(name = "data")
    public Object [][]providerData(){
        Object[][] o= new Object[][]{
                {"zhangsan",18},
                {"lisi",25},
                {"wangwu",30}
        };
        return o;
    }

    /**
     * 以下是通过方法名传递参数，使不同的方法传递的参数不一样
     * */

    @Test(dataProvider = "paramMethod")
    public void paramMethod1(String name,int age){
        System.out.println("这是paramMethod1方法的name="+name+"；age="+age);
    }
    @Test(dataProvider = "paramMethod")
    public void paramMethod2(String name,int age){
        System.out.println("这是paramMethod2方法的name="+name+";age="+age);
    }
    @DataProvider(name = "paramMethod")
    public Object [][] provideData(Method method){
        Object [][] result = null;
        if(method.getName().equals("paramMethod1")) {
            result = new Object[][]{
                    {"张三疯", 100},
                    {"林胡冲", 20},
                    {"胡汉三", 2}
            };
            }else if (method.getName().equals("paramMethod2")) {
                result = new Object[][]{
                        {"张wang", 60},
                        {"lizhao", 30},
                        {"胡三", 8}
                };

            }
        return result;
        }
}
