package com.learn.javacore._9OOPS._03Polymorphism;

public class Calculater extends Factorial{

    //TWO TYPES OF POLYMORPHISM
    //1.compile time
        //by method overloading - changing method signature
    public static int add(int a,int b){return a+b;}
    public static  long add(int a,long b){return a+b;}


    //2.Run Time
        //by changing body of method by child class
    @Override
    public int fact(int n){
        if(n==1)return 1;
        return n*fact(n-1);
    }



    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3543343433433l));
        Calculater calculater=new Calculater();
        System.out.println(calculater.fact(9));

    }
}
