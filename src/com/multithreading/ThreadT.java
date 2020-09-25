/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading;

/**
 *
 * @author amit
 */
public class ThreadT implements Runnable {

    @Override
    public void run() {
        System.out.println("----------------Runnable block-----------");
        System.out.println("running from Runnable interface impl...");
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }

}
