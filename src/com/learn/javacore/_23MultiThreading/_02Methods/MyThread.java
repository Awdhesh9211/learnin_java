package com.learn.javacore._23MultiThreading._02Methods;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + Thread.currentThread().getName() + "Priority "+Thread.currentThread().getPriority());
            Thread.yield();
        }
    }
}
