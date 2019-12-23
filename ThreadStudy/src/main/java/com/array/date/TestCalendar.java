package com.array.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期类Calendar和实现类GregorianCalendar()
 * @author rong.wang
 * @date 22:17  2019/12/23
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c1=new GregorianCalendar(2020,10,11,20,20);
        System.out.println(c1);

        //0表示一月，1表示二月，11表示十二月
        //获得日期的相关元素
        int year = c1.get(Calendar.YEAR);
        int weekday = c1.get(Calendar.DAY_OF_WEEK);

        //设置日期的相关元素
        Calendar c2=new GregorianCalendar();
        c2.set(Calendar.YEAR,2022);

        //日期的计算
        Calendar c3=new GregorianCalendar();
        c3.add(Calendar.DATE,100);//往后100天

        //日历对象和时间的相互转化
        Date d4=c3.getTime();

        Calendar c4=new GregorianCalendar();
        c4.setTime(new Date());
        printCalendar(c4);
    }

    public  static void printCalendar(Calendar c){
        //打印格式2019年10月23日 11：23:45 周三
        int year=c.get(Calendar.YEAR);
        //0表示一月，1表示二月，11表示十二月
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int sceond=c.get(Calendar.SECOND);
        //1表示周日 ...7 表示周日
        int weekDay=c.get(Calendar.DAY_OF_WEEK)+1;

        String weekDay2=weekDay==0 ? "日":weekDay+"";

        //怎么打印出汉字周几？
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+sceond+"秒"+"  周"+weekDay2);

    }
}
