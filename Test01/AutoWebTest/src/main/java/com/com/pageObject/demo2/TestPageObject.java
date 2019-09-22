package com.com.pageObject.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPageObject {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://i.360kan.com/login/?destUrl=http%3A%2F%2Fi.360kan.com%2Fu%2Fhome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    @Test
    public void testPageObject(){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login("1212","sdfssdf","ssssss");
    }
}
