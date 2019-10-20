package study;

import java.io.*;

/**
 * @author rong.wang
 * @date 21:43  2019/10/20
 *
 * IO操作步骤复习
 */
public class IOstudy03 {
    public static void main(String[] args) {

        //创建源
        File src=new File("G:/GitRes/StudyIO/src/main/study/abc.txt");

        InputStream is=null;
        //选择流
        try {
             is=new FileInputStream(src);

            //讀寫操作
            int temp;
            while ((temp=is.read())!=-1){
                System.out.println((char) temp);
            }

//            //操作（读写操作）
//            int data1=is.read();
//            System.out.println((char)data1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            //释放系统资源
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
