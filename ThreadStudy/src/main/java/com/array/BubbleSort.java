package com.array;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author rong.wang
 * @date 21:54  2019/12/19
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        //中间变量
        int temp;

        for (int i = 0; i <values.length-1 ; i++) {
            //标志位，为true则代表未发生交换，数组已经是有序
            boolean flag=true;

            for (int j = 0; j <values.length-1-i ; j++) {
                if (values[j]>values[j+1]){
                    temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
            //循环结束打印数组的值
            System.out.println(Arrays.toString(values));
        }
    }
}
