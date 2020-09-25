/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amit
 */
public class Main extends Thread {

    @Override
    public void run() {
        System.out.println("running from extending thread class impl...");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("\n-------------------------");
                /**
                 * Getting thread name
                 */
                System.out.println("Thread name: " + Thread.currentThread().getName());
                /**
                 * Getting thread priority
                 *
                 */
                System.out.println("Thread priority: " + Thread.currentThread().getPriority());
                /**
                 * '
                 * Sleeping a thread
                 */
                Thread.sleep(1000);
                System.out.print("Counter: " + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        /**
         * By extending Thread class
         */
        Main m = new Main();
        Main m2 = new Main();
        /*
        Setting priorities
         */
        m.setPriority(1);
        m2.setPriority(10);

        /*
        * Starting threads
         */
        m.start();
        /*
        * waiting for a thread to finish its exec
         */
        try {
            m.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        /**
         * Starting another thread
         */
        m2.start();

        /**
         * Implementing Runnable interface
         */
        ThreadT threadT = new ThreadT();
        Thread t = new Thread(threadT);
        Thread t2 = new Thread(threadT);
        t.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t.start();
        t2.start();

    }
}
