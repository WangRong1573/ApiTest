package com.imooc.collection_map;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rong.wang
 * @date 19:39  2020/1/10
 */
public class Student {
    int id;
    String name;
    Set courses;

    public Student(int id, String name, Set courses) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
