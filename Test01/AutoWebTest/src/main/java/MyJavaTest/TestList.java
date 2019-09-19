package MyJavaTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 学习collection接口中的方法
 * collection有两个子类，Set和List，List的实现类是ArrayList
 */
public class TestList {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        System.out.println(collection.size());

        System.out.println(collection.isEmpty());

        collection.add("第一个");
        collection.add("第二");
        collection.add("three");
        System.out.println(collection.toString());//默认会调用tostring方法

        //是否包含某个元素
        boolean flag=collection.contains("four");
        System.out.println(flag);

        //转化成object数组
        Object [] objs=collection.toArray();
        System.out.println(objs);

        collection.remove("第二");//只是从容器中移除，并没有删除对象
        System.out.println(collection);

        collection.clear(); //移除所有的元素
        System.out.println(collection.size());


    }
}
