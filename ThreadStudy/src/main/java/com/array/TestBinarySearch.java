package com.array;

import java.util.Arrays;

/**
 * 二分法查找
 * @author rong.wang
 * @date 22:14  2019/12/19
 */
public class TestBinarySearch {
    public static void main(String[] args) {

        int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        TestBinarySearch t=new TestBinarySearch();
        System.out.println("元素的索引为"+t.binarySearch(arr,10));
    }

    public int binarySearch(int[] s,int value){
        int low=0;
        int high=s.length-1;

        while (low<high){
            int mid=(low+high)/2;
            if (value==s[mid]){
                return mid;
            }
            if (value>s[mid]){
                low=mid+1;
            }
            if (value<s[mid]){
                high=mid-1;
            }
        }
        return -1;
    }
}
