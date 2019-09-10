package com.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * 模拟上传文件操作
 */
public class TestUpload {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///C:/Users/Administrator/Desktop/upload.html");
        driver.manage().window().maximize();
    }
    @Test
    public void testUpload(){
//        //文件上传方法一：声明文件位置的对象，执行sendkey操作
//        String path="C:\\Users\\Administrator\\Desktop\\IMG_6341.jpg";
//        driver.findElement(By.id("upload")).sendKeys(path);

        //使用AutoIt工具生成脚本上传
        driver.findElement(By.id("upload")).click();
        try {
            Runtime.getRuntime().exec("upload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
