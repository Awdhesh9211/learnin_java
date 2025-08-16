package com.learn.javacore._23MultiThreading._03Synchronization;

public class Test {

    // when multiple thread modify same object then for atomicity and mutual exclusion(prevent simaltanious access) thread safty we use synchronized
//    public  void increment(){
//        synchronized (this){
//            count++;
//        }
//    }   or
//    public synchronized void increment(){
//            count++;
//    }

    // note :- one thread access object/resources at time one by one by locking resources
                //intrinsic - automatic lock every object has lock in java
                //explicit  - advance lock by using Lock class when to lock and when to unlock



    public static void main(String[] args) throws InterruptedException {
        Counter  counter=new Counter();
        MyThread myThread=new MyThread(counter);
        MyThread myThread1=new MyThread(counter);

        myThread.start();
        myThread1.start();
        myThread1.join();
        myThread.join();

        System.out.println(counter.getCount());
    }
}
