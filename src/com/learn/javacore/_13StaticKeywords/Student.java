package com.learn.javacore._13StaticKeywords;

public class Student {

    private String name;
    private int age;
    private int id;

    public static int count=0;

    public Student(){count++;}


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
