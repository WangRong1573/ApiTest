package com.udp.talk;

/**
 * 加入多线程实现双向交流，模拟在线咨询
 * @author rong.wang
 * @date 21:50  2019/12/5
 */
public class TalkStudent {
    public static void main(String[] args) {
        new Thread(new TalkSend(7777,"localhost",9999)).start();//发送

        new Thread(new TalkRecieve(6789,"老师")).start();
    }
}
