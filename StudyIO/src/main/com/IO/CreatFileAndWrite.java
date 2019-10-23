package com.IO;

import java.io.*;

/**
 * @author rong.wang
 * @date 21:17  2019/10/23
 *
 * 练习将字符串写入到目标文件，不存在则创建文件
 */
public class CreatFileAndWrite {
    public static void main(String[] args) {
        //创建源
        File dest=new File("dest.txt");

        //选择流
        OutputStream os=null;

        try {
            os=new FileOutputStream(dest,true);

            String src="good good study! day day up!\r\n";

            byte[] data=src.getBytes();
            os.write(data,0,data.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
