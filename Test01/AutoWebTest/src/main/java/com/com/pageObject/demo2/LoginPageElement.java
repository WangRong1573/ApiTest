package com.com.pageObject.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 对象层
 * 获取界面的个元素的对象
 * @author rong.wang
 */
public class LoginPageElement {
    WebDriver driver;

    public static By user_name=By.name("loginname");

    public static By pass_word=By.name("loginpassword");

    public static By login=By.linkText("立即登录");

    public static By errorMsg=By.cssSelector("[class='b-signin-error js-b-signin-error error-2']");

    public LoginPageElement(WebDriver driver) {
        this.driver = driver;
    }

    public void sendUserName(String userName){
        driver.findElement(user_name).clear();
        driver.findElement(user_name).sendKeys(userName);
    }

    public void sendPassWord(String passWord){
        driver.findElement(pass_word).clear();
        driver.findElement(pass_word).sendKeys(passWord);
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }

    public String getMsg(){
        return driver.findElement(errorMsg).getText();
    }
}
