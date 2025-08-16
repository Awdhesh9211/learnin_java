package com.learn.javacore._07LoopStatement;

public class LoopTest {

    public static void main(String[] args) {

        // -------------------------------
        // 1. FOR LOOP (Traditional)
        // -------------------------------
        System.out.println("=== FOR LOOP ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("Iteration: " + i);
        }

        // -------------------------------
        // 2. FOR-EACH LOOP (Enhanced For Loop)
        // -------------------------------
        System.out.println("\n=== FOR-EACH LOOP ===");
        char[] chars = {'a', 'b', 'c'};
        for (char c : chars) {
            System.out.println("Character: " + c);
        }

        // -------------------------------
        // 3. WHILE LOOP
        // -------------------------------
        System.out.println("\n=== WHILE LOOP ===");
        int i = 3;
        while (i > 0) {
            System.out.println("Countdown: " + i);
            i--;
        }

        // -------------------------------
        // 4. DO-WHILE LOOP
        // -------------------------------
        System.out.println("\n=== DO-WHILE LOOP ===");
        int num = 1;
        do {
            System.out.println("This runs at least once → num = " + num);
            num--;
        } while (num > 0);

        // -------------------------------
        // 5. NESTED LOOP Example
        // -------------------------------
        System.out.println("\n=== NESTED LOOP ===");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + " "); // Multiplication table
            }
            System.out.println();
        }
    }
}
