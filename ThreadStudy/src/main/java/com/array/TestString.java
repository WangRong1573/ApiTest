package com.array;

/**
 * String类常用方法
 * @author rong.wang
 * @date 20:34  2019/12/22
 */
public class TestString {
    public static void main(String[] args) {
        String s1="java core";
        String s2="Java core";
        String s3=new String("java core");
        String s4="java"+"core";

        System.out.println(s1.length());//字符串长度
        System.out.println(s1.charAt(2));//返回索引的值
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写
        System.out.println(s1.substring(1,6));//截取
        System.out.println(s1.indexOf("c"));//返回元素的索引
        System.out.println(s1.startsWith("j"));
        System.out.println(s1.trim());//作用是去掉字符串  两端 的多余的空格,注意
    }
}
