package com.array.date;

import java.util.Date;

/**
 * 当前时刻：long now = System.currentTimeMillis();
 *
 *
 *  1. Date() 分配一个Date对象，并初始化此对象为系统当前的日期和时间，可以精确到毫秒)。
 *
 *       2. Date(long date) 分配 Date 对象并初始化此对象，以表示自从标准基准时间(称为“历元(epoch)”，即 1970 年 1 月 1 日 00:00:00 GMT)以来的指定毫秒数。
 *
 *       3. boolean after(Date when) 测试此日期是否在指定日期之后。
 *
 *       4. booleanbefore(Date when) 测试此日期是否在指定日期之前。
 *
 *       5. boolean equals(Object obj) 比较两个日期的相等性。
 *
 *       6. long getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 *
 *       7. String toString() 把此 Date 对象转换为以下形式的 String：
 *
 *         dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun、 Mon、Tue、Wed、 Thu、 Fri、 Sat)。
 * @author rong.wang
 * @date 21:18  2019/12/22
 */
public class Date01 {
    public static void main(String[] args) {
        Date date=new Date(2000); //Date date=new Date(number)
        System.out.println(date);

    }
}
