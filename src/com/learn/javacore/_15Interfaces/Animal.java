package com.learn.javacore._15Interfaces;

// INTERFACE - (abstract method + static method + concreate no constructor ) also we can write main method
// DEFAULT   - method are public abstract
//           - data member are public static final
public interface Animal {
    Boolean livingBing=true;
    int MAX_AGE=900;
    void say();

    //static
    static void iAm(){
        System.out.println("I am a Animal");
    }

    //concreate method bu default
    default void hi(){
        System.out.println("hi from "+ this.getClass().getName());
    }



}
