package com.done.code.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite执行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite执行");
    }
    @BeforeTest
    public void berforTest(){
        System.out.println("beforTest执行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest执行");
    }
}
