package com.IO;

import java.io.*;

/**
 * @author rong.wang
 * @date 21:22  2019/10/31
 *
 * 字节缓冲流
 */
public class BufferedTest01 {
    public static void main(String[] args) {
        File src=new File("G:\\GitRes\\StudyIO\\target\\a.txt");

        InputStream is=null;
        BufferedInputStream bis=null;

        try {
            is=new FileInputStream(src);
            bis=new BufferedInputStream(is);

            byte[] buff=new byte[1024];

            int len;

            while ((len=is.read(buff))!=-1){
                String str=new String(buff,0,len);
                System.out.println(str);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=bis){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
