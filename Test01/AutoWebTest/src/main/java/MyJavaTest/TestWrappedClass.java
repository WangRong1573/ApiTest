package MyJavaTest;

/**
 * 包装类练习，常用包装类
 */
public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对象
        Integer a=new Integer(10);
        Integer b=Integer.valueOf(20);

        //包装类对象转换成基本数据类型
        int c=b.intValue();
        double d=b.doubleValue();

        //把字符串转成包装类对象
        Integer e=new Integer("888");
        Integer f=Integer.parseInt("999");

        //包装类对象转成字符串
        String g=f.toString();

        //表示常见的常量
        System.out.println("Integer能表示的最大值为："+Integer.MAX_VALUE);
    }
}
