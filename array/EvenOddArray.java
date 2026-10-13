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
public class EvenOddArray {

    public static void main(String[] args) {
        int i, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many elements ?\t");
        n = scan.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1));
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.print("\nThe Even Numbers are : \t");
        for (i = 0; i < n; i++) {

            if (a[i] % 2 == 0) {
                System.out.print(a[i] + "\t");
            }

        }
        System.out.print("\nThe Odd Numbers are : \t");
        for (i = 0; i < n; i++) {

            if (a[i] % 2 != 0) {
                System.out.print(a[i] + "\t");
            }

        }
    }
}
