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
public class Main {

    public static void main(String[] args) {
        AnimalService a = new AnimalServiceImpl();
        a.hi();
        a.sayHello();

        AnimalServiceIf animalServiceIf = new AnimalServiceImpl();
        animalServiceIf.hey();
        animalServiceIf.sayHiIf();
    }
}
