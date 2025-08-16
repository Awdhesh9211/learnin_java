package com.learn.javacore._16InnerClass;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reserveRooms;

    public Hotel(String name, int totalRooms, int reserveRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reserveRooms = reserveRooms;
    }

    public void reserveRoom(String guestName,int numOfRoom){
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty !");
                    return  false;
                }
                if(numOfRoom <0){
                    System.out.println("Number of room should be positive");
                    return false;
                }
                if(reserveRooms + numOfRoom > totalRooms){
                    System.out.println("Not enough Room");
                    return false;
                }
                return true;
            }

        }
        if(new ReservationValidator().validate()){
            reserveRooms +=numOfRoom;
            System.out.println("Reservation Confirm for the "+guestName +" for "+numOfRoom);
        }else{
            System.out.println("Reservation Failed");
        }
    }
}
