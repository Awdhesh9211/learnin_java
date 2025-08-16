package com.learn.javacore._9OOPS._01Incapsulation;

//1.Encapsulation (member+method)  in single unit
public class Car {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // data member
    private String color;
    private String model;
    private int year;
    private int speed;

    // member function / methods
    public void accelerate(int inc){
        speed +=inc;
    }
    public void brake(int dec){
        speed -=dec;
        if(speed<0){
            speed=0;
        }
    }
}
