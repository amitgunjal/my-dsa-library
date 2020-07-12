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
public class SwapTwoNumbers {

    static void swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap: " + num1 + " and  " + num2);
    }

    public static void main(String[] args) {
        System.out.println("Original number: " + 10 + " and " + 25);
        swap(10, 25);

    }
}
