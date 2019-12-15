package com.study;

/**
 * 封装的使用
 * 1.属性私有
 * 2.通过set和get方法
 * @author rong.wang
 * @date 21:36  2019/12/15
 */
public class TestFengZhuang {
    private String name;
    private int age;
    private boolean man;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1&&age<=130){
            this.age = age;
        }else {
            System.out.println("请输入正确的年龄");
        }
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
