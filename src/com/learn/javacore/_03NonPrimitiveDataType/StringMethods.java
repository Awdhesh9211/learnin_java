package com.learn.javacore._03NonPrimitiveDataType;

import java.nio.charset.StandardCharsets;

public class StringMethods {


    public static void main(String[] args) {
        String name="Ram";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        for(int i : name.getBytes(StandardCharsets.UTF_8)){
            System.out.print(i+" ");
        }
        System.out.println("\n"+name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("R","A"));
        System.out.println(name.contains("m"));
        System.out.println(name.substring(0,2));
        System.out.println(name.equals("Ram"));
        System.out.println(name.compareTo("Ram"));
        System.out.println(name.equalsIgnoreCase("ram"));
        System.out.println(name.compareToIgnoreCase("ram"));
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(name.trim());
        System.out.println(name.concat("Mere"));
        System.out.println(name.indexOf("R"));
        for (char c:name.toCharArray()){
            System.out.print(c);
        }
        System.out.println("\n"+name.endsWith("m"));
        System.out.println(String.format("hello %s","awdhesh"));
        char[] data={'d','e','t'};
        System.out.println(String.copyValueOf(data));
        System.out.println(String.valueOf(67));

    }
}
