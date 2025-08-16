package com.learn.javacore._11Recursion;

public class Test {

    //factorial
    public static int fact(int n){
        //base case
        if(n==0) return 1;
        //return
        return n * fact(n-1);
    }




    public static void main(String[] args) {
        //1.factorial
        System.out.println(fact(5));

    }
}
