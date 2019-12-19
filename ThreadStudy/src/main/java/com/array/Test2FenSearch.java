package com.array;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author rong.wang
 * @date 21:37  2019/12/19
 */
public class Test2FenSearch {
    public static void main(String[] args) {
        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        //中间变量
        int temp;
        int count = 0;

        // 外层循环：n个元素排序，则至多需要n-1趟循环
        for (int j = 0; j <values.length-1 ; j++) {

            // 定义一个布尔类型的变量，标记数组是否已达到有序状态
            boolean flag=true;
            /*内层循环：每一趟循环都从数列的前两个元素开始进行比较，比较到无序数组的最后*/
            for (int i = 0; i <values.length-1-j ; i++) {
                // 如果前一个元素大于后一个元素，则交换两元素的值；
                if (values[i]>values[i+1]){
                    temp=values[i];
                    values[i]=values[i+1];
                    values[i+1]=temp;
                    //本趟发生了交换，表明该数组在本趟处于无序状态，需要继续比较；
                    flag=false;
                    count++;
                }
                System.out.println(Arrays.toString(values));
            }
            //根据标记量的值判断数组是否有序，如果有序，则退出；无序，则继续循环。
            if (flag){
                break;
            }
            System.out.println("$######################");
        }
        System.out.println("共循环了"+count+"次");

    }
}
