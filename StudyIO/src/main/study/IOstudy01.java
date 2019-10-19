package study;

import java.io.*;

/**
 * 第一个IO程序练习
 * @author rong.wang
 */
public class IOstudy01 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("G:/GitRes/StudyIO/src/main/study/abc.txt");

        //2.选择流
        try {
            InputStream is=new FileInputStream(src);

            //3.操作（读取）
            int data1=is.read(); //第一个数据h
            int data2=is.read(); //第二个数据e
            int data3=is.read(); //第三个数据
            int data4=is.read(); //第三个数据

            System.out.println((char) data1);
            System.out.println((char) data2);
            System.out.println((char) data3);
            System.out.println(data4); //未找到时，返回-1

            //4.释放系统资源
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
