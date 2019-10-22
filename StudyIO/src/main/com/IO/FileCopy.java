package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rong.wang
 * @date 21:06  2019/10/22
 *
 * IO实现文件的内容的拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
        fileCopy("e:/a.txt","e:/b.txt");
    }
    /**
     *
     * @param src  源文件
     * @param dec  目标文件
     */
    public static void fileCopy(String src,String dec){
        FileInputStream fis=null;
        FileOutputStream fos=null;

        //缓存数组
        byte[] buffer=new byte[1024];

        int temp;
        try {
            fis=new FileInputStream(src);
            fos=new FileOutputStream(dec);

            while ((temp=fis.read(buffer))!=-1){
                fos.write(buffer,0,temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
