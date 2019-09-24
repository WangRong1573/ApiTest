package MyJavaTest;

import java.util.*;

/**
 * 利用map，list存储表格数据
 */
public class TestStoreData {
    public static void main(String[] args) {
        Map<String,Object> row1=new HashMap<String, Object>();
        row1.put("ID",1001);
        row1.put("姓名","张三");
        row1.put("薪水",8888);
        row1.put("入职日期","2018.8.8");

        Map<String,Object> row2=new HashMap<String, Object>();
        row2.put("ID",1002);
        row2.put("姓名","李四");
        row2.put("薪水",6666);
        row2.put("入职日期","2016.6.8");

        Map<String,Object> row3=new HashMap<String, Object>();
        row3.put("ID",1003);
        row3.put("姓名","王五");
        row3.put("薪水",3333);
        row3.put("入职日期","2013.8.3");

        List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();
        list.add(row1);
        list.add(row2);
        list.add(row3);

        for (Map<String,Object> table:list) {
            Set<String> set=table.keySet();
            for (String key:set) {
                System.out.print(key+":"+table.get(key)+"\t");
            }
            System.out.println();
        }


    }
}
