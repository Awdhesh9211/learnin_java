# Java Inheritance - Quick Reference with Explanations

## What is Inheritance?
Inheritance allows a class (child) to inherit properties and methods from another class (parent). It's like a child inheriting traits from parents - the child gets everything the parent has, plus can add its own unique features.

**Benefits:** Code reusability, hierarchical relationships, polymorphism support

## Basic Syntax
```java
class Parent {
    // parent members
}

class Child extends Parent {
    // inherits parent members + own members
}
```

**Explanation:** The `extends` keyword creates an "is-a" relationship. Child IS-A Parent.

## Inheritance Types

### 1. Single Inheritance
```java
class Animal { }
class Dog extends Animal { } // Dog IS-A Animal
```
**Explanation:** One class inherits from exactly one parent class.

### 2. Multilevel Inheritance
```java
class Animal { }
class Mammal extends Animal { }
class Dog extends Mammal { } // Dog inherits from both Animal and Mammal
```
**Explanation:** A chain of inheritance - grandparent → parent → child.

### 3. Hierarchical Inheritance
```java
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { } // Both Dog and Cat inherit from Animal
```
**Explanation:** Multiple classes inherit from the same parent class.

## Access Modifiers in Inheritance

| Modifier | Child Class Access | Explanation |
|----------|-------------------|-------------|
| `public` | ✓ Inherited | Accessible everywhere |
| `protected` | ✓ Inherited | Accessible in same package + subclasses |
| `default` | ✓ If same package | Package-level access only |
| `private` | ✗ Not inherited | Only accessible within same class |

```java
class Parent {
    public int publicVar = 1;        // Child can access
    protected int protectedVar = 2;  // Child can access
    int defaultVar = 3;              // Child can access (if same package)
    private int privateVar = 4;      // Child CANNOT access
}
```

## The `super` Keyword

`super` refers to the immediate parent class object.

### 1. Constructor Chaining
```java
class Animal {
    String name;
    Animal(String name) { this.name = name; }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, String breed) {
        super(name); // MUST be first line - calls parent constructor
        this.breed = breed;
    }
}
```
**Explanation:** `super()` calls parent constructor. If you don't write it, Java automatically adds `super()` (no-argument version).

### 2. Accessing Parent Methods
```java
class Parent {
    void display() { System.out.println("Parent display"); }
}

class Child extends Parent {
    void display() { System.out.println("Child display"); }
    
    void callBoth() {
        super.display(); // Calls parent version
        this.display();  // Calls child version (or just display())
    }
}
```

## Method Overriding

**Definition:** Child class provides specific implementation of a method already defined in parent class.

```java
class Animal {
    void makeSound() { System.out.println("Some generic animal sound"); }
}

class Dog extends Animal {
    @Override // Optional but recommended annotation
    void makeSound() { System.out.println("Woof!"); }
}
```

### Overriding Rules:
1. **Same signature** (method name, parameters, return type)
2. **Access modifier** can be same or broader (private → protected → public)
3. **Cannot override** `static`, `final`, or `private` methods
4. **Cannot reduce visibility** (public → protected is not allowed)

```java
// Valid overriding examples
class Parent {
    protected void method1() { }     // protected in parent
    void method2() { }               // default in parent
}

class Child extends Parent {
    public void method1() { }        // ✓ Broader access (protected → public)
    protected void method2() { }     // ✓ Broader access (default → protected)
    // private void method1() { }    // ✗ Would cause compilation error
}
```

## Constructor Inheritance

**Important:** Constructors are NOT inherited, but child constructors can call parent constructors.

```java
class Vehicle {
    String brand;
    
    Vehicle() { 
        System.out.println("Vehicle default constructor"); 
    }
    
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle parameterized constructor");
    }
}

class Car extends Vehicle {
    int doors;
    
    Car() {
        super(); // Calls Vehicle() - can be omitted as it's automatic
        System.out.println("Car default constructor");
    }
    
    Car(String brand, int doors) {
        super(brand); // Calls Vehicle(String brand) - MUST be explicit
        this.doors = doors;
        System.out.println("Car parameterized constructor");
    }
}
```

## `final` Keyword

### Final Classes
```java
final class FinalClass {
    // This class cannot be extended
}

// class Child extends FinalClass { } // ✗ Compilation error
```
**Examples:** `String`, `Integer`, `Double` are final classes.

### Final Methods
```java
class Parent {
    final void finalMethod() {
        System.out.println("Cannot be overridden");
    }
    
    void normalMethod() {
        System.out.println("Can be overridden");
    }
}

class Child extends Parent {
    // void finalMethod() { } // ✗ Compilation error
    
    @Override
    void normalMethod() { 
        System.out.println("Overridden successfully"); 
    }
}
```

## Abstract Classes
When you want to provide a template but force child classes to implement certain methods:

```java
abstract class Shape {
    String color;
    
    // Concrete method
    void setColor(String color) {
        this.color = color;
    }
    
    // Abstract method - must be implemented by child classes
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) { this.radius = radius; }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

## Complete Example

```java
// Parent class
class Animal {
    protected String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void makeSound() {
        System.out.println("Some generic sound");
    }
    
    // Getter for private field
    public int getAge() { return age; }
}

// Child class
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Call parent constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
    
    // Dog-specific method
    public void wagTail() {
        System.out.println(name + " is wagging tail");
    }
    
    public void callParentMethod() {
        super.makeSound(); // Calls Animal's makeSound()
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Inherited methods
        myDog.eat();           // From Animal class
        
        // Overridden method
        myDog.makeSound();     // Dog's version
        
        // Dog-specific method
        myDog.wagTail();       // Only available in Dog
        
        // Access inherited protected field
        System.out.println("Dog's name: " + myDog.name);
        
        // Access private field through getter
        System.out.println("Dog's age: " + myDog.getAge());
    }
}
```

## Key Points to Remember

1. **Child inherits everything except constructors and private members**
2. **Use `super()` in constructors and `super.method()` for parent methods**
3. **Method overriding requires same signature**
4. **Access modifiers can only be broadened, not narrowed**
5. **`final` classes/methods cannot be extended/overridden**
6. **Java supports single inheritance of classes, multiple inheritance through interfaces**
7. **Every class implicitly extends `Object` class**