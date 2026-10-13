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
public class DecrementElementsArray {

    public static void main(String[] args) {
        int i, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers? \t");
        n = scan.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + "\t");
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.print("\nOriginal array is :\t");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.print("\n\nDecremented Array is:\t");
        for (i = 0; i < n; i++) {
            a[i]--;
            System.out.print(a[i] + "\t");
        }
    }
}
