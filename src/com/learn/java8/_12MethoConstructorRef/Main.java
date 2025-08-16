package com.learn.java8._12MethoConstructorRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

///    🚀 Method Reference (::)
///
///    Method reference is a shorthand of lambda expressions to call an existing method.
///
///    There are 4 types:
///
///    1.Reference to a static method -> ClassName::staticMethod
///    2.Reference to an instance method of a particular object -> ClassName cn=new ClassName()->cn::method
///    3.Reference to an instance method of an arbitrary object -> String::toUppercase
///    4.Reference to a constructor-> ClassName::new




    // A static method
    public static void printMessage(String message) {
        System.out.println("Static Method says: " + message);
    }

    // An instance method
    public void printUpperCase(String message) {
        System.out.println("Instance Method says: " + message.toUpperCase());
    }

    public static void main(String[] args) {

        // ✅ 1. Reference to a static method
        // Instead of writing: (msg) -> Main.printMessage(msg)
        // We can write:
        List<String> messages = Arrays.asList("Hello", "Java", "World");
        messages.forEach(Main::printMessage);

        System.out.println("----------");

        // ✅ 2. Reference to an instance method of a particular object
        Main obj = new Main();
        // Instead of: msg -> obj.printUpperCase(msg)
        messages.forEach(obj::printUpperCase);

        System.out.println("----------");

        // ✅ 3. Reference to an instance method of an arbitrary object
        // Example: String::toLowerCase applies to any String object in the stream
        List<String> words = Arrays.asList("JAVA", "PROGRAMMING", "ROCKS");
        words.stream()
                .map(String::toLowerCase) // instead of s -> s.toLowerCase()
                .forEach(System.out::println);

        System.out.println("----------");

        // ✅ 4. Reference to a constructor
        // Example: Supplier creates new object using constructor reference
        Supplier<Main> supplier = Main::new; // instead of () -> new Main()
        Main newObj = supplier.get();
        newObj.printUpperCase("constructor reference created me!");

        // Another example with Function
        Function<String, StringBuilder> stringBuilderCreator = StringBuilder::new;
        StringBuilder sb = stringBuilderCreator.apply("Hello Constructor Ref!");
        System.out.println(sb.reverse());
    }
}
