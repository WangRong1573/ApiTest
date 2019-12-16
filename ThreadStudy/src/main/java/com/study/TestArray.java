package com.study;

/**
 * 数组,数组的赋值及foreach增强for循环遍历数组
 * 2.toString方法的重写
 * @author rong.wang
 * @date 21:43  2019/12/16
 */
public class TestArray {
    String[] arr02;

    public static void main(String[] args) {
        User[] users;
        users=new User[5];
        users[0]=new User("xiaoming",1008,18);
        users[1]=new User("张三",10022,30);
        users[2]=new User("李四",32685,24);
        users[3]=new User("王五",5787,16);
        users[4]=new User("赵柳",588,34);

        int [] arr01=new int[6];

        //for循环实现为数组赋值
        for (int i = 0; i <arr01.length ; i++) {
            arr01[i]=i*10;
        }
        //for循环遍历数组打印数组中的值
        for (int i = 0; i <arr01.length ; i++) {
            System.out.println(arr01[i]);
        }

        for (int i=0;i<users.length;i++){
            System.out.println(users[i]);
        }
        System.out.println("############");

        //增强for循环遍历数组，输出数组的值，一般只用于读取，不用于数组元素的赋值
        for (User u:users) {
            System.out.println(u);
        }

    }

}

class User{
    String name;
    int id;
    int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名为"+name+"的用户id为："+id+"，年龄是："+age;
    }
}