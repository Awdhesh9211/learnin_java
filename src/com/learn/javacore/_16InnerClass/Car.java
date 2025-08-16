package com.learn.javacore._16InnerClass;

public class Car{

    private String model;
    private Boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }

    //INNER CLASS
    class Engine{

        void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model + " engine start");
            }else{
                System.out.println(model + " engine already start");
            }
        }
        void stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println(model + " engine stop");
            }else{
                System.out.println(model + " engine already stopeed");
            }
        }

    }
}
