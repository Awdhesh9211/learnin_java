// package is nothing but folder
package com.learn.javacore._01Hello;

// class is blueprint {data member + member function}
// class can be a default or public
public class Test {

    // entry point of java
    // public static void main(String[] args) -- signature
    // public - access modifier anywhere
    // static - calling function without instance related to the Class
    // void   - return
    // args   - arguments of method
    public static void main(String[] args) {
        //System - a class in the java.lang provide access (System + cxpnsole)
        //out    - instance of PrintStream class
        //println - method
        System.out.println("Hello World!");
    }
}
