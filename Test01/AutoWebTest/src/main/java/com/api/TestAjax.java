package com.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Ajax操作练习
 */
public class TestAjax {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.hao123.com/?tn=91003609_hao_pg");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testAjax(){
        String oldWindowHandle = driver.getWindowHandle();
        driver.findElement(By.name("word")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("[data-query] b"));
        pause(2);
        for (WebElement w:elements) {
            System.out.println(w.getText());
            if (w.getText().equals("易烊千玺参加军训")){
                w.click();
            }
        }
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows:windowHandles) {
            if (!oldWindowHandle.equals(windows)) {
                driver.switchTo().window(windows);
                break;
            }else {
                driver.close();
            }
        }
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("易烊千玺参加军训 当年的吴磊和昊然弟弟军训也撩倒一片_Y..._北青网")).click();
        pause(2);
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String win:windowHandles1) {
            if (!windowHandle.equals(win)){
                driver.switchTo().window(win);
                break;
            }else {
                driver.close();
            }
        }
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

