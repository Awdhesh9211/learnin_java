package com.learn.javacore._03NonPrimitiveDataType;

public class StringType {

    public static void main(String[] args) {
        String s="awdhesh"; // new String("")

        String a=new String("Ram");
        String b=new String("Ram");
        System.out.println(a==b); //differente location  due to object creation false

        String c="Ram";
        String d="Ram";
        System.out.println(c==d); // same location due to String Pool    true

    }
}
