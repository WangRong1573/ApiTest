package com.udp.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收端：使用面向对象封装
 * @author rong.wang
 * @date 21:37  2019/12/5
 */
public class TalkRecieve implements Runnable {
    private DatagramSocket socket;
    private String from;
    public TalkRecieve(int port,String from){
        this.from=from;
        try {
            socket=new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void run() {

        while (true) {
            byte[] container = new byte[1024 * 60];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            // 3.阻塞式接收包裹receive（DatagramPacket p）
            try {
                socket.receive(packet);
                //4.分析数据
                //      byte[] getData()
                //              getLength()
                byte[] datas = packet.getData();
                int len = packet.getLength();
                String data=new String(datas,0,len);
                System.out.println(from+":"+data);

                if (data.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 5.释放资源
        socket.close();
    }
}
