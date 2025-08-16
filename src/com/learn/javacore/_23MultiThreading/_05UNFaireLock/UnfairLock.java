package com.learn.javacore._23MultiThreading._05UNFaireLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {

    //Faireness    if one of thread not get cpu that means starvation prevent by true in para
    //Blocking
    //Interruptability
    //Read/Write Locking

    // Syncronized cons
       //faireness
       //blocking
       //interruptability
       //Read / write locking

    private final Lock unfaireLock=new ReentrantLock(true);

    public void accessResource(){
        unfaireLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() +" acuired | ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            unfaireLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UnfairLock unfairLock=new UnfairLock();

        Runnable task=new Runnable() {
            @Override
            public void run() {
                unfairLock.accessResource();
            }
        };

        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3=new Thread(task,"Thread 3");

        t1.start();
        Thread.sleep(50);
        t2.start();
        Thread.sleep(50);
        t3.start();


    }
}
