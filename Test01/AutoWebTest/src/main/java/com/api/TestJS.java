package com.api;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * api JS
 */
public class TestJS {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testJS(){
        JavascriptExecutor JS= (JavascriptExecutor) driver;
        JS.executeScript("document.getElementById('su').setAttribute('value', 'submit');");
    }
}
