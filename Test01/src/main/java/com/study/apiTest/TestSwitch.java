package com.study.apiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 淘宝登录
 */
public class TestSwitch {

    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testSwitchWindow() {
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("淘宝");
        driver.findElement(By.id("su")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        pause(5);
        String oldWindowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("淘宝网 - 淘!我喜欢")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!oldWindowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("登录")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String newWindow:windowHandles1) {
            if (!windowHandle.equals(newWindow)){
                driver.switchTo().window(newWindow);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.linkText("密码登录")).click();
        driver.findElement(By.id("TPL_username_1")).sendKeys("UserName");
        driver.findElement(By.id("TPL_password_1")).sendKeys("TPL_password_1");
        driver.findElement(By.id("J_SubmitStatic")).click();

    }
    public void pause(int i){
        try {
            Thread.sleep(100*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
