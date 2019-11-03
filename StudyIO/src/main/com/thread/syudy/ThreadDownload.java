package com.thread.syudy;

/**
 * @author rong.wang
 * @date 10:14  2019/11/3
 */
public class ThreadDownload extends Thread{
    private String url;
    private  String name;
    public ThreadDownload(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run() {

        WebDownload wd=new WebDownload();
        wd.download(url,name);
        System.out.println(name+url);
    }

    public static void main(String[] args) {
        ThreadDownload td1=new ThreadDownload("http://sc.chinaz.com/tupian/191103171210.htm","meinv.png");
        ThreadDownload td2=new ThreadDownload("http://www.nipic.com/show/9389544.html","tree.png");
        ThreadDownload td3=new ThreadDownload("http://www.nipic.com/show/10219134.html","follower.png");

        //启动三个线程
        td1.start();
        td2.start();
        td3.start();
    }
}
