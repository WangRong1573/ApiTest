package com.udp;

import java.io.IOException;
import java.net.*;

/**
 * 复习
 * @author rong.wang
 * @date 21:24  2019/12/4
 */
public class UdpclientTest2 {
    public static void main(String[] args) {
        System.out.println("数据发送中。。。");
        //指定端口创建发送端
        try {
            DatagramSocket socket=new DatagramSocket(22222);

            //准备容器，将发送内容转成字节数组
            String src="每天坚持两个小时撸代码！！";
            byte[] datas=src.getBytes();

            //打包
            DatagramPacket packet=new DatagramPacket(datas,0,datas.length,
                    new InetSocketAddress("localhost",22333));

            //发送
            socket.send(packet);

            //释放资源
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
