package com.learn.javacore._16InnerClass;

public class Computer {

    private String model;
    private String brand;
    private OperatingSystem os;

    public OperatingSystem getOs() {
        return os;
    }

    // static inner class
    static  class USB{
        private String type;
        public USB(String type){
            this.type=type;
        }
        public void displayInfo(){
            System.out.println("USB TYPE "+type);
        }

    }


    public Computer(String model, String brand, String os) {
        this.model = model;
        this.brand=brand;
        this.os = new OperatingSystem(os);
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer "+model+" "+"OS "+osName);
        }
    }
}
