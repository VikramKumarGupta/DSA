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
public class FloydsTriangle {

    public static void main(String[] args) {
        int i, j, k = 1, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        n = scan.nextInt();
        scan.close();
        System.out.print("\nFLOYD'S TRIANGLE : \n");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++, k++) {
                System.out.print(k + "\t");
            }
            System.out.print("\n");
        }
    }
}
