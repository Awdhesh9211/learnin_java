package com.learn.javacore._03NonPrimitiveDataType;

import java.util.*;

/**
 * Simple demonstration of Java non-primitive data types
 * @author Java Developer
 */
public class NonPrimitiveDataTypesExample {

    public static void main(String[] args) {
        System.out.println("=== JAVA NON-PRIMITIVE DATA TYPES ===\n");

        // 1. STRING (Most Important Non-Primitive Type)
        System.out.println("1. STRING TYPE");
        System.out.println("---------------");

        String name = "Java Programming";
        String greeting = "Hello World!";
        String empty = "";                    // Empty string
        String nullString = null;             // Null reference

        System.out.println("String name: \"" + name + "\"");
        System.out.println("String length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("To uppercase: " + name.toUpperCase());
        System.out.println("Contains 'Java': " + name.contains("Java"));
        System.out.println("Empty string: \"" + empty + "\" (length: " + empty.length() + ")");
        System.out.println("Null string: " + nullString);

        // String immutability
        String original = "Hello";
        String modified = original.concat(" World");  // Creates new string
        System.out.println("Original: " + original + ", Modified: " + modified);

        // 2. WRAPPER CLASSES (Object versions of primitives)
        System.out.println("\n2. WRAPPER CLASSES");
        System.out.println("------------------");

        // Creating wrapper objects
        Integer intWrapper = 100;             // Autoboxing: int → Integer
        Double doubleWrapper = 99.99;         // Autoboxing: double → Double
        Boolean boolWrapper = true;           // Autoboxing: boolean → Boolean
        Character charWrapper = 'A';          // Autoboxing: char → Character

        System.out.println("Integer wrapper: " + intWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Boolean wrapper: " + boolWrapper);
        System.out.println("Character wrapper: " + charWrapper);

        // Unboxing (wrapper → primitive)
        int primitiveInt = intWrapper;        // Unboxing: Integer → int
        double primitiveDouble = doubleWrapper; // Unboxing: Double → double

        System.out.println("Unboxed int: " + primitiveInt);
        System.out.println("Unboxed double: " + primitiveDouble);

        // Utility methods of wrapper classes
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Double.parseDouble(\"123.45\"): " + Double.parseDouble("123.45"));
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));

        // null values (only for non-primitives)
        Integer nullInteger = null;
        System.out.println("Null Integer: " + nullInteger);

        // 3. ARRAYS (Collection of elements)
        System.out.println("\n3. ARRAYS");
        System.out.println("---------");

        // Different ways to create arrays
        int[] numbers = {1, 2, 3, 4, 5};           // Array literal
        String[] names = {"Ram", "Shyam", "Gita"}; // String array
        double[] prices = new double[3];            // Array with size
        prices[0] = 10.50;
        prices[1] = 20.75;
        prices[2] = 15.25;

        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("Names array: " + Arrays.toString(names));
        System.out.println("Prices array: " + Arrays.toString(prices));
        System.out.println("Array length: " + numbers.length);

        // Multi-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("2D array: " + Arrays.deepToString(matrix));

        // Array of objects
        Student[] students = {
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78)
        };
        System.out.println("Students array:");
        for (Student student : students) {
            System.out.println("  " + student);
        }

        // 4. USER-DEFINED CLASSES
        System.out.println("\n4. USER-DEFINED CLASSES");
        System.out.println("-----------------------");

        // Creating objects of custom classes
        Student student1 = new Student("David", 88);
        Car car1 = new Car("Toyota", "Camry", 2023);

        System.out.println("Student: " + student1);
        System.out.println("Car: " + car1);

        // Object methods
        System.out.println("Student grade: " + student1.getGrade());
        System.out.println("Car info: " + car1.getInfo());

        // null reference
        Student nullStudent = null;
        System.out.println("Null student: " + nullStudent);

        // 5. COLLECTIONS (Dynamic data structures)
        System.out.println("\n5. COLLECTIONS");
        System.out.println("--------------");

        // ArrayList (dynamic array)
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        System.out.println("Cities list: " + cities);
        System.out.println("First city: " + cities.get(0));
        System.out.println("List size: " + cities.size());

        // HashSet (unique elements)
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(2); // Duplicate, won't be added
        uniqueNumbers.add(3);
        System.out.println("Unique numbers: " + uniqueNumbers);

        // HashMap (key-value pairs)
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println("Ages map: " + ages);
        System.out.println("Alice's age: " + ages.get("Alice"));

        // 6. MEMORY AND REFERENCE COMPARISON
        System.out.println("\n6. MEMORY & REFERENCES");
        System.out.println("----------------------");

        // String references
        String str1 = "Hello";
        String str2 = "Hello";        // Same literal (string pool)
        String str3 = new String("Hello"); // New object in heap

        System.out.println("str1 == str2: " + (str1 == str2));         // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3));         // false (different reference)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)

        // Object references
        Student s1 = new Student("John", 90);
        Student s2 = new Student("John", 90);
        Student s3 = s1; // Same reference

        System.out.println("s1 == s2: " + (s1 == s2));         // false (different objects)
        System.out.println("s1 == s3: " + (s1 == s3));         // true (same reference)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // depends on equals() implementation

        // 7. COMMON PITFALLS
        System.out.println("\n7. COMMON PITFALLS");
        System.out.println("------------------");

        // NullPointerException
        String nullStr = null;
        try {
            int length = nullStr.length(); // Will throw NPE
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // Array bounds
        int[] smallArray = {1, 2, 3};
        try {
            int value = smallArray[5]; // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Memory comparison
        Integer num1 = 100;
        Integer num2 = 100; // Same value, may use same reference (caching)
        Integer num3 = 200;
        Integer num4 = 200; // Different objects for large numbers

        System.out.println("Small numbers (100): num1 == num2: " + (num1 == num2)); // likely true
        System.out.println("Large numbers (200): num3 == num4: " + (num3 == num4)); // likely false
        System.out.println("Always use .equals() for content comparison");
    }
}

/**
 * Student class for demonstration
 */
class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return name + " (" + marks + " marks)";
    }

    // Note: equals() and hashCode() not implemented for demonstration
}

/**
 * Car class for demonstration
 */
class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return year + " " + brand + " " + model;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}

/*
 * Key Points:
 * 1. Non-primitive types are reference types
 * 2. Default value is null
 * 3. Stored in heap memory
 * 4. Have methods and properties
 * 5. Use .equals() for content comparison
 * 6. Can cause NullPointerException
 *
 * Compile: javac NonPrimitiveDataTypesExample.java
 * Run: java NonPrimitiveDataTypesExample
 */
