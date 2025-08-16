package com.learn.javacore._23MultiThreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        while(true){
            System.out.println("I am Thread ="+Thread.currentThread().getName());
        }
    }
}
