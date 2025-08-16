package com.learn.javacore._23MultiThreading._01LifeCycle;

public class Threadd extends Thread{

    //
    @Override
    public void run() {
        super.run();
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("RUNNING");
            if(i==2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
