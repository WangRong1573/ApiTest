package com.thread.study;

/**
 * @author rong.wang
 * @date 20:50  2019/11/5
 * 复习多线程的初步认识
 * 1.继承Thread类，重写run方法  子类对象.start（）；
 * 2.实现Runnable接口+Thread对象（实现类对象）.start（）；
 */
public class ThreadStudy01 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        ThreadStudy01 td=new ThreadStudy01();
        td.start();
        for (int i=0;i<100;i++){
            System.out.println("一边coding");
        }
    }
}
