/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.datastructures;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class StackOperations {

    static final int MAX = 10;
    static int top = -1;
    static int stack[] = new int[MAX];

    public static void main(String[] args) {
        int element, choice, d;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\nSTACK OPERATIONS \n\n");
            System.out.print("1.Insert \n");
            System.out.print("2.Delete \n");
            System.out.print("3.Display \n");
            System.out.print("4.Exit\n\n");
            System.out.print("Enter your choice. \t");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (top == MAX - 1) {
                        System.out
                                .print("\nSTACK is already full. Delete some elements and try again ! \n ERROR : STACK OVERFLOW\n");
                    } else {
                        System.out.print("\nEnter the value to insert.\t");
                        element = scan.nextInt();
                        push(element);
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out
                                .print("\nSTACK is already empty. \n ERROR : STACK UNDERFLOW\n");
                    } else {
                        element = pop();
                        System.out.println("Element removed from stack is " + element);
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out
                                .print("\nSTACK is empty. Cannot display anything\n");
                    } else {
                        System.out.println("There are " + (top + 1) + " elements in stack.");

                        for (d = top; d >= 0; d--) {
                            System.out.println(stack[d]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    return;
            }

        }
    }

    private static int pop() {
        int element;
        if (top == -1) {
            return top;
        }

        element = stack[top];
        top--;

        return element;
    }

    private static void push(int value) {
        top++;
        stack[top] = value;

    }
}
