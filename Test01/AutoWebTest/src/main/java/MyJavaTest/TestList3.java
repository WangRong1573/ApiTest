package MyJavaTest;

import java.util.ArrayList;
import java.util.List;

/**
 * List的常用实现类为ArrayList，LinkedList，vector
 */
public class TestList3 {
    public static void main(String[] args) {

        test03();
    }
    public static void test03(){
        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2,"rong"); //在指定位置插入字符串
        System.out.println(list);

        list.remove(2);//删除指定索引位置的元素
        System.out.println(list);

        list.set(2,"wang"); //将指定位置元素设置为
        System.out.println(list);

        System.out.println(list.get(2)); //获取指定索引位置的元素

        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list.indexOf("B")); //返回元素第一次出现时的索引位置，找不到则返回-1
        System.out.println(list.indexOf("SSSDF"));  //返回-1

        System.out.println(list.lastIndexOf("B")); //返回元素最后一次出现的索引位置，找不到则返回-1
        System.out.println(list.lastIndexOf("ddd")); // 返回-1



    }
}
