package com.learn.javacore._9OOPS._04Abstraction;


// NOT PURE ABSTRACTION  - by abstract
// PURE ABSTRACTION - by interfaces
public abstract class Animal {

    private String name;
    private int age;

    //abstract method
    public abstract void sayHello();



    protected Animal() {

    }

    //concrete method
    public void slee(){
        System.out.println("ZZZZ....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
