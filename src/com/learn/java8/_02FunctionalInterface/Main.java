package com.learn.java8._02FunctionalInterface;

import java.lang.FunctionalInterface;

public class Main {


    public static void main(String[] args) {
       Employee enginner=()->"Awdhesh";
       Add add=(a,b)->a+b;
       System.out.println(enginner.name());
       System.out.println(add.add(4,5));


    }
}
