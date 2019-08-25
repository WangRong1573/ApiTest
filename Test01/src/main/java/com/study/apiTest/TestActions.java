package com.study.apiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 鼠标的按下和释放
 * @author rong.wang
 */
public class TestActions {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testActions(){
        driver.get("file:///C:/Users/Administrator/Desktop/MouseDemo.html");
        WebElement mouse = driver.findElement(By.id("mouse"));
        Actions actions = new Actions(driver);
        //鼠标按下
        actions.clickAndHold(mouse).perform();
        //释放
        actions.release(mouse).perform();
        pause(3);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
