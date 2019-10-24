package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

/**
 * @author rong.wang
 * @date 21:48  2019/10/24
 * Reader   和FileWriter
 */
public class FileReader {
    public static void main(String[] args) {
        File src=new File("G:\\GitRes\\dest.txt");

        Reader reader=null;

        int len;
        try {
            reader=new java.io.FileReader(src);

            char[] buffer= new char[1024];
            while ((len=reader.read(buffer))!=-1){
                String str=new String(buffer,0,len);
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
