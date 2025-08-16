package com.learn.java8._08Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> shoppingList = Arrays.asList("Milk", "Bread", "Eggs");

        ///                accept --- Single Abstract Method
        // Consumer 1: Print each item
        Consumer<String> printItem = item -> System.out.println("Item: " + item);
        printItem.accept("Apple");// Item: Apple

        // Consumer 2: Print length of item
        Consumer<String> printLength = item -> System.out.println("Length: " + item.length());
        printLength.accept("Apple");

        ///                     andThen()      ---Default
        // Combine them
        Consumer<String> combined = printItem.andThen(printLength);
        // Apply on all shopping list items
        shoppingList.forEach(combined);
    }
}

