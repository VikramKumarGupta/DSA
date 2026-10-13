/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.pattern;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class TriangleWithNumbers {

    public static void main(String[] ars) {
        int i, j, n, k, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines[height of triangle] : \t");
        n = scan.nextInt();
        System.out.print("With which number do you want to fill the triangle : \t");
        num = scan.nextInt();
        scan.close();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print(num);
            }
            System.out.print("\n");
        }
    }
}
