/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading.adv;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author amit
 */
public class ExecuterService {

    public static void main(String[] args) {

        long st = System.currentTimeMillis();

        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Long> objects = getList();
        objects.forEach((o) -> {
            service.execute(new MyTask(o));
        });

        service.shutdown();
        try {
            service.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finishes at: " + (System.currentTimeMillis() - st) + " msecs.");
    }

    static List<Long> getList() {
        List<Long> al = new ArrayList<>();
        for (long i = 0; i < 9999; i++) {
            al.add(i);
        }
        return al;
    }
}
