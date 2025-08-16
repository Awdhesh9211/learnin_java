package com.learn.javacore._04Operator;

public class OperatorTest {


    public static void main(String[] args) {
        //arithmetic  -> +,-,*,%,/,^
        //assignment  -> =,+=,-=,*=,%=,/=,^=



        // Relational
        int a=1;
        int b=2;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        //Logiocal
        boolean expr1= true;
        boolean expr2= false;
        System.out.println(expr1 && expr2);  //BOTH true then true
        System.out.println(expr1 || expr2);  //ONE OF The true
        System.out.println(!expr1);          //NOT inverse

    }
}
