package com.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 网络爬虫的原理
 *
 * 特殊情况：一些网站可能没有权限爬取，Server returned HTTP response code: 403 for URL: https://www.dianping.com
 * 解决办法：浏览器打开链接，F12查看request headers，找到User-Agent
 * 代码如下：
 *
 * @author rong.wang
 * @date 21:30  2019/12/3
 */
public class SpiderTest02 {
    public static void main(String[] args) throws IOException {
        //获取url
        URL url=new URL("https://www.dianping.com");
        //下载资源
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36");
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String msg=null;
        while (null!=(msg=br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
