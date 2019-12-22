package com.array;

/**
 * StringBuilder和StringBuffer，可变字符序列
 * StringBuilder,线程不安全，效率高（一般使用）
 * StringBuffer线程安全，效率低
 *
 *  1. 重载的public StringBuilder append(…)方法
 *
 *         可以为该StringBuilder 对象添加字符序列，仍然返回自身对象。
 *
 *       2. 方法 public StringBuilder delete(int start,int end)
 *
 *         可以删除从start开始到end-1为止的一段字符序列，仍然返回自身对象。
 *
 *       3. 方法 public StringBuilder deleteCharAt(int index)
 *
 *         移除此序列指定位置上的 char，仍然返回自身对象。
 *
 *       4. 重载的public StringBuilder insert(…)方法
 *
 *         可以为该StringBuilder 对象在指定位置插入字符序列，仍然返回自身对象。
 *
 *       5. 方法 public StringBuilder reverse()
 *
 *         用于将字符序列逆序，仍然返回自身对象。
 *
 *       6. 方法 public String toString() 返回此序列中数据的字符串表示形式。
 *
 *       7. 和 String 类含义类似的方法：
 *
 * public int indexOf(String str)
 * public int indexOf(String str,int fromIndex)
 * public String substring(int start)
 * public String substring(int start,int end)
 * public int length()
 * char charAt(int index)
 * @author rong.wang
 * @date 20:57  2019/12/22
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            sb.append((char)('a'+i)+"\t");
        }
        System.out.println(sb);

        System.out.println("###############");
        sb.reverse();//倒序
        System.out.println(sb);

        System.out.println("##################");
        sb.setCharAt(3,'我');//修改指定索引的值
        System.out.println(sb);

        System.out.println("##################");
        sb.insert(0,'你').insert(6,'是').insert(18,'水');//链式调用，查看源码，该方法调用了return this
        System.out.println(sb);

        System.out.println("##################");
        sb.delete(13,15);//删除一个区间
        System.out.println(sb);
    }
}
