package com.ss.mar.jb.four;

public class ProducerConsumer {
    /**
     * Initiates the Producer & Consumer threads.
     *
     */
    public static void main(String[]  args){
        Producer producer = new Producer();
        producer.setName("Produce Count  1 ");
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Consumer Count 1 ");
        consumer.start();


    }
}
