package com.pagefactory.demo;

import org.testng.Assert;

/**
 * @author rong.wang
 * @date 22:04  2019/10/21
 *
 * 操作步骤，业务层
 */
public class LoginStep {
    public void loginStep(String userName,String password,String excpted){
        BasePage basePage=new BasePage();
        basePage.open();
        ElementPage element=basePage.elementPage();
        element.Btn();
        basePage.goIframe();
        element.sendUserName(userName);
        element.sendPassword(password);
        element.login();
        String errMsg = element.getErrMsg();
        Assert.assertEquals(errMsg,excpted);
    }

}
