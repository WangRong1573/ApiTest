package MyJavaTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作多个list，取交集和并集操作
 */
public class TestList2 {
    public static void main(String[] args) {
        test02();
    }

    public static void test02(){
        List<String> list01=new ArrayList<String>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02=new ArrayList<String>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println(list01);

//        list01.addAll(list02);//取并集
//        System.out.println(list01);

//        list01.removeAll(list02); //删掉两个集合相同的元素
//        System.out.println(list01);

//        list01.retainAll(list02); //取交集
//        System.out.println(list01);

        System.out.println(list01.containsAll(list02)); //是否包含后者集合所有的元素
    }
}
