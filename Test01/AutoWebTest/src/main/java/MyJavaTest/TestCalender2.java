package MyJavaTest;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历练习
 *
 * 啊，学习的路真是从入门到放弃啊....坚持坚持！
 */
public class TestCalender2 {
    public static void main(String[] args) throws ParseException {
        //获取用户输入日期
        System.out.println("请输入日期：（格式2020-20-20）");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        //将字符串转成时间对象，在转为日期对象
        //String str="2019-9-17";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        Calendar c=new GregorianCalendar();
        c.setTime(date);

        //c.getActualMaximum(Calendar.DATE) 获取本月最大天数
        int days=c.getActualMaximum(Calendar.DATE);

        int day=c.get(Calendar.DAY_OF_MONTH);

        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //从1号开始打印
        c.set(Calendar.DAY_OF_MONTH,1);

        for (int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }
        for (int i = 1; i <=days; i++) {
            if (day == c.get(Calendar.DAY_OF_MONTH)) {
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
            }else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");

            }
            //每逢周六换行
            if (c.get(Calendar.DAY_OF_WEEK)==7){
                System.out.println();
            }
            //每打完一次，日期加一天
            c.add(Calendar.DAY_OF_MONTH,1);
        }


    }
}
