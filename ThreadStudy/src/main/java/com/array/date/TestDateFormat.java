package com.array.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 时间对象和字符串之间的互相转化
 *
 * DateFormat是一个抽象类，一般使用它的的子类SimpleDateFormat类来实现
 *
 * @author rong.wang
 * @date 21:27  2019/12/22
 */
public class TestDateFormat {
    public static void main(String[] args) {

        //将时间对象按照相应的格式转成字符串
        DateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        DateFormat sd2=new SimpleDateFormat("yyyy-MM-dd");

        String s = sd.format(new Date(400000));
        System.out.println(s);

        String s2 = sd.format(new Date(400000));
        System.out.println(s2);

        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        try {
            Date date=df.parse("2019年12月12日 22时22分22秒");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //年中的天数
        DateFormat sd3=new SimpleDateFormat("D");
        String s0=sd3.format(new Date());
        System.out.println(s0);

        //本月的多少周
        DateFormat d=new SimpleDateFormat("W");
        //年中的周数
        DateFormat d2=new SimpleDateFormat("w");
        String s4=d.format(new Date());
        System.out.println(s4);
        String s5=d2.format(new Date());
        System.out.println(s5);

    }
}
