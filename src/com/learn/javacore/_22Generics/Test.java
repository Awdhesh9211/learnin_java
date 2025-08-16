package com.learn.javacore._22Generics;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();

        arrayList.add("Hello");
        arrayList.add(123);

//        String s=(String) arrayList.get(0);  this is issue specify
//        int s=(Integer) arrayList.get(1);
        ArrayList<String> arrayList1=new ArrayList();
        arrayList1.add("dad");
//        arrayList1.add(2);  error <T> this is generics


        GenericTest<Integer> gs=new GenericTest();
        gs.setValue(234);
        System.out.println(gs.getValue());

        Pair<Integer,String> pair=new Pair<>();
        pair.setKey(0);
        pair.setValue("awdhesh");


        //Interface
        GenericContainer<String> genericContainer=new GenericContainer<>();
        genericContainer.add("awd");
        System.out.println(genericContainer.get());

        // <T extends Number>bounded
        // <T extends Number & Interface>
        // <T> void fun(T a)
        //  <?>  - wild card  only read only 
        //

    }
}
