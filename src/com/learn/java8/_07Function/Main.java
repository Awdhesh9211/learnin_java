package com.learn.java8._07Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ///                  apply     -- Single Abstract Method
        // 1️⃣ Example 1: Convert Celsius to Fahrenheit
        Function<Integer, Double> celsiusToFahrenheit = c -> (c * 9.0 / 5) + 32;
        System.out.println("25°C in Fahrenheit: " + celsiusToFahrenheit.apply(25));

        // 2️⃣ Example 2: Get length of a string (like username validation)
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Awdhesh': " + stringLength.apply("Awdhesh"));

        // 3️⃣ Example 3: Calculate 10% discount on a product price
        Function<Double, Double> discountFunction = price -> price - (price * 0.10);
        System.out.println("Price after discount: " + discountFunction.apply(2000.0));


        ///                  compose , andThen  ---- Default
        // Example: Employee name transformations
        Function<String, String> trimSpaces = String::trim;
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addGreeting = name -> "Hello, " + name;

        // Compose example (trim first, then uppercase)
        String composed = toUpperCase.compose(trimSpaces).apply("   awdhesh   ");
        System.out.println(composed);  // Output: AWDHESH

        // andThen example (uppercase, then greeting)
        String greeted = toUpperCase.andThen(addGreeting).apply("awdhesh");
        System.out.println(greeted);   // Output: Hello, AWDHESH

        ///                       identity  ---- STATIC

        // identity example
        Function<String, String> identityFunc = Function.identity();
        System.out.println(identityFunc.apply("No Change")); // Output: No Change


    }
}
