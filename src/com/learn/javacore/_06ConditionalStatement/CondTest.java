package com.learn.javacore._06ConditionalStatement;

import java.util.Scanner;

public class CondTest {

    public static void main(String[] args) {
        int age = 50;
        int marks = 35;
        int day = 0;

        // -------------------------------
        // IF Statement
        // -------------------------------
        if (age > 30) {
            System.out.println("Age is greater than 30 → Good!");
        }

        // -------------------------------
        // IF-ELSE Statement
        // -------------------------------
        if (age < 30) {
            System.out.println("Age is less than 30 → Young!");
        } else {
            System.out.println("Age is greater or equal to 30 → Mature!");
        }

        // -------------------------------
        // IF-ELSE IF Ladder
        // -------------------------------
        if (age > 60) {
            System.out.println("Stage 1: Senior Citizen");
        } else if (marks > 34) {
            System.out.println("Stage 2: Pass");
        } else {
            System.out.println("Stage 3: Fail");
        }

        // -------------------------------
        // SWITCH Statement
        // -------------------------------
        switch (day) {
            case 0:
                System.out.println("Day: Sunday");
                break;
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            default:
                System.out.println("Invalid Day!");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day num.");
        day=sc.nextInt();

        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        try{
            System.out.println(days[day]);
        } catch (Exception e) {
            System.out.println(" Invalid Day! ");
        }



        // -------------------------------
        // TERNARY Operator (Short If-Else)
        // -------------------------------
        String result = (marks >= 35) ? "PASS ✅" : "FAIL ❌";
        System.out.println("Result based on marks: " + result);
    }
}
