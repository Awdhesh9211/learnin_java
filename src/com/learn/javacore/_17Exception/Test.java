package com.learn.javacore._17Exception;

// Every Class extends Object

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test extends Object {
    //TYPE OF ERROR
    //1.Syntex Error -Programmer
    //2.Logical Error -Programmer
    //3.Run Time Error - System

    public static void main(String[] args) throws CustomeException {

        Bank bank=new Bank(10);
        bank.withdrow(12);

        try{
            int i=1/0;
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("I RUN");

//        try{
//            FileReader fileReader=new FileReader("a.txt");
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            throw new FileNotFoundException("File Not Found");
//        }

    }
}
