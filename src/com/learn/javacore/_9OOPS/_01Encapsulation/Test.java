package com.learn.javacore._9OOPS._01Encapsulation;

public class Test {


    public static void main(String[] args) {
        Car car=new Car();
        //member  no error when default
//        car.color="Blue";
        car.setColor("Blue");
//        car.speed=40;
        car.setSpeed(40);
//        car.model="maruti";
        car.setModel("maruti");
//        car.year=1990;
        car.setYear(1990);
        //method
        car.brake(23);
//        System.out.println(car.speed);
        System.out.println(car.getSpeed());
        car.accelerate(23);
//        System.out.println(car.speed);
        System.out.println(car.getSpeed());

    }
}
