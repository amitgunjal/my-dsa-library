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
public class AnimalServiceImpl extends AnimalService implements AnimalServiceIf {

    @Override
    void sayHello() {
        System.out.println("saying hello...");
    }

    @Override
    public void sayHiIf() {
        AnimalServiceIf.super.sayHiIf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hey() {
        System.out.println("hey, from overridden method");
    }

}
