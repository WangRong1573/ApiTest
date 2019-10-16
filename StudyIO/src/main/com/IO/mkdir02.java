package com.IO;

/**
 * 递归的复习
 * 能用循环的优先使用循环，因为递归比较占用内存
 * 递归头：何时结束递归
 * 递归体：重复调用
 */
public class mkdir02 {
    public static void main(String[] args) {
        printTen(1);
    }
    public static void printTen(int n){
        if (n>10){
            return;
        }
        System.out.println(n);
        printTen(n+1);//方法调用自己
    }
}
