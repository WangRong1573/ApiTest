package com.array;

import java.util.Arrays;

/**
 * 二维数组的定义和遍历
 * @author rong.wang
 * @date 21:27  2019/12/19
 */
public class Test2DimensionArray {
    public static void main(String[] args) {
        //需要定义一维数组的length
        int[][] arr=new int[3][];
        arr[0]=new int[]{20,50};
        arr[1]=new int[]{30,50,70,60};
        arr[2]=new int[]{20,80,6};

        System.out.println(arr[1][2]);

        for (int[] a:arr
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
}
