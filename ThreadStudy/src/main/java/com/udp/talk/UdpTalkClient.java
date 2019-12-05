package com.udp.talk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


/**
 * 多次交流
 * @author rong.wang
 * @date 21:24  2019/12/5
 */
public class UdpTalkClient {
    public static void main(String[] args) throws Exception {
        System.out.println("发送方启动中、、");
        DatagramSocket socket=new DatagramSocket(6543);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();

            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
                    new InetSocketAddress("localhost", 9876));

            socket.send(packet);
            if (data.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
