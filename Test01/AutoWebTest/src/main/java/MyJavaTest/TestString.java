package MyJavaTest;

/**
 * string类的练习
 * String 类对象代表不可变的Unicode字符序列，因此我们可以将String对象称为“不可变对象”
 */
public class TestString {
    public static void main(String[] args) {
        String a1="sssssffgh";
        //不可变对象，只可声明一次
        //String a="sdsddfg";
        String a2=a1.substring(2,4);
        System.out.println(a1);
        System.out.println(a2);


        //字符串的比较，用equals
        String st1="hello"+"java";
        String st2="hellojava";
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        String st3="hello";
        String st4="java";
        String st5=st3+st4;
        System.out.println(st5==st2);
        System.out.println(st5.equals(st2));
    }
}
