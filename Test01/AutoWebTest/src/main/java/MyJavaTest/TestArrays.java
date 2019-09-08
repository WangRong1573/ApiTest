package MyJavaTest;

import java.util.Arrays;

/**
 * 数组的练习，常用类
 * @author  rong.wang
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] arr1={10,20,30,15,21,1,33,8};
        //获取数组长度
        System.out.println(arr1.length);
        //数组内容
        System.out.println(Arrays.toString(arr1));
        //数组的排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        //二分法查找元素
        System.out.println("元素的索引为："+Arrays.binarySearch(arr1,8));

    }
}
