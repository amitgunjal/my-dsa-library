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
public class FibonacciNumber {
    
    static int getFibonacciNumber(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getFibonacciNumber(--num);
    }
    
    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(5));
    }
}
