package com.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 基本数据类型的接收
 * @author rong.wang
 * @date 22:17  2019/12/4
 */
public class UdpTypeServer {
    public static void main(String[] args) throws Exception {

        System.out.println("接收数据中。。");

        DatagramSocket socket=new DatagramSocket(6565);

        //准备容器
        byte[] datas=new byte[1024*60];
        DatagramPacket packet=new DatagramPacket(datas,0,datas.length);

        //接受数据
        socket.receive(packet);

        byte[] data=packet.getData();

        DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
        String msg=dis.readUTF();
        int age=dis.readInt();
        boolean flag=dis.readBoolean();
        char word=dis.readChar();
        System.out.println(msg+"-----"+flag);
    }
}
