package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 复习
 * @author rong.wang
 * @date 21:24  2019/12/4
 */
public class UdpserverTest2 {
    public static void main(String[] args) {
        System.out.println("数据接收准备中。。");
        //指定端口接收数据
        try {
            DatagramSocket socket=new DatagramSocket(22333);//此处的端口号为发送方打包发送的地址

            //准备容器
            byte[] datas=new byte[1024*60];
            DatagramPacket packet=new DatagramPacket(datas,0,datas.length);

            //接受数据
            socket.receive(packet);

            //分析数据
            byte[] data=packet.getData();
//            String src=new String(data,0,packet.getLength());
//            System.out.println(src);
            System.out.println(new String(data,0,packet.getLength()));

            //释放资源
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
