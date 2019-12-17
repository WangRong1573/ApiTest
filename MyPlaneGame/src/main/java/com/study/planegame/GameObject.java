package com.study.planegame;

import java.awt.*;

/**
 * 游戏物体的父类
 * @author rong.wang
 * @date 21:46  2019/12/17
 */
public class GameObject {
    Image img;
    double x,y;
    int speed;
    int width,height;

    /**
     * 绘制图形方法
     * @param g
     */
    public void drawMySelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
    }

    public GameObject(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject() {
    }

    /**
     * 返回物体对应矩形区域，便于后续在碰撞检测中使用
     * @return
     */
    public Rectangle getRect(){
        return  new Rectangle((int)x,(int) y, width, height);
    }
}
