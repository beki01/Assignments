package com.ss.mar.jb.four;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer is a thread holds a content buffer (array) that the consumer will access and take
 * from only when there is content.
 */
public class Producer extends Thread {
    private static final int maxSize = 5;
    private final List<Integer> contentBuffer = new ArrayList<>();
    private int count = 0;


    //Create infinite loop where the producer thread will always produce
    @Override
    public void run() {
        try {
            while (true) {
                putContentinBuffer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Producer will be put in "wait" status for consumer if the buffer is full, else will produce content.
    private synchronized void putContentinBuffer() throws Exception {
        while (contentBuffer.size() == maxSize) {
            System.out.println("Buffer is full. Waiting for consumer");
            wait();
            System.out.println("Producer was notified from consumer");
        }

        contentBuffer.add(count);
        System.out.println(("Produced count: " + count));
        count++;
        notify();
    }

    //Public method used to "consume" content by consumer thread. If buffer is empty consumer will wait.
    public synchronized int consume() throws Exception {
        notify();
        while (contentBuffer.isEmpty()) {
            wait();
        }
        int data = contentBuffer.get(0);
        contentBuffer.remove(data);
        count--;

        return data;
    }

}
