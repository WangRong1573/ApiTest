package com.IO;

/**
 * @author rong.wang
 * @date 22:30  2019/10/30
 *
 * 1.抽象组件：需要装饰的抽象对象（接口或者抽象父类）
 * 2.具体组件：需要装饰的对象
 * 3.抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * 4.具体装饰类：被装饰的对象
 */
public class Decorate02 {
    public static void main(String[] args) {
        Drink coffee=new Coffee();
        Drink sugar=new Sugar(coffee);
        System.out.println(sugar.info()+"-->"+sugar.cost());

        Drink milk=new Milk(coffee);
        System.out.println(milk.info()+"-->"+milk.cost());

        milk=new Milk(sugar);
        System.out.println(milk.info()+"-->"+milk.cost());
    }
}
//抽象组件
interface Drink{
    double cost();//费用
    String info();//说明
}
//具体组件
class Coffee implements Drink{

    private String name="原味咖啡";
    public double cost() {
        return 15;
    }

    public String info() {
        return name;
    }
}
abstract class Decorate2 implements Drink{

    //对抽象组件的引用
    private Drink drink;

    public Decorate2(Drink drink) {
        this.drink = drink;
    }

    public double cost() {
        return this.drink.cost();
    }

    public String info() {
        return this.drink.info();
    }
}
//具体装饰类
class Milk extends Decorate2 {


    public Milk(Drink drink) {
        super(drink);
    }

    public double cost() {
        return super.cost()*4;
    }

    public String info() {
        return super.info()+"加入了牛奶";
    }
}
//具体装饰类
class Sugar extends Decorate2 {

    public Sugar(Drink drink) {
        super(drink);
    }

    public double cost() {
        return super.cost()*2;
    }

    public String info() {
        return super.info()+"加入了蔗糖";
    }
}