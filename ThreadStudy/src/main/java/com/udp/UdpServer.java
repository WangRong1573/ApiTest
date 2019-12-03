package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收端
 * 1.使用DatagramSocket,指定端口创建接收端
 * 2.准备容器，封装成DatagramPacket包裹
 * 3.阻塞式接收包裹receive（DatagramPacket p）
 * 4.分析数据
 *      byte[] getData()
 *              getLength()
 * 5.释放资源
 * @author rong.wang
 * @date 22:09  2019/12/3
 */
public class UdpServer {
    public static void main(String[] args) throws Exception {
        System.out.println("接受中、、");
        //1.使用DatagramSocket,指定端口创建接收端
        DatagramSocket server=new DatagramSocket(9999);//同一个协议下端口号不允许重复（与发送端的端口号）
        // 2.准备容器，封装成DatagramPacket包裹
        byte[] container=new byte[1024*60];
        DatagramPacket packet=new DatagramPacket(container,0,container.length);
        // 3.阻塞式接收包裹receive（DatagramPacket p）
        server.receive(packet);
       //4.分析数据
                //      byte[] getData()
                //              getLength()
        byte[] datas=packet.getData();
        int len=packet.getLength();
        System.out.println(new String(datas,0,len));
       // 5.释放资源
        server.close();
    }
}
