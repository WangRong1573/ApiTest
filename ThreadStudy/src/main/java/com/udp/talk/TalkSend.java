package com.udp.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 发送端：使用面向对象封装
 * @author rong.wang
 * @date 21:37  2019/12/5
 */
public class TalkSend implements Runnable {
    private DatagramSocket socket;
    private  BufferedReader reader;
    private String toIP;
    private int toPort;
    public TalkSend(int port,String toIP,int toPort){
        this.toIP=toIP;
        this.toPort=toPort;
        try {
            socket=new DatagramSocket(port);
            reader=new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
    public void run() {

        while (true) {
            String data = null;
            try {
                data = reader.readLine();
                byte[] datas = data.getBytes();

                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
                        new InetSocketAddress(this.toIP, this.toPort));

                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
