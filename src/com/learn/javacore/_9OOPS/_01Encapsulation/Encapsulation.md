# Encapsulation in Java

Encapsulation is one of the **four core OOP (Object-Oriented Programming) principles**.  
It is the process of **wrapping data (variables) and methods (functions) into a single unit (class)** and restricting direct access to some components of an object.

---

## 🚀 Key Points of Encapsulation
1. **Data Hiding**
    - Instance variables (fields) are declared as **private**.
    - This prevents direct modification of data from outside the class.

2. **Controlled Access**
    - We provide **public getter and setter methods** to access and update private variables.
    - This ensures **validation and control** over data.

3. **Security & Maintainability**
    - Data is safe from unauthorized access.
    - Any internal change in a class does not affect other classes.

---

## ✅ Syntax Example

```java
// Example of Encapsulation
package com.learn.javacore._08Encapsulation;

class Student {
    // Private data members - Data Hiding
    private String name;
    private int age;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age' with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values through setter
        s.setName("Awdhesh");
        s.setAge(22);

        // Getting values through getter
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
