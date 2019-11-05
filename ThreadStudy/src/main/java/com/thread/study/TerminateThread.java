package com.thread.study;

/**
 * @author rong.wang
 * @date 20:58  2019/11/5
 *
 * 线程的终止
 * 1.自动终止，即完成了循环的次数
 * 2.手动终止，提供对外的终止方法
 */
public class TerminateThread implements Runnable {
    //标记
    private boolean flag=true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    public void run() {
        int i=0;
        while (flag){
            System.out.println(name+"-->"+i++);
        }
    }

    //线程终止的方法
    public void terminate(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TerminateThread tt=new TerminateThread("you-->");
        new Thread(tt).start();

        for (int i=0;i<500;i++){
            if (i==490){
                tt.terminate();//手动终止线程
                System.out.println("game  over!!!!!!!!!!!!!");
            }
            System.out.println("main-->"+i);
        }
    }
}
