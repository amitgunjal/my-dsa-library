/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading.adv;

/**
 *
 * @author amit
 */
public class MyTask implements Runnable {

    Long target;

    public MyTask(Long target) {
        this.target = target;
    }

    @Override
    public void run() {
        // business logic at here
        if (this.target % new Long(2) == 0) {
            System.out.println(Thread.currentThread().getName() + ", even: " + this.target);
        } else {
            System.out.println(Thread.currentThread().getName() + ", odd: " + this.target);
        }
    }
}
