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
public class ThreadGroupDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("running..." + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        ThreadGroup tg = new ThreadGroup("parent grp");

        Thread t = new Thread(tg, threadGroupDemo, "t");
        t.setPriority(4);
        t.start();
        Thread t2 = new Thread(tg, threadGroupDemo, "t2");
        t2.setPriority(5);
        t2.start();
        Thread t3 = new Thread(tg, threadGroupDemo, "t3");
        t3.setPriority(10);
        t3.start();

        System.out.println("Thread group items: ");
        tg.list();
        System.out.println("Max Thread priority from Thread grp: " + tg.getMaxPriority());
    }

}
