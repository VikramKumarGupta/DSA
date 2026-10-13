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
public class AverageElementsArray {

    public static void main(String[] args) {
        int n, i;
        Scanner scan = new Scanner(System.in);
        float sum = 0, average;
        System.out.print("How many numbers ?\t");
        n = scan.nextInt();
        float numbers[] = new float[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + "\t");
            numbers[i] = scan.nextFloat();
        }
        scan.close();
        for (i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        average = sum / n;
        System.out.print("\nThe average of " + n
                + "  numbers you entered is  :" + average);
    }
}
