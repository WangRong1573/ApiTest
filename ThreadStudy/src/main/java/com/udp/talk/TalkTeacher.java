package com.udp.talk;

/**
 * @author rong.wang
 * @date 21:51  2019/12/5
 */
public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkRecieve(9999,"学生")).start();//接收

        new Thread(new TalkSend(9876,"localhost",6789)).start();
    }
}
