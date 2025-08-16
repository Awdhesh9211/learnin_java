package com.learn.java8._05AnonymousInnerClassAndLambdaExpression;


public class Main {

    public static void main(String[] args) {

        //lambda expression
        Department department=()->"IT Cell";
        System.out.println(department.getDepartment());

        //Anonymous Class
        Employee softwareEngineer=new Employee() {
            @Override
            public long getSalary() {
                return 15000;
            }

            @Override
            public String getDesignation() {
                return "Full Stack dev";
            }
        };

        System.out.println(softwareEngineer.getSalary());
        System.out.println(softwareEngineer.getDesignation());
    }
}
