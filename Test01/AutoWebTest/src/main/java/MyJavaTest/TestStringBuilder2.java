package MyJavaTest;

/**
 * stringBuilder和stringBuffer的一些常用类学习
 */
public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<26;i++){
            char temp=(char)('a'+i);
            sb.append(sb);
        }

        //倒叙
        sb.reverse();
        System.out.println(sb);

        //指定索引修改元素
        sb.setCharAt(0,'我');
        System.out.println(sb);

        //指定索引插入元素
        sb.insert(0,'你');
        System.out.println(sb);

        //删除指定索引元素
        sb.delete(3,4);
        System.out.println(sb);
    }
}
