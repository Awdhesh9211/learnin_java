package com.learn.javacore._05Prints;

public class Main {

    public static void main(String[] args) {

        // ============ PRINTLN EXAMPLES ============
        System.out.println("=== println() Examples ===");
        System.out.println("Hello World");           // Basic string
        System.out.println(42);                      // Integer
        System.out.println(3.14159);                 // Double
        System.out.println(true);                    // Boolean
        System.out.println('A');                     // Character
        System.out.println();                        // Empty line

        // ============ PRINT EXAMPLES ============
        System.out.println("=== print() Examples ===");
        System.out.print("Hello ");
        System.out.print("World ");
        System.out.print("without ");
        System.out.print("new lines");
        System.out.println(); // Add newline manually
        System.out.println();

        // ============ PRINTF EXAMPLES ============
        System.out.println("=== printf() Examples ===");

        // String formatting
        String name = "Awdhesh";
        int age = 25;
        double salary = 75000.50;

        System.out.printf("Hello %s%n", name);
        System.out.printf("Name: %s, Age: %d%n", name, age);
        System.out.printf("Employee: %s | Age: %d | Salary: $%.2f%n", name, age, salary);

        // Number formatting
        System.out.printf("Integer: %d%n", 42);
        System.out.printf("Float: %.2f%n", 3.14159);
        System.out.printf("Scientific: %e%n", 123456.789);
        System.out.printf("Hexadecimal: %x%n", 255);
        System.out.printf("Octal: %o%n", 64);

        // Width and alignment
        System.out.printf("Right aligned: %10s|%n", "Java");
        System.out.printf("Left aligned: %-10s|%n", "Java");
        System.out.printf("Zero padded: %05d%n", 42);

        // Date formatting example
        java.util.Date now = new java.util.Date();
        System.out.printf("Current date: %tF%n", now);
        System.out.printf("Current time: %tT%n", now);

        // Multiple format specifiers
        System.out.printf("Product: %s | Price: $%.2f | Stock: %d units%n",
                "Laptop", 999.99, 15);

        // ============ ADVANCED EXAMPLES ============
        System.out.println("\n=== Advanced Examples ===");

        // Combining different methods
        System.out.print("Loading");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(500); // Pause for effect
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(" Complete!");

        // Table-like output using printf
        System.out.println("\n--- Employee Table ---");
        System.out.printf("%-15s %-5s %-10s%n", "Name", "Age", "Salary");
        System.out.printf("%-15s %-5s %-10s%n", "----", "---", "------");
        System.out.printf("%-15s %-5d $%-9.2f%n", "John Doe", 30, 65000.00);
        System.out.printf("%-15s %-5d $%-9.2f%n", "Jane Smith", 28, 72000.50);
        System.out.printf("%-15s %-5d $%-9.2f%n", "Bob Johnson", 35, 58000.75);
    }
}