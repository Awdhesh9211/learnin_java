package com.learn.javacore._23MultiThreading;

public class MyThreadByRunnable implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("I am Thread ="+Thread.currentThread().getName());
        }
    }
}
