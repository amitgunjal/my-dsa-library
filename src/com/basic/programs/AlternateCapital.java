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
public class AlternateCapital {

    static void make(String str) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (idx % 2 == 0) {
                sb.append(String.valueOf(c).toUpperCase());
            } else {
                sb.append(String.valueOf(c).toLowerCase());
            }
            if (!Character.isWhitespace(c) || (idx % 2 != 0)) {
                idx++;
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        make("We, are the world");
    }
}
