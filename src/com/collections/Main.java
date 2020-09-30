/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author amit
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay"));
        al.add(new Student(106, "Ajay"));
        al.add(new Student(105, "Jai"));
        Collections.sort(al);

        for (Student student : al) {
            System.out.println(student.id);
        }
    }
}
