package com.learn.javacore._16InnerClass;

// TYPE OF INNER CLASS
//1.Member Inner Class
   // inner class behave as a member of outer class
//Car car=new Car("TATA");
//Car.Engine engine=car.new Engine();

//2.Static Nested Class
// static inner class
//static  class USB{
//    private String type;
//    public USB(String type){
//        this.type=type;
//    }
//    public void displayInfo(){
//        System.out.println("USB TYPE "+type);
//    }
//
//}
//Computer.USB usb=new Computer.USB("Type-C");

//3.Local Inner Class
//public void reserveRoom(String guestName,int numOfRoom){
//    class ReservationValidator{
//        boolean validate(){
//            if(guestName == null || guestName.isBlank()){
//                System.out.println("Guest name can not be empty !");
//                return  false;
//            }
//            if(numOfRoom <0){
//                System.out.println("Number of room should be positive");
//                return false;
//            }
//            if(reserveRooms + numOfRoom > totalRooms){
//                System.out.println("Not enough Room");
//                return false;
//            }
//            return true;
//        }
//
//    }
//    if(new ReservationValidator().validate()){
//        reserveRooms +=numOfRoom;
//        System.out.println("Reservation Confirm for the "+guestName +" for "+numOfRoom);
//    }else{
//        System.out.println("Reservation Failed");
//    }
//}


//4.Anonymous Inner Class
//ShoppingCart shoppingCart=new ShoppingCart(1500);
//        shoppingCart.processPayment(new Payment() {
//    @Override
//    public void pay(double amount) {
//        System.out.println("Paid "+amount+" using GPay.");
//    }
//});


public class Test {


    public static void main(String[] args) {
        //1
        Car car=new Car("TATA");
        Car.Engine engine=car.new Engine();

        engine.start();
        engine.start();
        engine.stop();
        engine.stop();

        //2
        Computer computer=new Computer("ABC","HP","WINDOW11");
        computer.getOs().displayInfo();
        Computer.USB usb=new Computer.USB("Type-C");

        //3
        Hotel hotel=new Hotel("OYO",10,0);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);
        hotel.reserveRoom("Awdhesh",2);

        //4
        ShoppingCart shoppingCart=new ShoppingCart(1500);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount+" using GPay.");
            }
        });

    }
}
