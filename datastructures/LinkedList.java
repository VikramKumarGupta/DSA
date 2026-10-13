package com.hendi.codingcorner.datastructures;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
class Node {

    protected int data;
    protected Node link;

    public Node() {
        link = null;
        data = 0;
    }

    public Node(int d, Node n) {
        data = d;
        link = n;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getLink() {
        return link;
    }

    public int getData() {
        return data;
    }
}

class LL {

    protected Node start;
    protected Node end;
    public int size;

    public LL() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
    }

    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
    }

    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size) {
            Node s = start;
            Node t = start;
            while (s != end) {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

    public void display() {
        System.out.print("Elements in the list : ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData() + "\t");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "\t");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + "\n");
    }
}

public class LinkedList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        char ans = 'Y';
        LL ll = new LL();
        while (ans == 'Y' || ans == 'y') {
            System.out.println("\n1.Insert node at first");
            System.out.println("2.Insert node at last");
            System.out.println("3.Insert node at position");
            System.out.println("4.Delete Node from any Position");
            System.out.println("5.Display");
            System.out.println("6.Exit\n");
            System.out.print("Enter your choice: \t");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value for the node : \t");
                    ll.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value for the node : \t");
                    ll.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value for the node : \t");
                    int num = scan.nextInt();
                    System.out.print("Enter position : \t");
                    int pos = scan.nextInt();
                    if (pos <= 1 || pos > ll.size) {
                        System.out.println("Invalid position\n");
                    } else {
                        ll.insertAtPos(num, pos);
                    }
                    break;
                case 4:
                    System.out.print("Enter position: \t");
                    int dpos = scan.nextInt();
                    if (dpos < 1 || dpos > ll.size) {
                        System.out.println("Invalid position\n");
                    } else {
                        ll.deleteAtPos(dpos);
                    }
                    break;
                case 5:
                    ll.display();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("\nInvalid Choice\n");
                    break;
            }
            System.out.print("Do you want to continue ? (Y/N) \t");
            ans = scan.next().charAt(0);
        }
        scan.close();
    }
}
