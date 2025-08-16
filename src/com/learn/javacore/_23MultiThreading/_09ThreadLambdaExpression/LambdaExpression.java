package com.learn.javacore._23MultiThreading._09ThreadLambdaExpression;

import java.util.concurrent.Callable;

public class LambdaExpression {


    public static void main(String[] args) {
        //Lamda expression is a anonymous function
        //Runnable is SAM interface if interface contain only one abstract method then we use lambda for it
        Runnable runnable=()-> System.out.println("Hello World");


        Thread t1=new Thread(runnable);
        Thread t2=new Thread(()-> System.out.println("Hi"));
        t1.start();
    }
}
