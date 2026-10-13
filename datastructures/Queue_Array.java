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
public class Queue_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rear = -1;
        int front = -1;
        int item;
        System.out.print("Enter Size of Queue : \t ");
        int MAX = scan.nextInt();
        int QueueArray[] = new int[MAX];
        while (true) {
            System.out.println("\nQueue Operations  :");
            System.out.println("1.Insert/Add");
            System.out.println("2. Remove/Delete");
            System.out.println("3. Peek/Front item");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice :\t");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    if (rear == MAX - 1) {
                        System.out.println("Queue Overflow \n");
                    } else {
                        if (front == -1) {
                            front = 0;
                        }
                        System.out.print("Inset the element in queue : \t");
                        item = scan.nextInt();
                        rear = rear + 1;
                        QueueArray[rear] = item;
                    }

                    break;
                case 2:

                    if (front == -1 || front > rear) {
                        System.out.println("Queue Underflow \n");
                        return;
                    } else {
                        System.out.println("Element deleted from queue is " + QueueArray[front] + "\n");
                        front = front + 1;
                    }
                    break;
                case 3:
                    if (front == -1 || front > rear) {
                        System.out.println("Queue Underflow \n");
                        return;
                    } else {
                        System.out.println("The front element is : \t" + QueueArray[front]);
                    }
                    break;
                case 4:
                    if (front == -1 || front > rear) {
                        System.out.println("Queue Underflow \n");
                        return;
                    } else {
                        System.out.print("The current elements in queuue are :");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(QueueArray[i] + " ");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

        }
    }
}
