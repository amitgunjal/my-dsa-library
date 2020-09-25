/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oops.abstraction;

/**
 *
 * @author amit
 */
public abstract class AnimalService {

    AnimalService() {
        System.out.println("hi from abstract class constructor");
    }

    abstract void sayHello();

    final void hi() {
        System.out.println("Hi from abstract class hello");
    }
}
