package com.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * api练习：
 * 实现从百度输入框输入refain 博客园，点击搜索，获取linktext元素，点击进入博客园，判断第一个文章是否可点击，点击
 * @author rong.wang
 */
public class testActions1 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testWindowSwitch(){
        //定位百度输入框
        driver.findElement(By.id("kw")).sendKeys("refain 博客园");
        //定位搜索按钮并点击搜索
        driver.findElement(By.id("su")).click();
        //      对页面所有标题进行遍历，如果当前句柄不等于上一界面句柄，则切换至当前界面
        String oldWindowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("Refain - 博客园")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String newWindow:windowHandles) {
//            if (!oldWindowHandle.equals(newWindow)){
//                driver.switchTo().window(newWindow);
//                break;
//            }
            //第二种实现方式：直接切换到当前窗口，获取页面的标题，根据标题是否相等开判断
            driver.switchTo().window(newWindow);
            String title = driver.getTitle();
            if (title.equals("Refain - 博客园")){
                break;
            }
            //第三种实现方法：用contains关键字
            driver.switchTo().window(newWindow);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Selenium+java - Page Object设计模式")){
                break;
            }
        }
        String title1 = driver.getTitle();
        driver.findElement(By.linkText("Selenium+java - PageFactory设计模式")).click();
        sleep(2);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
    public void sleep(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
