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
public class DiamondWithStars {

    public static void main(String[] args) {
        int i, j, k, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines[height of diamond] : \t");
        n = scan.nextInt();
        scan.close();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
