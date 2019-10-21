package com.pagefactory.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author rong.wang
 * @date 21:54  2019/10/21
 * 元素对象层
 */
public class ElementPage {
    public ElementPage(){
        PageFactory.initElements(BasePage.driver,this);
    }

    @FindBy(linkText = "密码登录")
    @CacheLookup
    private WebElement loginBtn;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement user_name;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement pass_word;

    @FindBy(id = "dologin")
    @CacheLookup
    private WebElement doLogin;

    @FindBy(className = "ferrorhead")
    @CacheLookup
    private WebElement err;

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getUser_name() {
        return user_name;
    }

    public WebElement getPass_word() {
        return pass_word;
    }

    public WebElement getDoLogin() {
        return doLogin;
    }

    public WebElement getErr() {
        return err;
    }

    public void Btn(){
        loginBtn.click();
    }

    public void sendUserName(String userName){
        user_name.clear();
        user_name.sendKeys(userName);
    }

    public void sendPassword(String password){
        pass_word.clear();
        pass_word.sendKeys(password);
    }

    public void login(){
        doLogin.click();
    }

    public String getErrMsg(){
       return err.getText();
    }
}
