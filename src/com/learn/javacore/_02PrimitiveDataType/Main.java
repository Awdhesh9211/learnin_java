package com.learn.javacore._02PrimitiveDataType;

public class Main {


    public static void main(String[] args) {
        // whole number
            //byte
        byte b=127;        // -128 to 127
            //short
        short s=32767;        // -32768 to 32767
            //int
        int i=2147483647;         // -2147483648 to 2147483647
            //long
        long l=9223372036854775807L;   // -9223372036854775808 to 9223372036854775807

        // decimal number
           //float
        float fl=3.4577f; //  1.4E-45 to  3.4028235E38
           //double
        double db=5.765454d; // 4.9E-324 to 1.7976931348623157E308

        // charachter
           //char            // 0 to 65535
        char ch='w';
        char heart=10084;
        char right='\u27A4';
        System.out.println(heart);
        System.out.println(right);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
//        for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
//            System.out.printf("%5d = %c%n", (int)c, c);
//        }


        // boolean
          //boolean
        boolean yes=true;

    }
}
