package com.learn.javacore._23MultiThreading._09ThreadLambdaExpression.Lambda;

public class Test {

    public static void main(String[] args) {
        Student st=name->name;
        System.out.println(st.name("hello"));

    }
}
