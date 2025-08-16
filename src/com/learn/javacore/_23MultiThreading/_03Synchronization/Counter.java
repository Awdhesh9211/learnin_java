package com.learn.javacore._23MultiThreading._03Synchronization;

public class Counter {

    private  int count=0;

    //synchronized / synchronized(){}
    public  void increment(){
        synchronized (this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }

}
