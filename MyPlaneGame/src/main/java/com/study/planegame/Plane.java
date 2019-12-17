package com.study.planegame;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 飞机类
 * @author rong.wang
 * @date 22:05  2019/12/17
 */
public class Plane extends GameObject {

    int speed=3;

    //增加变量控制方向
    boolean up,down,left,right;

    public void drawMySelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
        if (left){
            x-=speed;
        }
        if (right){
            x+=speed;
        }
        if (up){
            y-=speed;
        }
        if (down){
            y+=speed;
        }
    }

    public Plane(Image img, double x, double y) {
        this.img=img;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    //按下键增加相应的方向
    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left=true;
                break;
            case KeyEvent.VK_RIGHT:
                right=true;
                break;
            case KeyEvent.VK_UP:
                up=true;
                 break;
            case KeyEvent.VK_DOWN:
                  down=true;
                  break;
             default:
                 break;
        }
    }

    //抬起时，减少相应的方向
    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left=false;
                break;
            case KeyEvent.VK_RIGHT:
                right=false;
                break;
            case KeyEvent.VK_UP:
                up=false;
                break;
            case KeyEvent.VK_DOWN:
                down=false;
                break;
            default:
                break;
        }
    }
}
