package com.learn.javacore._07LoopStatement;

public class LoopTest {


    public static void main(String[] args) {

        //for loop
        for(int i=0;i<=3;i++){
            System.out.println("FOR LOOP");
        }
        //for :
        for(char c:new char[]{'a','b','c'}){
            System.out.printf("FOR : %c\n",c);
        }
        //while
        int i=2;
        while(i>0){
            System.out.println("WHILE "+i);
            i--;
        }
        //DO-WHILE
        do{
            System.out.println("DO once ");
        }while(false);
    }
}
