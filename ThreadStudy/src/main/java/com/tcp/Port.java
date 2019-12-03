package com.tcp;

import java.net.InetSocketAddress;

/**
 * 端口：
 * 1.区分软件，每个软件有不同的端口号
 * 2.2个字节 0~65535  UDP TCP
 * 3.同一个协议端口不能冲突
 * 4.端口号越大越好（避免重复冲突）
 *
 * InetSocketAddress
 * 1.构造器
 * new InetSocketAddress("地址/域名",端口号)
 *
 * 2.方法：
 * getAddress()
 * getPort()
 * getHostName()
 *
 * @author rong.wang
 * @date 21:09  2019/12/3
 */
public class Port {
    public static void main(String[] args) {
        InetSocketAddress  SocketAddress=new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress  SocketAddress2=new InetSocketAddress("localhost",9000);

        System.out.println(SocketAddress.getHostName());
        System.out.println(SocketAddress2.getPort());
        System.out.println(SocketAddress2.getAddress());
    }
}
