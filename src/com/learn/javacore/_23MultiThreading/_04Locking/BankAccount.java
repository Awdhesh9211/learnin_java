package com.learn.javacore._23MultiThreading._04Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    //EXPLICIT LOCKING
    private Lock lock=new ReentrantLock();

    private int balance =100;

    public void withdrow(int amount)  {
        System.out.println(Thread.currentThread().getName() + " attemts to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Processing");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed Balance Remaining "+balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " couldnt acuired the lock try again.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
