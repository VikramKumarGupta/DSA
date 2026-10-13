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
public class MaxDiffArray {

    public static void main(String[] args) {
        int i, n, l, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers? \t");
        n = scan.nextInt();
        int array[] = new int[n];
        int dup[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("\nEnter number " + (i + 1) + " \t");
            array[i] = scan.nextInt();
            dup[i] = array[i]; // storing the copy of of array[]
        }
        scan.close();

        for (i = 0; i < n; i++) // checking for largest
        {
            if (array[0] < array[i]) {
                array[0] = array[i];
            }
        }
        l = array[0]; // storing largest num
        System.out.print("\n\nThe largest among the " + n + " numbers is " + array[0]);

        for (i = 0; i < n; i++) // checking for smallest
        {
            if (dup[0] > dup[i]) // we used duplicate because original array[] has changed
            {
                dup[0] = dup[i];
            }
        }
        s = dup[0]; // storing smallest
        System.out.print("\nThe smallest among the " + n + " numbers is " + dup[0]);
        System.out.print("\n\nThe maximum difference among  numbers is " + (l - s));
    }
}
