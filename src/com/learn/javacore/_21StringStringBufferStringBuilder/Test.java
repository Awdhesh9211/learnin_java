package com.learn.javacore._21StringStringBufferStringBuilder;

public class Test {

    public static void main(String[] args) {
        //String
        String s="awdhesh";
             // uses string pool
             // immutable
             //slow

        //StringBuilder
        String res="";
        for (int i = 0; i < 100; i++) {
              res+="hello";
        }

        // String Builder Muttable Fast No Thread Safe    heap
        StringBuilder sb=new StringBuilder("I am");
        sb.append(" Awdhesh");
        System.out.println(sb);

        // StringBuffer Muttable Slower  Thread Safe       heap
        StringBuffer sbb=new StringBuffer("I am ");
        sbb.append(" Awdhesh");
        System.out.println(sbb);
    }
}
