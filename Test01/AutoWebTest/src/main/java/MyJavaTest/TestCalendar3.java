package MyJavaTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar3 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期：（格式为yyyy-MM-dd）");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date =  dateFormat.parse(str);
        Calendar calendar=new GregorianCalendar();
        calendar.setTime(date);

        //当月最大天数
        int Max=calendar.getActualMaximum(Calendar.DATE);
        //获取日期
        int day=calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        calendar.set(Calendar.DAY_OF_MONTH,1);

        for (int i=0;i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }

        for (int i=1;i<=Max;i++){
            if (day==calendar.get(Calendar.DAY_OF_MONTH)){
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*\t");
            }else {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
            }
            //每逢周六换行
            if (calendar.get(Calendar.DAY_OF_WEEK)==7){
                System.out.println();
            }
            //打印一次，日期加一天
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}

