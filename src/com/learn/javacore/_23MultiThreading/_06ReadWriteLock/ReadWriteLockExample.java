package com.learn.javacore._23MultiThreading._06ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private int count=0;

    private final ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    private final Lock readLock=lock.readLock();
    private final Lock writeLock=lock.writeLock();

    public void increment(){
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }
    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample readWriteLockExample=new ReadWriteLockExample();

        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(readWriteLockExample.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    readWriteLockExample.increment();
                    System.out.println("Writing");
                }
            }
        };
        Thread writeThread=new Thread(writeTask,"write1");
        Thread readThread=new Thread(readTask,"Read1");
        Thread readThread1=new Thread(readTask,"Read2");
        writeThread.start();
        readThread.start();
        readThread1.start();

        writeThread.join();
        readThread.join();
        readThread1.join();

    }


}
