package com.thread.study;

/**
 * @author rong.wang
 * @date 20:54  2019/11/5
 *
 * 2.实现Runnable接口。thread对象（实现类对象）.start（）；
 */
public class ThreadStudy02  implements Runnable{
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("一百你听歌");
        }
    }

    public static void main(String[] args) {
        ThreadStudy02 td02=new ThreadStudy02();
        new Thread(td02).start();

        for (int i=0;i<1000;i++){
            System.out.println("一百coding");
        }
    }
}
