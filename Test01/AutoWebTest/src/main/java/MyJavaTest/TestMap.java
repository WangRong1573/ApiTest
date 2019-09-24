package MyJavaTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 练习map的常用方法
 */
public class TestMap {
    public static void main(String[] args) {
        Employee e1=new Employee(1001,"张三",8888);
        Employee e2=new Employee(1002,"李四",6663);
        Employee e3=new Employee(1003,"王五",3456);

        Map<Integer,Employee> emp=new HashMap<Integer, Employee>();
        emp.put(1001,e1);
        emp.put(1002,e2);
        emp.put(1003,e3);

        Employee employee= emp.get(1001);
        System.out.println(employee.getName()+"\t"+employee.getSalary());

        System.out.println(emp);
    }
}

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+"\t"+"name:"+name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}