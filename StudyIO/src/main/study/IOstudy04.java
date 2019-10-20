package study;

import java.io.*;

/**
 * @author rong.wang
 * @date 22:03  2019/10/20
 *
 * 文件字节流
 */
public class IOstudy04 {
    public static void main(String[] args) {
        //创建源
        File src=new File("G:/GitRes/StudyIO/src/main/study/abc.txt");

        InputStream is=null;
        //选择流
        try {
             is=new FileInputStream(src);

            //操作（读写）
            byte[] arr=new byte[3];  //3代表每次读取的长度
            int len=-1;
            while ((len=is.read(arr))!=-1){

                String str=new String(arr,0,len);
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
