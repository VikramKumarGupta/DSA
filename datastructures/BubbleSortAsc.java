package com.hendi.codingcorner.datastructures;

import java.util.Arrays;

/**
 *
 * @author hendisantika
 */
public class BubbleSortAsc {

    public static void main(String[] args) {

//        int list[] = {5, 3, 9, 7, 1, 8};
        int[] list = {98, 34, 55, 12, 9, 1, 4, 56,0};
        System.out.println("Final result:" + Arrays.toString(BubbleSortAsc(list)));
    }

    public static int[] BubbleSortAsc(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println((i + 1) + " iteration result: " + Arrays.toString(arr));
        }
        return arr;
    }

}
