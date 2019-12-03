package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 发送端
 * 1.使用DatagramSocket,指定端口创建发送端
 *  2.准备容器，转成字节数组
 *  3.封装成DatagramPacket包裹，需要指定目的地
 *  4.发送包裹send(DatagramPacket p)
 *  5.释放资源
 * @author rong.wang
 * @date 22:09  2019/12/3
 */
public class UdpClient {
    public static void main(String[] args) throws Exception {
        System.out.println("发送方启动中、、、、、");
        //1.使用DatagramSocket,指定端口创建发送端
        DatagramSocket client=new DatagramSocket(8888);
        //  2.准备容器，转成字节数组
        String data="百度文库";
        byte[] datas=data.getBytes();
        //  3.封装成DatagramPacket包裹，需要指定目的地
        DatagramPacket packet=new DatagramPacket(datas,0,datas.length,
                new InetSocketAddress("localhost",9999));
        //  4.发送包裹send(DatagramPacket p)
        client.send(packet);
        // 5.释放资源
        client.close();
    }
}
