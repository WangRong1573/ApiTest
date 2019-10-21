package com.pagefactory.demo;

/**
 * @author rong.wang
 * @date 22:09  2019/10/21
 */
public class Test {
    @org.testng.annotations.Test
    public void test(){
        LoginStep loginStep=new LoginStep();
        loginStep.loginStep("1111","322222","请先进行验证");
    }
}
