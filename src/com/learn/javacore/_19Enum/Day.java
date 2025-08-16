package com.learn.javacore._19Enum;

public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

//internally
//public final class Day extends java.lang.Enum<Day>{
//    public static final Day SUNDAY=new Day("SUNDAY",0);
//    public static final Day MONDAY=new Day("MONDAY",1);
//    public static final Day TUESDAY=new Day("TUESDAY",3);
//    public static final Day THURSDAY=new Day("THURSDAY",4);
//    public static final Day FRIDAY=new Day("FRIDAY",5);
//    public static final Day SATURDAY=new Day("SATURDAY",6);
//
//    private static  final Day[] VALUES= {
//            SUNDAY,
//            MONDAY,
//            TUESDAY,
//            THURSDAY,
//            FRIDAY,
//            SATURDAY
//    };
//    private  Day(String name,int ordinal){
//        super(name, ordinal);
//    }
//    public static Day[] values(){
//        return VALUES.clone();
//    }
//    public static Day valueOf(String name){
//        for(Day day:VALUES){
//            if(day.name().equals(name)){
//                return day;
//            }
//        }
//        throw new IllegalArgumentException("No Enum Constant "+ name);
//    }
//
//
//}
//
