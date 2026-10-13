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
public class PascalsTriangle {

    public static void main(String[] args) {
        int i, j, x, n, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines[height of triangle] : \t");
        n = scan.nextInt();
        scan.close();
        for (i = 0; i < n; i++) {
            x = 1;
            for (s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i + 1; j++) {
                System.out.print(" " + x);
                x = x * (i - j + 1) / j;
            }
            System.out.print("\n");
        }

    }
}
