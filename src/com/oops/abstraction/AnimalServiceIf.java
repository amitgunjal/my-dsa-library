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
public interface AnimalServiceIf {

    default void sayHiIf() {
        System.out.println("hi from default If method");
    }

    void hey();
}
