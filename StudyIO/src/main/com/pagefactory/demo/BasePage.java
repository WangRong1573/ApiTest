package com.pagefactory.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:48  2019/10/21
 *
 * 抽离driver对象
 */
public class BasePage {

    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public BasePage(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * 打开页面
     */
    public void open(){
        driver.get("https://mail.163.com/");
    }

    /**
     * 进入Iframe
     */
    public void goIframe(){
        driver.switchTo().frame(0);
    }

    /**
     * 关闭页面
     */
    public void close(){
        driver.quit();
    }

    public ElementPage elementPage(){
        ElementPage elementPage=new ElementPage();
        return elementPage;
    }
}
