package com.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 网络爬虫的原理
 *
 * @author rong.wang
 * @date 21:30  2019/12/3
 */
public class SpiderTest {
    public static void main(String[] args) throws IOException {
        //获取url
        URL url=new URL("https://www.jd.com");
        //下载资源
        InputStream is=url.openStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
        String msg=null;
        while (null!=(msg=br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
