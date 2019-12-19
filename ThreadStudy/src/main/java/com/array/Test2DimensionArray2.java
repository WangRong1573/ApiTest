package com.array;

import java.util.Arrays;

/**
 * 二维数组定义表格数据
 * @author rong.wang
 * @date 21:32  2019/12/19
 */
public class Test2DimensionArray2 {
    public static void main(String[] args) {
        //先定义一维数组
        Object[] temp1={1001,"张三",18,"学生","2015-10-10"};
        Object[] temp2={1005,"赵四",40,"老师","2014-08-10"};
        Object[] temp3={2016,"王五",16,"学生","2019-10-10"};

        //定义一个二维数组将一维数组作为值放入二维数组中
        Object[][] temp=new Object[3][];
        temp[0]=temp1;
        temp[1]=temp2;
        temp[2]=temp3;

        //数组的遍历
        for (Object[] ob:temp
             ) {
            System.out.println(Arrays.toString(ob));
        }

    }
}
