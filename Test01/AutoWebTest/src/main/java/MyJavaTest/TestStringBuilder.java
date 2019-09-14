package MyJavaTest;

/**
 * StringBuilder、StringBuffer的认识和比较
 * StringBuilder：线程不安全，效率高
 * StringBuffer： 线程安全，效率低
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("abcdefg");
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println(s);

        System.out.println("################");
        s.setCharAt(2,'M');
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println(s);
    }
}
