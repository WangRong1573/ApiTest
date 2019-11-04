package com.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * @author rong.wang
 * @date 20:38  2019/11/4
 *
 * java实现定时发送http请求
 */
public class HttpURLRequest {
    /**
     * 向指定url发送get请求
     * @param url
     * @param param
     * @return
     */
    public static String sendGet(String url,String param){
        String result="";
        BufferedReader in=null;

        String urlNameString=url+"?"+param;
        try {
            URL realUrl=new URL(urlNameString);
            //打开和url之间的连接
            URLConnection connection=realUrl.openConnection();
            //设置通用的请求属性
            connection.setRequestProperty("accept","/");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            //建立实际连接
            connection.connect();

            //获取所有相应字段
            Map<String, List<String>> map=connection.getHeaderFields();

            //遍历所有的响应头字段
            for (String key:map.keySet()) {
                System.out.println(key+"-->"+map.keySet());
            }

            //定义 BufferedReader输入流来读取URL的响应
            in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line=in.readLine())!=null){
                result+=line;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;

    }

    /**
     * 向指定url发送post请求
     * @param url
     * @param param
     * @return
     */
    public static String sendPost(String url,String param){
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            String s=HttpURLRequest.sendPost("接口地址","参数");
            try {
                //史上最low的定时执行，间隔一分钟执行一次
                Thread.sleep(1000*60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
