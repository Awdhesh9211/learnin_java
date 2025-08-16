package com.learn.javacore._13StaticKeywords;

public class Test {

    //static -> block , method , class , inner class making class level
    //for memory management
    //cannot use non-static member and method
    //cannot use this and super

    static {
        System.out.println("I am a Static Block");
    }


    public static void main(String[] args) {
        Student st=new Student();
        Student st1=new Student();
        Student st2=new Student();
        Student st3=new Student();
        Student st4=new Student();

        st.setName("Awdhesh");
        System.out.println(Student.count);//static


        System.out.println(School.getInstance().getName());
    }
}
