package com.learn.java8._13StreamAPI;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // Sample list of products in a store
        List<String> products = Arrays.asList(
                "Laptop", "Phone", "Tablet", "Monitor", "Keyboard", "Mouse", "Phone", "Laptop");

        // 1️⃣ Stream with filter() → filtering products that start with "P"
        System.out.println("Products starting with 'P':");
        products.stream()
                .filter(p -> p.startsWith("P"))  // Only products starting with "P"
                .forEach(System.out::println);

        System.out.println("\n----------------------------------");

        // 2️⃣ Stream with map() → converting to uppercase
        System.out.println("Products in UPPERCASE:");
        products.stream()
                .map(String::toUpperCase) // Convert each product to uppercase
                .forEach(System.out::println);

        System.out.println("\n----------------------------------");

        // 3️⃣ Stream with distinct() → removing duplicates
        System.out.println("Unique Products:");
        products.stream()
                .distinct() // Remove duplicates
                .forEach(System.out::println);

        System.out.println("\n----------------------------------");

        // 4️⃣ Stream with sorted() → sorting alphabetically
        System.out.println("Sorted Products:");
        products.stream()
                .sorted() // Sort products alphabetically
                .forEach(System.out::println);

        System.out.println("\n----------------------------------");

        // 5️⃣ Stream with collect() → collecting into a Set
        Set<String> productSet = products.stream().collect(Collectors.toSet()); // Convert list → set
        System.out.println("Products in Set: " + productSet);

        System.out.println("\n----------------------------------");

        // 6️⃣ Stream with count() → total products
        long count = products.stream().count();
        System.out.println("Total number of products: " + count);

        System.out.println("\n----------------------------------");

        // 7️⃣ Stream with anyMatch(), allMatch(), noneMatch()
        boolean hasPhone = products.stream().anyMatch(p -> p.equals("Phone"));
        boolean allShortNames = products.stream().allMatch(p -> p.length() < 10);
        boolean noConsole = products.stream().noneMatch(p -> p.equals("Console"));

        System.out.println("Contains 'Phone'? " + hasPhone);
        System.out.println("All product names shorter than 10? " + allShortNames);
        System.out.println("No product named 'Console'? " + noConsole);

        System.out.println("\n----------------------------------");

        // 8️⃣ Stream with reduce() → joining names into one string
        String combined = products.stream()
                .reduce((a, b) -> a + ", " + b)
                .orElse("No products");
        System.out.println("Combined Products: " + combined);

        System.out.println("\n----------------------------------");

        // 9️⃣ Stream of Numbers → Square each number
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n) // Square each number
                .collect(Collectors.toList());
        System.out.println("Squares of Numbers: " + squares);

        System.out.println("\n----------------------------------");

        // 🔟 Parallel Stream → faster for big collections
        System.out.println("Parallel Stream Example:");
        numbers.parallelStream()
                .forEach(n -> System.out.println("Processed: " + n + " by " + Thread.currentThread().getName()));

    }
}

