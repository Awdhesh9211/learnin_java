package com.learn.javacore._9OOPS._02Inheritance;

public class Test {

    //1.Singl level
    // Dog->Animal
    //2.Multilevel
    // Child->Parent->GrandParent
    //3.Hirarchical
    //Cat->Animal
    //Dog->Animal
    //4.Hybrid
    //Cat-Animal
    //Dog-Animal
    //GermanSephard->Dog
    //5.Multiple Possible by the Interfaces


    //child -> use this to acces its private member and also super to access it parent member and super() for parent constructor imediate parent






    public static void main(String[] args) {
        Cat cat=new Cat();
        Animal dog=new Dog(); // up casting abstraction
        dog.setName("Baba");
        dog.setAge(11);

        cat.makeSound();
        dog.makeSound();

        Child child=new Child();

    }
}
