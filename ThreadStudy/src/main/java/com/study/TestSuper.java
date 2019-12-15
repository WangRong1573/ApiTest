package com.study;

/**
 * 面向对象学习：构造方法，super父类引用，继承树的追溯学习
 *
 * super（）； 总是位于构造方法的第一句
 * @author rong.wang
 * @date 20:17  2019/12/15
 */
public class TestSuper {
    public static void main(String[] args) {

        new ChildClass();
    }
}

class FatherClass{
    public FatherClass(){
        //super();
        System.out.println("创建父类对象");
    }
}

class ChildClass extends FatherClass{
    public ChildClass(){
        //super();
        System.out.println("创建子类对象");
    }
}