package com.IO;

import java.io.*;
import java.io.FileReader;

/**
 * @author rong.wang
 * @date 21:57  2019/10/24
 * 复习Reader
 */
public class Reader2 {
    public static void main(String[] args) {
        File file=new File("G:\\GitRes\\dest.txt");

        Reader rd=null;

        int temp;
        try {
            rd=new FileReader(file);
            //缓存字符数组，每次读取1024字节
            char[] buffer=new char[1024];

            while ((temp=rd.read(buffer))!=-1){
                //将字符数组转为字符串
                String str=new String(buffer,0,temp);
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rd!=null){
                try {
                    rd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
