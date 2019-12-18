package com.array;

/**
 * 数组的拷贝，删除
 * @author rong.wang
 * @date 22:49  2019/12/18
 */
public class TestArray01 {

    public static void main(String[] args) {
        arrCopy();
        System.out.println();

        String[] s={"java","python","php","javascript","go"};
        removeElement(s,2);
        System.out.println();

        extendArray(s);
    }


    public static void arrCopy(){
        String[] arr01={"java","python","php","javascript","go"};
        String[] arr02=new String[7];
        //native本地方法
        //srcPos表示从src数组的某个索引位置开始拷贝，desPos表示拷贝到目标数组的某个索引位置，arr01.length表示从源数组拷贝的长度
        System.arraycopy(arr01,0,arr02,0,arr01.length);

        for (int i = 0; i <arr02.length ; i++) {
            System.out.print(i+"--"+arr02[i]+"\t");
        }
    }

    //封装实现从数组中删除某个元素
    public static String[] removeElement(String[] s,int index){
        System.arraycopy(s,index,s,index-1,s.length-index);
        s[s.length-1]=null;

        for (int i = 0; i <s.length ; i++) {
            System.out.print(i+"--"+s[i]+"\t");
        }
        return s;
    }

    //数组的扩容，本质上是定义一个更大的数组，将原数组的内容拷贝到新的数组中实现数组的扩容
    public static String[] extendArray(String[] s){
        String[] arr01={"java","python","php","javascript","go"};

        String[] arr02=new String[arr01.length*2];

        System.arraycopy(arr01,0,arr02,0,arr01.length);

        for (int i = 0; i <arr02.length ; i++) {
            System.out.print(i+"--"+arr02[i]+"\t");
        }
        return arr02;
    }
}
