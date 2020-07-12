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
public class ArmStrongNumber {

    public static boolean isArmStrongNumber(int num) {
        int x = 0;
        int num1 = num;
        int sum = 0;
        while (num1 > 0) {
            x = num1 % 10;
            num1 /= 10;
            sum += x * x * x;
            x++;
        }
        return num == sum;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));
    }
}
