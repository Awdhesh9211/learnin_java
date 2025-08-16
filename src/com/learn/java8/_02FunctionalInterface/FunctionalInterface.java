package com.learn.java8._02FunctionalInterface;

///              FUNSTIONAL INTERFACE - single abstract method and static and default method that can be used as lambda


@java.lang.FunctionalInterface
public interface FunctionalInterface {
    int add(int a,int b);

    ///complete definition / cannot override
    static void getInfo(){
        System.out.println("I am Functional interface");
    }

    default void sayOk(){
        System.out.println("OK");
    }

}
