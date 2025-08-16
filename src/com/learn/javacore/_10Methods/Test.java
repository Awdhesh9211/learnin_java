package com.learn.javacore._10Methods;

public class Test {

    // method signature is name and parameter
    // accessModifier returnType methodName(para){return }
    public void add(int a,int b){
        System.out.println("ADD="+(a+b));
    }

    // method overloading
    public void  add(int a,int b,int c){
        System.out.println("ADD="+(a+b+c));
    }
    public  int add(int a){
        return a;
    }


    public static void main(String[] args) {
        Test t=new Test();
        t.add(3,4);
        t.add(3,4,5);
    }
}
