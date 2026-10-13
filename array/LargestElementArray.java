/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.array;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class LargestElementArray {

    public static void main(String[] args) {
        int i, n;
        System.out.print("How many numbers ?\t");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("\nEnter number " + (i + 1));
            array[i] = scan.nextInt();
        }
        scan.close();
        for (i = 0; i < n; i++) {
            if (array[0] < array[i]) {
                array[0] = array[i];
            }
        }
        System.out.print("\nThe largest among the" + n + " numbers is "
                + array[0]);
    }
}
