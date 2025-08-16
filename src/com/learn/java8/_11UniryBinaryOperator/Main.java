package com.learn.java8._11UniryBinaryOperator;

import java.util.function.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ///  UnaryOperator<T> → one input, one output (same type)   use for Function<T,T>
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 6: " + square.apply(6));

        // UnaryOperator.identity()
        UnaryOperator<String> identity = UnaryOperator.identity();
        System.out.println(identity.apply("No Change"));

        /// BinaryOperator<T> → two inputs, one output (same type)  use for Function<T,T,T>
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(15, 25));

        // BinaryOperator with Comparator
               //minBy(comparator)
               //maxBy(comparator)
        BinaryOperator<Integer> min = BinaryOperator.minBy((a,b)->a-b);
        BinaryOperator<Integer> max = BinaryOperator.maxBy((a,b)->a-b);
        System.out.println("Min: " + min.apply(100, 200));
        System.out.println("Max: " + max.apply(100, 200));


    }
}

