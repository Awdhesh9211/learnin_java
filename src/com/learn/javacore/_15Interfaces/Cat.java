package com.learn.javacore._15Interfaces;

public class Cat implements  Animal , Domestic{
    @Override
    public void say() {
        System.out.println("Myau Byau ....");
    }
}
