package MyJavaTest;

/**
 * java异常的认识
 *
 */
public class TestException {
    public static void main(String[] args) {
        //示例
//        try {
//            copyFile("d:/a.txt","e:/a.txt");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //会报异常：Exception in thread "main" java.lang.ArithmeticException: / by zero  算数异常
//        int a=1/0;
//        System.out.println(a);
        //改善代码
        int a=0;
        int b=1;
        if (a!=0){
            System.out.println(b/a);
      }

        //RuntimeException 运行时异常

//        //会报异常：java.lang.NullPointerException 空指针
//        String str=null;
//        str.length();

//        //运行会报：java.lang.ClassCastException: MyJavaTest.Dog cannot be cast to MyJavaTest.Cat 转型异常
//        Animal dog=new Dog();
//        Cat c=(Cat)dog;

//        //数组越界：java.lang.ArrayIndexOutOfBoundsException
//        int[] arr = new int[5];
//        System.out.println(arr[5]);

        //数字格式异常：java.lang.NumberFormatException: For input string: "1234abcf"
        String str = "1234abcf";
        System.out.println(Integer.parseInt(str));

    }
}
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}