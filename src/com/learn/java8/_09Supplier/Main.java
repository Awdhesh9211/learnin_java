package com.learn.java8._09Supplier;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ///                      get()    ---- Single Abstract method
        // Supplier for default user
        Supplier<String> defaultUser = () -> "Guest";

        // Supplier for shopping cart items
        Supplier<List<String>> cartSupplier = () -> Arrays.asList("Milk", "Bread", "Eggs");

        // Supplier for generating unique order IDs
        Supplier<String> orderIdSupplier = () -> "ORD-" + (int)(Math.random() * 10000);

        System.out.println("Default User: " + defaultUser.get());
        System.out.println("Cart Items: " + cartSupplier.get());
        System.out.println("New Order ID: " + orderIdSupplier.get());
    }
}

