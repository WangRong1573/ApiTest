package MyJavaTest;

import java.util.Arrays;

/**
 * 数组的扩容（实现过程：定义一个更大的数组，将原数组原封不动的拷贝到新数组中）
 */
public class TestArrayCopy2 {
    public static void main(String[] args) {
        String[] str={"aa","bb","cc"};
        testArrayCopy(str);
    }
    public static String[] testArrayCopy(String[] s1){
//        String[] s1={"aa","bb","cc"};
        String[] s2=new String[s1.length+10];
        System.arraycopy(s1,0,s2,3,s1.length);
        System.out.println(Arrays.toString(s2));
        return s2;
    }
}
