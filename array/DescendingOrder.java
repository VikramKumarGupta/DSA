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
public class DescendingOrder {

    public static void main(String[] args) {

        int i, j, no, temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of Elements: \t");
        no = scan.nextInt();
        int arr[] = new int[no];
        for (i = 0; i < no; i++) {
            System.out.print("\nEnter Element" + (i + 1));
            arr[i] = scan.nextInt();
        }
        scan.close();
        for (i = 0; i < no; i++) {
            for (j = i; j < no; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nSorted array: ");
        for (i = 0; i < no; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
