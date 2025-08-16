# Java Non-Primitive Data Types - Quick Reference Guide

## Overview

Java mein **Non-primitive data types** reference types hain jo objects ko refer karte hain. Ye heap memory mein store hote hain aur default value `null` hoti hai.

```
Non-Primitive Data Types
├── Built-in Classes
│   ├── String (text data)
│   ├── Wrapper Classes (Byte, Short, Integer, Long, Float, Double, Character, Boolean)
│   └── Object (parent of all classes)
├── User-defined Classes
│   ├── Classes
│   ├── Interfaces
│   └── Abstract Classes
├── Arrays
│   ├── Single Dimensional
│   └── Multi Dimensional
└── Collections
    ├── List (ArrayList, LinkedList)
    ├── Set (HashSet, TreeSet)
    └── Map (HashMap, TreeMap)
```

## Key Differences: Primitive vs Non-Primitive

| Feature | Primitive | Non-Primitive |
|---------|-----------|---------------|
| **Storage** | Stack memory | Heap memory (reference in stack) |
| **Default Value** | 0, false, '\u0000' | null |
| **Size** | Fixed (predefined) | Variable (depends on data) |
| **Speed** | Faster | Slower (due to reference) |
| **Methods** | No methods | Has methods |
| **Examples** | int, char, boolean | String, Integer, Arrays |

## Main Categories

### 1. String (Most Important)
```java
// Immutable text data
String name = "Java";
String message = "Hello World";
String empty = ""; // Empty string
```

### 2. Wrapper Classes
```java
// Object versions of primitives
Integer num = 100;        // int wrapper
Double price = 99.99;     // double wrapper
Boolean flag = true;      // boolean wrapper
Character ch = 'A';       // char wrapper
```

### 3. Arrays
```java
// Collection of same type elements
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Ram", "Shyam", "Gita"};
```

### 4. User-defined Classes
```java
// Custom classes you create
class Student { }
class Car { }
class Bank { }
```

### 5. Collections
```java
// Dynamic data structures
List<String> list = new ArrayList<>();
Set<Integer> set = new HashSet<>();
Map<String, Integer> map = new HashMap<>();
```

## Memory Management

### Stack vs Heap
```java
// Stack memory
int primitive = 10;           // Stored in stack

// Heap memory  
String reference = "Hello";   // "Hello" in heap, reference in stack
Student student = new Student(); // Object in heap, reference in stack
```

## Common Operations

### String Operations
```java
String str = "Hello";
int length = str.length();        // Get length
char ch = str.charAt(0);          // Get character
String upper = str.toUpperCase(); // Convert to uppercase
boolean contains = str.contains("He"); // Check substring
```

### Array Operations
```java
int[] arr = {1, 2, 3};
int length = arr.length;          // Get length
int first = arr[0];               // Access element
arr[1] = 5;                       // Modify element
```

### Wrapper Class Operations
```java
Integer num = 100;
int primitive = num.intValue();   // Convert to primitive
String str = num.toString();      // Convert to string
```