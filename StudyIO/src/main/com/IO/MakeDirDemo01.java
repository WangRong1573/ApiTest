package com.IO;

import java.io.File;

/**
 * 创建目录
 * 1.mkdir():确保上级目录存在，不存在则创建失败
 * 2.mkdirs():上级目录可以不存在，不存在则一同创建
 *
 * 3.创建文件用createNewFile（）
 * @author rong.wang
 */
public class MakeDirDemo01 {
    public static void main(String[] args) {
        File path=new File("G:/GitRes/StudyIO/a/test2");

        //创建目录,创建失败，因为上级目录不存在
        boolean flag=path.mkdir();
        System.out.println(flag);

        //创建成功示例
        File dir=new File("G:/GitRes/StudyIO/a/test3");
        boolean flag2=path.mkdirs();
        System.out.println(flag2);

        /**
         * 列出下级（所有）目录
         * 1.list（）列出下一级文件名称
         * 2. listFiles（）：列出下级file对象
         */
        File dir2=new File("G:/GitRes/StudyIO");
        String[] list=dir2.list();
        for (String l:list) {
            System.out.println(l.toString());
        }

        //下级对象，listFiles（）
        File dir3=new File("G:/GitRes/StudyIO");
        File[] subFiles=dir3.listFiles();
        for (File f:subFiles) {
            System.out.println(f.getAbsolutePath());
        }

        //列出所有的盘符
        File[] roots=dir3.listRoots();
        for (File r:roots) {
            System.out.println(r.getAbsolutePath());
        }
    }
}
