package com.learn.java8._06Predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {

    /// Predicate is FunctionalInterface
    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
//    boolean test(T t);
    // and / or / not / isEqual / negate

    private  static  class  Student{
        private  String name;
         private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }



    public static void main(String[] args) {
        Predicate<Integer> isNegative=x->x<0;
        Predicate<Integer> isPositive=x->x>0;

        // Simple condition     test Single Abstract Method
        System.out.println(isNegative.test(-67));
        System.out.println(isPositive.test(67));

        // and , or ,negate     --Default
        Predicate<Integer> and=isPositive.and(isNegative);
        Predicate<Integer> or=isPositive.and(isNegative);
        Predicate<Integer> isPositiveNegate=isPositive.negate();
        System.out.println(and.test(89));
        System.out.println(or.test(89));
        System.out.println(isPositiveNegate.test(8));





        Student s1=new Student("awdhesh",1);
        Student s2=new Student("rahul",2);

        Predicate<Student> isGreaterThan1=(x)->x.getId() >1;
        System.out.println(isGreaterThan1.test(s1));

        //not isEqual            --Static
        Predicate<Object> isEqual = Predicate.isEqual("rahul");
        Predicate<Object> notEqual = Predicate.not(isEqual);
        System.out.println(isEqual.test(s2.getName()));//true
        System.out.println(notEqual.test(s2.getName()));//false


    }
}
