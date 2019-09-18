package MyJavaTest;

/**
 * 泛型的练习
 */
public class TestGeneric2 {
    public static void main(String[] args) {
        MyCollection2<String> m=new MyCollection2<String>();
        m.set("sss",0);
        m.set("2222",1);
        String s1=m.get(0);
        String s2=m.get(1);
        System.out.println(s1+s2);

//        MyCollection2<Integer> m2=new MyCollection2<Integer>();
    }
}
class MyCollection2<E>{
    Object[] o=new Object[6];

    public void set(E e,int index){
        o[index]=e;
    }
    public E get(int index){
        return (E) o[index];
    }
}
