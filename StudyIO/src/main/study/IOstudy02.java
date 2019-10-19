package study;

import java.io.*;

/**
 * IO操作代码，标准版
 */
public class IOstudy02 {
    public static void main(String[] args) {
        File src=new File("G:/GitRes/StudyIO/src/main/study/abc.txt");

        InputStream inputStream=null;
        try {
             inputStream=new FileInputStream(src);
            int temp;
            while ((temp=inputStream.read())!=-1){
                System.out.println((char) temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=inputStream) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
