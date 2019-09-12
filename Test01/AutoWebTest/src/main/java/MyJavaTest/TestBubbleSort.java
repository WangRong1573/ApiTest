package MyJavaTest;

import java.util.Arrays;

/**
 * 冒泡排序练习
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,7,6,5,9,8,0};
        testBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void testBubbleSort(int[] arr){
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flag=true;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
        }
    }
}
