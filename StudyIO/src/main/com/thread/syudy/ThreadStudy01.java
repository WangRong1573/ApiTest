package com.thread.syudy;

/**
 * @author rong.wang
 * @date 9:52  2019/11/3
 * 初识多线程
 */
public class ThreadStudy01 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=500;i++){
            System.out.println("一边听歌xxxxxxxxxxxx");
        }
    }

    public static void main(String[] args) {
        ThreadStudy01 td=new ThreadStudy01();
        td.start();
        for (int i=0;i<=500;i++){
            System.out.println("一边coding");
        }
    }
}
