/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oops.polymorphism;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amit
 */
public class Polymorphism {

    Polymorphism() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    static {
        System.out.println("I am static");
    }

    // overloaded method takes 2 param
    public static void add(int a, int b) {
        System.out.println("a+b: " + (a + b));
    }

    // overloaded method takes 3 param
    public static void add(int a, int b, int c) {
        System.out.println("a+b+c: " + (a + b + c));
    }

    public static void main(String[] args) {
        Polymorphism.add(1, 2);
        Polymorphism.add(1, 2, 3);

        try {
            Polymorphism pm = Polymorphism.class.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Polymorphism.class.getName()).log(Level.SEVERE, null, ex);
        }

        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
        Parent p = new Parent();
        p.hello();

        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM.
        Parent c = new Child();
        c.hello();

        // Super keyword
        Child child = new Child();
        child.someMethod();
    }
}
