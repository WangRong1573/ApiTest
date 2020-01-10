package com.imooc.collection_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rong.wang
 * @date 19:40  2020/1/10
 */
public class ListTest {

    //备选课程
    public List coursesToSelect;

    public ListTest(){
        this.coursesToSelect=new ArrayList();
    }

    /**
     * 用于往coursesToSelect集合中添加课程
     */
    public void addCourse(){
        //首先有课程的实例,并通过调用add方法，添加到备选课程list中
        Coures coures1=new Coures(1,"数据结构");
        coursesToSelect.add(coures1);
        //为了验证是否插入到list中，验证
        Coures temp= (Coures) coursesToSelect.get(0);
        System.out.println("添加了课程："+temp.id+":"+temp.name);

        //第二种向list中添加元素的方法,可以指定元素添加的位置，当设定添加元素的索引大于list的长度时，会报索引越界异常
        Coures coures2=new Coures(2,"高等数学");
        coursesToSelect.add(0,coures2);
        //为了验证是否插入到list中，验证
        Coures temp2= (Coures) coursesToSelect.get(0);
        System.out.println("添加了课程："+temp2.id+":"+temp2.name);

        //第三种向list中添加元素的方法
        //创建课程数组
        Coures[] coures={new Coures(3,"离散数学"),new Coures(4,"汇编语言")};
        coursesToSelect.addAll(Arrays.asList(coures));
        //为了验证是否插入到list中，验证
        Coures temp3= (Coures) coursesToSelect.get(2);
        Coures temp4= (Coures) coursesToSelect.get(3);
        System.out.println("添加了课程："+temp3.id+":"+temp3.name+"\t"+temp4.id+":"+temp4.name);

        //第四种向list中添加元素的方法
        //创建课程数组
        Coures[] coures3={new Coures(5,"大学英语"),new Coures(6,"计算机基础")};
        coursesToSelect.addAll(2, Arrays.asList(coures3));
        Coures temp5= (Coures) coursesToSelect.get(2);
        Coures temp6= (Coures) coursesToSelect.get(3);
        System.out.println("添加了课程："+temp5.id+":"+temp5.name+"\t"+temp6.id+":"+temp6.name);
    }

    /**
     * 遍历list中的元素
     */

    //方法1
    public void testGet(){
        int size=coursesToSelect.size();
        System.out.println("可选择的课程有：");
        for (int i = 0; i <size ; i++) {
            Coures cr= (Coures) coursesToSelect.get(i);
            System.out.println("课程："+cr.id+":"+cr.name);
        }
    }
    //方法2  foreach
    public void testForeach(){
        System.out.println("foreach--可选择的课程有：");
        for (Object c:coursesToSelect) {
            Coures cr= (Coures) c;
            System.out.println("课程："+cr.id+":"+cr.name);
        }
    }

    /**
     * 修改list集合中的元素
     * set(index,element);
     */
    public void testModify(){
        coursesToSelect.set(4,new Coures(7,"selenium从入门到入土"));
    }

    //测试
    public static void main(String[] args) {
        ListTest lt=new ListTest();
        lt.addCourse();
        lt.testGet();
        lt.testForeach();
        lt.testModify();
        lt.testForeach();
    }
}
