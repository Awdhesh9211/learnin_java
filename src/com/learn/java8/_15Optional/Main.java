package com.learn.java8._15Optional;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // ✅ Real-life example: A user may or may not have an email address
        String email1 = "awdhesh@example.com";
        String email2 = null; // email missing for some user

        // Wrapping values inside Optional
        Optional<String> optionalEmail1 = Optional.ofNullable(email1);
        Optional<String> optionalEmail2 = Optional.ofNullable(email2);

        // Example 1: Check presence of value
        if(optionalEmail1.isPresent()) {
            System.out.println("User1 Email: " + optionalEmail1.get());
        } else {
            System.out.println("User1 Email not provided");
        }

        if(optionalEmail2.isPresent()) {
            System.out.println("User2 Email: " + optionalEmail2.get());
        } else {
            System.out.println("User2 Email not provided");
        }

        // Example 2: orElse() - provide a default value
        String safeEmail1 = optionalEmail1.orElse("default@example.com");
        String safeEmail2 = optionalEmail2.orElse("default@example.com");

        System.out.println("Safe User1 Email: " + safeEmail1);
        System.out.println("Safe User2 Email: " + safeEmail2);

        // Example 3: ifPresent() - execute only if value exists
        optionalEmail1.ifPresent(email -> System.out.println("Sending newsletter to " + email));
        optionalEmail2.ifPresent(email -> System.out.println("Sending newsletter to " + email));

        // Example 4: orElseThrow() - throw custom exception if value missing
        try {
            String mustHaveEmail = optionalEmail2.orElseThrow(() -> new RuntimeException("Email is required!"));
            System.out.println("Critical User Email: " + mustHaveEmail);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Example 5: map() with Optional
        Optional<String> upperEmail = optionalEmail1.map(String::toUpperCase);
        System.out.println("Uppercase Email: " + upperEmail.orElse("No Email"));
    }
}

