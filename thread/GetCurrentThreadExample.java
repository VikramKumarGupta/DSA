/*
        Get Current Thread Example
        This Java example shows how to get reference of current thread using
        currentThread method of Java Thread class.
 */
package com.hendi.codingcorner.thread;

/**
 *
 * @author hendisantika
 */
public class GetCurrentThreadExample {

    public static void main(String[] args) {

        /*
                 * To get the reference of currently running thread, use
                 * Thread currentThread() method of Thread class.
                 *
                 * This is a static method.
         */
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);

    }
}


/*
Output of the example would be
Thread[main,5,main]
*/