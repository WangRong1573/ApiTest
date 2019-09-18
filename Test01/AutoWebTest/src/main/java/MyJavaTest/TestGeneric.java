package MyJavaTest;

/**
 * 泛型，”数据类型的参数化“，建立类型安全的集合
 */
public class TestGeneric {
    public static void main(String[] args) {

        MyCollection<String> m=new MyCollection<String>();
        m.set("王容",0);
        m.set("88",1);

        String i=m.get(1);
        String s=m.get(0);
        System.out.println(i);
        System.out.println(s);
    }
}
class MyCollection<E>{
    Object[] objs=new Object[5];

    public void set(E e,int index){
        objs[index]=e;
    }
    public E get(int index){
        return (E) objs[index];
    }
}

//public class TestGeneric {
//    public static void main(String[] args) {
//
//        MyCollection m=new MyCollection();
//        m.set("王容",0);
//        m.set(88,1);
//
//        Integer i=(Integer)m.get(1);
//        String s=(String)m.get(0);
//        System.out.println(i);
//        System.out.println(s);
//    }
//}
//class MyCollection{
//    Object[] objs=new Object[5];
//
//    public void set(Object obj,int index){
//        objs[index]=obj;
//    }
//    public Object get(int index){
//        return objs[index];
//    }
//}