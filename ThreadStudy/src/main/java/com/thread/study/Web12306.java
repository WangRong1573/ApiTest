package com.thread.study;

/**
 * @author rong.wang
 * @date 21:06  2019/11/5
 *
 * 学习使用多线程实现12306多人抢票
 *
 * 抢票的时候存在网络延时，就会有并发，数据可能就会有问题，就要考虑线程安全
 */
public class Web12306 implements Runnable{
    //票数
    private int ticktNum=99;

    public void run() {
        while (true){
            if (ticktNum==0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticktNum--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 wb=new Web12306();

        //多个代理
        new Thread(wb,"张三--》").start();
        new Thread(wb,"李四--》").start();
        new Thread(wb,"王五--》").start();



    }
}
