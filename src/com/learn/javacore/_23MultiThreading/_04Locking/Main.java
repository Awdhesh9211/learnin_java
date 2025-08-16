package com.learn.javacore._23MultiThreading._04Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    //LOCK
    //UNLOCK
    //TRYLOCK
    //lockInterruptability
    //DEADLOCK Prevention auto




    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();


        Runnable task=new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount.withdrow(24);
                } catch (Exception e) {

                }
            }
        };

        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        t1.start();
        t2.start();

    }
}
