package com.study.planegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 窗口界面
 * @author rong.wang
 * @date 22:08  2019/12/16
 */
public class MyFrame extends JFrame {

    //默认读取target/classes下的目录
    Image planeImg=GameUtil.getImage("images/plane.png");
    Image bgImg=GameUtil.getImage("images/bg.png");

    Plane plane=new Plane(planeImg,250,250);
    int count=0;

    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg,0,0,null);
        plane.drawMySelf(g);

    }

    public void launchFrame(){
        //设置窗口标题
        setTitle("飞机小游戏");
        //设置窗口可见，默认为false不可见
        setVisible(true);
        //设置窗口大小
        setSize(500,650);
        //设置窗口位置
        setLocation(460,200);

        //增加窗口监听事件，在窗口关闭时
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动多线程
        new PaintThread().start();

        //给窗口增加键盘监听
        addKeyListener(new KeyMonitor());
    }

    //多线程实现反复重画窗口
    class PaintThread extends Thread{
        public void run(){
            while(true){
                count++;
                System.out.println("窗口重画了"+count+"次");
                repaint();
                try {
                    Thread.sleep(40); //1s = 1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //增加键盘监听内部类
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
        plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.launchFrame();
    }
}
