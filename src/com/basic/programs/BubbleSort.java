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
public class BubbleSort {

    static void sort(Integer... arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for (Integer arr1 : arr) {
            System.out.print(" " + arr1);
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {0, 1, 0, 1, 0, 0, 4, 0};
        sort(arr);
    }
}
