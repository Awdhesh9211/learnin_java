package com.learn.javacore._06ConditionalStatement;

public class CondTest {


    public static void main(String[] args) {
        int age=50;
        int marks=35;

        // IF
        if(age>30) System.out.println("Good");
        // IF-ELSE
        if(age>30){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
        // ELSE_IF
        if(age>60){
            System.out.println("stage 1");
        }else if(marks >34){
            System.out.println("stage 2");
        }else{
            System.out.println("stage 3");
        }

        int day=0;
        // Switch
        switch(day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            default:
                System.out.println("FFFF");

        }
    }
}
