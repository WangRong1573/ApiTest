package MyJavaTest;

import java.util.Arrays;

/**
 * 二分法查找
 */
public class Test2fen {
    public static void main(String[] args) {
        int[] a={3,1,2,4,7,6,5,9,8,0};
        int value=5;
        Arrays.sort(a);
        System.out.println(value+"元素的索引为："+test2fen(a,value));

    }
    public static int test2fen(int[] a,int value){
        int low=0;
        int high=a.length-1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (value == a[mid]) {
                return mid;
            }
            if (value > a[mid]) {
                low = mid + 1;
            }
            if ((value < a[mid])) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
