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
public class ReverseArray {

    public static void main(String[] args) {
        int i, n, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers? \t");
        n = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + "\t");
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.print("\n\nOriginal array is :\t");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        for (c = n - 1, d = 0; c >= 0; c--, d++) {
            b[d] = a[c];
        }

        for (c = 0; c < n; c++) {
            a[c] = b[c];
        }

        System.out.print("\n\nReversed array is :\t");

        for (c = 0; c < n; c++) {
            System.out.print(a[c] + "\t");
        }
    }
}
