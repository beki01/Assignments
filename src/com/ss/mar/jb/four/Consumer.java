package com.ss.mar.jb.four;

/**
 * Consumer is a thread that will take a Producer thread and use the buffer in it. It will use the public method of the
 * Producer to "consume" content.
 */
public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer){
        this.producer = producer;
    }

    //Create an infinite loop where the consumer thread will always try to consume.
    @Override
    public void run(){
        try {
            while(true){
                int data = producer.consume();
                System.out.println(("Consumed by: " + Thread.currentThread().getName() +": count: "+ data));
                //So it wont outpace each other consumer will be put to sleep.
                Thread.sleep(500);
            }
        }catch (Exception e){
                e.printStackTrace();
        }

    }
}
