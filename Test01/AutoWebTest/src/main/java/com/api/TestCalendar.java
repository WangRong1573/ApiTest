package com.api;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * 日历控件操作api
 */
public class TestCalendar {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://trains.ctrip.com/TrainBooking/Search.aspx?day=2&fromCn=%E4%B8%8A%E6%B5%B7&toCn=%E5%95%86%E4%B8%98&mkt_header=bdkx&allianceID=949992&sid=1566142&from=shanghai&to=shangqiu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    //第一种方法
    @Test
    public void testCalendar(){
        driver.findElement(By.id("notice01")).clear();
        driver.findElement(By.id("notice01")).sendKeys("南京");
        pause(1);
        driver.findElement(By.id("notice08")).clear();
        driver.findElement(By.id("notice08")).sendKeys("上海");
        pause(1);
        driver.findElement(By.id("dateObj")).clear();
        driver.findElement(By.id("dateObj")).sendKeys("2019-09-30");
        pause(1);
        driver.findElement(By.id("returnDateObj")).clear();
        driver.findElement(By.id("returnDateObj")).sendKeys("2019-10-07");
        pause(1);
        driver.findElement(By.className("blueBtn")).click();
        pause(3);
    }
    //第二种方法，使用JS(因测试界面无readonly属性，故此场景无法测试)
//    @Test
//    public void testCalendar2(){
//        String jsstr="document.getElementById('date').removeAttribute('readonly');";
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript(jsstr);
//        driver.findElement(By.id("dateObj")).clear();
//        driver.findElement(By.id("dateObj")).sendKeys("2019-09-30");
//        pause(1);
//        driver.findElement(By.id("returnDateObj")).clear();
//        driver.findElement(By.id("returnDateObj")).sendKeys("2019-10-07");
//        pause(1);
//        driver.findElement(By.className("blueBtn")).click();
//        pause(3);
//    }
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
