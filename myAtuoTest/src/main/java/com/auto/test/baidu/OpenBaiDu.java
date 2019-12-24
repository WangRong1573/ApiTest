package com.auto.test.baidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 自动化练习1
 * 打开百度首页
 * @author rong.wang
 * @date 21:36  2019/12/24
 */
public class OpenBaiDu {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        //ceshi000
    }

    @Test
    public void openBaidu(){
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
