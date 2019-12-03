package com.tcp;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:统一资源定位器，互联网三大基石之一（http  html）
 * 1.协议
 * 2.域名、计算机
 * 3.端口：默认80
 * 4.请求资源
 * 例如：http://www.baidu.com:80/index.html?username=xxx&password=xxx#a
 * @author rong.wang
 * @date 21:20  2019/12/3
 */
public class Urltest {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://www.baidu.com:80/index.html?username=xxx&password=xxx#a");
        //获取四个值
        System.out.println("协议："+url.getProtocol());
        System.out.println("域名："+url.getHost());
        System.out.println("端口："+url.getPort());
        System.out.println("请求资源："+url.getFile());
        System.out.println("请求资源："+url.getPath());

        //参数
        System.out.println("参数："+url.getQuery());
        //锚点
        System.out.println("锚点："+url.getRef());

    }
}
