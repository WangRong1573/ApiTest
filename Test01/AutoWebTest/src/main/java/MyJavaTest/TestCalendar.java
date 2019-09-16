package MyJavaTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期类calendar的使用
 */
public class TestCalendar {
    public static void main(String[] args) {
        //获得日期的相关元素
        Calendar calendar=new GregorianCalendar(2019,9,16,21,22);//此处的9表示10月
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int week=calendar.get(Calendar.DAY_OF_WEEK);//星期几，1-7  1 表示周日，7 表示周六
        int day=calendar.get(Calendar.DATE);  //获得的是几号,也可以使用 DAY_OF_MONTH

        System.out.print(year+"年");
        System.out.print("  "+month+"月"+"  "); //0-11表示对应的月份，0是一月，11是十二月
        System.out.print("星期"+week);

        //设置日期的相关元素
        Calendar c2=new GregorianCalendar();

        //c2.set(Calendar.YEAR,2019);
       // c2.set(2020,8,16);
        System.out.println(c2);  //不传值默认为今天

        //日期的计算
        Calendar c3=new GregorianCalendar();
        c3.add(Calendar.DATE,100); //计算100天以后的时间，若是计算之前时间传 -100
        System.out.println(c3);

        //日期对象和时间对象的转化
        Date date=c3.getTime();
        Calendar c4=new GregorianCalendar();
        c4.setTime(new Date());

        printCalendar(c4);

    }

    public static void printCalendar(Calendar c){
        //打印类似格式：2019年9月16日 周一，22:00:00
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int date=c.get(Calendar.DATE);
        int weekday=c.get(Calendar.DAY_OF_WEEK);
        String weekDay=weekday==0 ?"日":weekday+"";
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+date+"日"+"周"+weekDay+"   "+hour+"时"+minute+"分"+second+"秒");

    }
}
