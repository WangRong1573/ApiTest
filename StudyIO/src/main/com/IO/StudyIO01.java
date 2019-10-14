package com.IO;

import java.io.File;

/**
 * @author rong.wang
 */
public class StudyIO01 {
    public static void main(String[] args) {
        String path="G:\\GitRes\\StudyIO\\test.png";
        //File.separatorChar  表示 分隔符 \
        System.out.println(File.separatorChar);

        //建议路径写法
        //1.
        path="G:/GitRes/StudyIO/test.png";
        System.out.println(path);

        //2.常量拼接
        path="G:"+File.separatorChar+"GitRes"+File.separatorChar+"StudyIO"+File.separatorChar+"test.png";
        System.out.println(path);
    }
}
