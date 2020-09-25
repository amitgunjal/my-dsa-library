/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author amit
 */
public class HashmapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();  //implements map interface  
        hm.put(110, "Ravi");
        hm.put(120, "Prateek");
        hm.put(130, "Davesh");
        hm.put(140, "Kamal");
        hm.put(150, "Pawan");

        System.out.println("Using stream: ");
        hm.keySet().stream().forEach(k -> {
            System.out.println(k + ": " + hm.get(k));
        });

        System.out.println("\nUsing iterator:");
        Iterator itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            int k = (int) itr.next();
            System.out.println(k + ": " + hm.get(k));
        }

        System.out.println("\nUsing Map.entry");

        for (Map.Entry<Integer, String> entrySet : hm.entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }
    }
}
