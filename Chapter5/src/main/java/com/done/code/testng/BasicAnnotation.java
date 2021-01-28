package com.done.code.testng;

import org.testng.annotations.*;

//基础的注解
public class BasicAnnotation {
    //
    @Test
    public void testCase1(){
        System.out.println("第一个testng测试1。");
    }
    @Test
    public void testCase2(){
        System.out.println("第一个testng测试2。");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在每个测试方法之前运行。");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod在每个测试方法之后。");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass在类执行之前执行。");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass在类运行之后执行。");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
