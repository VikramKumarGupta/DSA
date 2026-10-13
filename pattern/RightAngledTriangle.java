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
public class RightAngledTriangle {

    public static void main(String[] args) {
        int i, j, n, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines[height of triangle] : \t");
        n = scan.nextInt();
        scan.close();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {

                System.out.print(k++);
            }
            System.out.print("\n");
        }
    }
}
