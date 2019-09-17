package MyJavaTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date类的学习
 * 2.测试时间对象和字符串之间的相互转换
 * DateFormat类和simpleDateFormat实现类的使用
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);

        //时间的比较，既是比较毫秒数
        Date d2=new Date(12575235);
        d2.getTime();
        if (d.getTime()>d2.getTime()){
            System.out.println(d2+"比"+d+"时间早");
        }else {
            System.out.println(d2+"比"+d+"时间晚");
        }

        System.out.println(d.after(d2));

        //把时间对象按照“格式字符串指定的格式”转成相应的字符串
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str =df.format(new Date());
        System.out.println(str);

        //把字符串按照“格式字符串指定的格式”转成相应的时间对象
        DateFormat df2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date=df2.parse("2019-12-12 12:12:12");
        System.out.println(date);

//        Date date2=df2.parse("2018-12-12 12:12:12");


    }
}
