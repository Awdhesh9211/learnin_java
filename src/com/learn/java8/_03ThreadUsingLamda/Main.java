package com.learn.java8._03ThreadUsingLamda;

public class Main {


    public static void main(String[] args) {
        Runnable task1=()->{
            System.out.println("Task1");
        };
        Thread t1=new Thread(task1);
        t1.start();
    }
}
