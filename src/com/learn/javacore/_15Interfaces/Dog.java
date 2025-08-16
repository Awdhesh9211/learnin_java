package com.learn.javacore._15Interfaces;

public class Dog implements Animal,Domestic{
    @Override
    public void say() {
        System.out.println("Bow Bow ....");
    }
}
