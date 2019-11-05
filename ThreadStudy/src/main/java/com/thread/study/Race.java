package com.thread.study;

/**
 * @author rong.wang
 * @date 21:15  2019/11/5
 *
 * 使用多线程模拟归途赛跑
 */
public class Race implements  Runnable{
    //记录胜利者
    private static String winner;

    public void run() {

        for (int steps=1;steps<=100;steps++){
            //模擬休息
            if (Thread.currentThread().getName().equals("rabbit")&&steps%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);

            //比赛是否结束
            boolean flag=gameOver(steps);
            if (flag){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
        if (winner!=null){
            return true;
        }else {
            if (steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner-->"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race=new Race();
        new Thread(race,"tortoise").start();
        new Thread(race,"rabbit").start();

    }
}
