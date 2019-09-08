package MyJavaTest;

import java.util.Arrays;

/**
 * 数组的拷贝（删除也是拷贝的一种实现方式）
 */
public class TestArrayCopy {
    public static void main(String[] args) {
//        testDelete();
        String[] str={"阿里","京东","淘宝","百度","亚马逊","上海"};
        testDelete2(str,2);
//        String[] s1={"aa","bb","cc","dd","ee","ff"};
//        String[] s2=new String[8];
//        //1.从哪个数组对象拷贝
//        //2.从数组对象的哪个索引位置开始拷贝
//        //3.拷贝到哪个数组对象
//        //4.拷贝到数组对象的哪个索引位置，从哪个索引开始
//        //5.拷贝的长度
//        System.arraycopy(s1,2,s2,1,2);
//        //输出结果为：[null, cc, dd, null, null, null, null, null]
//        System.out.println(Arrays.toString(s2));
    }
    //删除数组元素
//    public static void testDelete(){
//        String[] s1={"aa","bb","cc","dd","ee","ff"};
////        String[] s2=new String[8];
//        //1.从哪个数组对象拷贝
//        //2.从数组对象的哪个索引位置开始拷贝
//        //3.拷贝到哪个数组对象
//        //4.拷贝到数组对象的哪个索引位置，从哪个索引开始
//        //5.拷贝的长度
//        System.arraycopy(s1,3,s1,3-1,s1.length-3);
//        s1[s1.length-1]=null;
//        for (int i=0;i<s1.length;i++) {
//            System.out.print(s1[i]+"\t");
//        }
//    }
    //删除数组中指定索引位置的元素，并将元素返回（删除方法的封装）
    //备注：数组拷贝的方法的index，是指数组中从数组对象哪个索引开始拷贝，而非要删除的元素的索引。如例子中要删除京东索引值为1，则从淘宝索引值为2开始拷贝，
    //所以index的值应为淘宝的索引值2
    public static String[] testDelete2(String[] s,int index){
//        String[] s2=new String[8];
        //1.从哪个数组对象拷贝
        //2.从数组对象的哪个索引位置开始拷贝
        //3.拷贝到哪个数组对象
        //4.拷贝到数组对象的哪个索引位置，从哪个索引开始
        //5.拷贝的长度
        System.arraycopy(s,index,s,index-1,s.length-index);
        s[s.length-1]=null;
        for (int i=0;i<s.length;i++) {
            System.out.print(s[i]+"\t");
        }
        return s;
    }


}
