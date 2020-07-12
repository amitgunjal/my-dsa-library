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
public class Palindrome {

    static boolean isPalindrome(String str) {
        String str2 = "";
        for (int x = str.length() - 1; x >= 0; x--) {
            char c = str.charAt(x);
            str2 += c;
        }
        return str.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("12321"));
    }
}
