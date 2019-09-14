package MyJavaTest;

/**
 * 自动装箱和拆箱的学习
 */
public class TestAuotBox {
    public static void main(String[] args) {
        //装箱实例：等价于--Integer a=Integer.ValueOf(234);
        Integer a=234;

        //自动拆箱实例,等价于--Integer b=a.IntValue();
        Integer b=a;

//        //空指针异常: java.lang.NullPointerException
//        Integer c=null;
//        int d=c;   //拆箱，自动调用Integer d=c.IntValue();

        //缓存[-128,127]之间的数字
        //当调用valueOf（）时，首先检查是否在[-128,127],在范围内则直接从缓存数组中拿已经建好的对象
        //如果不再这个范围，则创建新的Integer对象
        Integer int1=-128;
        Integer int2=-128;
        System.out.println(int1==int2);//不是同一个对象，应为false，因为-128在缓存内，所以是同一个对象，所以为true
        System.out.println(int1.equals(int2));
        Integer s1=128;
        Integer s2=128;
        System.out.println(s1==s2);//false，因为不是用一个对象且不再缓存内
        System.out.println(s1.equals(s2));//true 值相等所以为true
    }

}
