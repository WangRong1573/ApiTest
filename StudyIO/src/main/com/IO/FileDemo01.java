package com.IO;

import java.io.File;

/**
 * @author rong.wang
 */
public class FileDemo01 {
    public static void main(String[] args) {
        String path ="G/GitRes/StudyIO/test.png";

        /**
         * 1.构建file对象，通过构造器
         */
        File src=new File(path);
        //文件大小
        System.out.println(src.length());

        //2.构建file对象，通过构造器
        src=new File("G/GitRes/StudyIO","test.png");
        System.out.println(src.length());

        //3.构建file对象，通过构造器
        src=new File("G/GitRes","StudyIO/test.png");

        //4.构建file对象，通过构造器
        src=new File(String.valueOf(new File("G/GitRes/StudyIO","test.png")));
        System.out.println(src.length());

    }
}
