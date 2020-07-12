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
public class SumOfDigits {

    static int getSumOfDigits(int num) {
        int sum = 0;
        int num2 = num;
        while (num2 > 0) {
            sum += num2 % 10;
            num2 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfDigits(0));
    }
}
