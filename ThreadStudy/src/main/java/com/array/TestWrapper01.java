package com.array;

/**
 * 1.基本数据类型、字符串和Integer对象的互相转化练习
 * 2.自动装箱和自动拆箱
 * @author rong.wang
 * @date 20:18  2019/12/22
 */
public class TestWrapper01 {
    public static void main(String[] args) {
        //基本数据类型转化为Integer对象,两种实现方式一样，推荐使用Integer.ValueOf（）方式
        Integer i1=new Integer(10);
        Integer i2=Integer.valueOf(10);

        //Integer对象转换成基本数据类型
        int num1=i1.intValue();
        double num2=i2.doubleValue();

        //字符串转换成Integer对象
        Integer s1=new Integer("99");
        Integer s2=Integer.parseInt("99");

        //Integer对象转换成字符串
        String s=s1.toString();
    }

    //自动装箱和自动拆箱
    public void test(){
        //自动装箱
        //此处等价于Integer i1=Integer.ValueOf(234);
        Integer i1=234;

        //自动拆箱
        //此处等价于int i=i1.intValue();
        int i=i1;
    }
}
