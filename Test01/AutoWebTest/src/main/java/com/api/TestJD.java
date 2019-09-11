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
 * 模拟京东操作
 */
public class TestJD {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
    }
    @Test
    public void testJD(){
        driver.findElement(By.id("kw")).sendKeys("京东");
        driver.findElement(By.id("su")).click();
         String windowHandle1 = driver.getWindowHandle();
        driver.findElement(By.linkText("京东(JD.COM)-正品低价、品质保障、配送及时、轻松购物!")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String windows:windowHandles1) {
            if (!windowHandle1.equals(windows)){
                driver.switchTo().window(windows);
                break;
            }else {
                driver.close();
            }
        }
        pause(3);
        driver.findElement(By.linkText("登录")).click();
        pause(1);
        driver.findElement(By.linkText("账户登录")).click();
        pause(1);
        driver.findElement(By.id("loginname")).sendKeys("1234586");
        driver.findElement(By.id("nloginpwd")).sendKeys("21545454");
        pause(2);
        driver.findElement(By.linkText("登    录")).click();
    }
    @AfterTest
    public void afterTest(){
        pause(3);
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
