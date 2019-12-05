package com.udp.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 多次交流
 * @author rong.wang
 * @date 21:24  2019/12/5
 */
public class UdpTalkServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动中、、");
        DatagramSocket socket=new DatagramSocket(9876);

        while (true) {
            byte[] container = new byte[1024 * 60];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            // 3.阻塞式接收包裹receive（DatagramPacket p）
            socket.receive(packet);
            //4.分析数据
            //      byte[] getData()
            //              getLength()
            byte[] datas = packet.getData();
            int len = packet.getLength();
            String data=new String(datas,0,len);
            System.out.println(data);

            if (data.equals("bye")){
                break;
            }
        }
        // 5.释放资源
        socket.close();
    }
}
