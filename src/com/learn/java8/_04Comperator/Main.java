package com.learn.java8._04Comperator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Student{
        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return this.id + ":"+this.name;
        }
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"Awdhesh");
        Student s2=new Student(2,"Rahul");
        Student s3=new Student(3,"Mukesh");

        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //comperartor
        list.sort((a,b)->a.id - b.id); //ASC
        System.out.println(list);
        list.sort((a,b)->b.id-a.id);   //DESC
        System.out.println(list);

    }
}
