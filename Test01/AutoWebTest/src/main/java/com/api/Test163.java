package com.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 模拟百度输入163，打开163邮箱界面，并实现账号密码的输入与登录操作
 */

public class Test163 {
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
    public void test163(){
        sleep(2);
        driver.findElement(By.id("kw")).sendKeys("163");
        driver.findElement(By.id("su")).click();
        String oldWindowHandle = driver.getWindowHandle();
        sleep(2);
        driver.findElement(By.linkText("163网易免费邮箱官方登录")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!oldWindowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        sleep(2);
        driver.findElement(By.cssSelector("#switchAccountLogin")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("1257542@qq.com");
        sleep(1);
        driver.findElement(By.name("password")).sendKeys("2124545");
        sleep(1);
        driver.findElement(By.id("dologin")).click();
    }
    public void sleep(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
