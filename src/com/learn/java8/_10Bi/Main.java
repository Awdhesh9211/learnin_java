package com.learn.java8._10Bi;


import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // 1. BiPredicate → Eligibility check
        BiPredicate<Integer, Double> loanEligibility = (age, salary) -> age >= 21 && salary >= 30000;
        System.out.println("Eligible (25, 40000): " + loanEligibility.test(25, 40000.0));
        System.out.println("Eligible (19, 50000): " + loanEligibility.test(19, 50000.0));

        // 2. BiFunction → Calculate total bill
        BiFunction<Double, Double, Double> totalBill = (price, tax) -> price + (price * tax / 100);
        System.out.println("Total bill (1000 + 18%): " + totalBill.apply(1000.0, 18.0));

        // 3. BiConsumer → Print user info
        BiConsumer<String, String> userInfo = (username, email) ->
                System.out.println("User: " + username + ", Email: " + email);
        userInfo.accept("Awdhesh", "awdhesh@example.com");
    }
}
