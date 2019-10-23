package com.IO;

import java.io.*;

/**
 * @author rong.wang
 * @date 21:36  2019/10/23
 *
 * 文件拷贝复习
 */
public class Copy {
    public static void main(String[] args) {

        fileCopy("dest.txt","d:/dec.txt");
    }

    public static void fileCopy(String src,String dec){

        //选择源
        File path=new File(src);
        File decPath=new File(dec);

        FileInputStream fi=null;
        FileOutputStream fo=null;

        int len;
        try {
            //选择流
            fi=new FileInputStream(path);
            fo=new FileOutputStream(decPath);

            //缓冲容器
            byte[] flush=new byte[1024];

            //操作（拷贝）
            while ((len=fi.read(flush))!=-1){
                fo.write(flush,0,len);
            }
            fo.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //分别关闭流，先打开的后关闭
            if (null!=fo){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=fi){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
