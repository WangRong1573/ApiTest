package com.udp;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


/**
 * 基本数据类型的发送
 * @author rong.wang
 * @date 22:16  2019/12/4
 */
public class UdpTypeClient {
    public static void main(String[] args) throws Exception {
        System.out.println("数据发送准备中、、、");

        DatagramSocket socket=new DatagramSocket(7777);

        //2.将基本数据类型转成字节数组，使用ByteArrayOutputStream
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(bos));
        //操作数据类型+数据
        dos.writeUTF("每天坚持撸代码");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] datas=bos.toByteArray();

        DatagramPacket packet=new DatagramPacket(datas,0,datas.length,
                new InetSocketAddress("localhost",6565));

        socket.send(packet);

        socket.close();
    }
}
