package com.study;

/**
 * 多态的练习
 * @author rong.wang
 * @date 21:48  2019/12/15
 */
public class TestDuoTai {
    public static void main(String[] args) {
        Animal a=new Animal();
        animalCry(a);

        Cat a2=new Cat();
        animalCry(a2);
    }
    static void animalCry(Animal animal){
        animal.shout();
    }
}

class Animal{
    public void shout(){
        System.out.println("叫了一声。。。");
    }
}

class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("汪汪汪。。。");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵。。。");
    }
}