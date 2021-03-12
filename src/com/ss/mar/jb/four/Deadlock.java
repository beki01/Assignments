package com.ss.mar.jb.four;

public class Deadlock {
    public static void main(String[] args) {
        final String str1 = "String1";
        final String str2 = "String2";

        System.out.println("Beginning of deadlock class.");

        Thread thread1 = new Thread() {
            public void run() {
                synchronized (str1) {
                    System.out.println("Thread 1: Locked 1st resource");

                    try {
                        Thread.sleep(100);
                        synchronized (str2) {
                        }

                    } catch (Exception e) {
                        System.out.println("Exception occurred in Thread1");
                        e.printStackTrace();
                    }
                }
            }

        };

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (str2) {
                    System.out.println("Thread 2: Locked 2nd resource");

                    try {
                        Thread.sleep(100);
                        synchronized (str1) {
                        }
                    } catch (Exception e) {
                        System.out.println("Exception occurred in Thread2");
                        e.printStackTrace();
                    }
                }
            }
        };

        thread1.start();
        thread2.start();

    }
}
