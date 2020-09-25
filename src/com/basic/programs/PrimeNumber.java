/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.programs;

/**
 *
 * @author amit
 */
public class PrimeNumber {

    static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
            }
        }
        return !flag;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
