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
public class SumOfElementsArray {

    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many elements do u want to add ?\t");
        n = scan.nextInt();
        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("\nEnter number" + (i + 1));
            array[i] = scan.nextInt();
        }
        scan.close();
        for (i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.print("\nThe sum of " + n + " numbers is " + sum);
    }
}
