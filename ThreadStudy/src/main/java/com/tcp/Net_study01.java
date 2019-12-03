package com.tcp;

import com.google.common.net.InetAddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * TCP/IP协议
 * 主要分为四层：应用层/传输层/网络层/网络接口层
 * 主要包括：IP、端口、协议
 * @author rong.wang
 * @date 20:47  2019/12/3
 */
public class Net_study01 {
    public static void main(String[] args) throws UnknownHostException {
        //使用getLocalHost方法创建InetAddress对象
        InetAddress address=InetAddress.getLocalHost();

        address=InetAddress.getByName("www.baidu.com");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println();
        address=InetAddress.getByName("39.156.66.18");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }
}
