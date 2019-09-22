package com.com.pageObject.demo2;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStep {
    WebDriver driver;

    public LoginStep(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName,String password,String expected){
        LoginPageElement loginPageElement = new LoginPageElement(driver);
        loginPageElement.sendUserName(userName);
        loginPageElement.sendPassWord(password);
        loginPageElement.clickLogin();
        String msg = loginPageElement.getMsg();
        Assert.assertEquals(msg,expected);
    }
}
