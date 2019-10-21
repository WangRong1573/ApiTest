package study;

import java.io.*;

/**
 * @author rong.wang
 * @date 21:43  2019/10/21
 * IO流操作步骤复习
 */
public class IOstudy05 {
    public static void main(String[] args) {
        File src=new File("G:/GitRes/StudyIO/src/main/study/abc.txt");

        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(src);

            int temp;
            while ((temp=inputStream.read())!=-1){
                System.out.println((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
