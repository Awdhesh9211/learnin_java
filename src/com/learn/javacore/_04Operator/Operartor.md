# Java Operators - Complete Reference Guide

## Overview

Java mein **operators** special symbols hain jo variables aur values par operations perform karte hain. Java mein different types ke operators hain.

```
Java Operators
├── Arithmetic Operators (+, -, *, /, %, ++, --)
├── Assignment Operators (=, +=, -=, *=, /=, %=)
├── Relational Operators (==, !=, >, <, >=, <=)
├── Logical Operators (&&, ||, !)
├── Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
├── Unary Operators (+, -, ++, --, !)
├── Ternary Operator (condition ? true : false)
└── instanceof Operator (object instanceof Class)
```

## Operator Categories

### 1. Arithmetic Operators
```java
// Basic arithmetic operations
int a = 10, b = 3;

+ (Addition)        : a + b = 13
- (Subtraction)     : a - b = 7
* (Multiplication)  : a * b = 30
/ (Division)        : a / b = 3 (integer division)
% (Modulus)         : a % b = 1 (remainder)

// Increment/Decrement
++ (Increment)      : a++ or ++a
-- (Decrement)      : a-- or --a
```

### 2. Assignment Operators
```java
// Basic assignment
= (Assign)          : a = 10

// Compound assignment
+= (Add and assign) : a += 5  → a = a + 5
-= (Sub and assign) : a -= 3  → a = a - 3
*= (Mul and assign) : a *= 2  → a = a * 2
/= (Div and assign) : a /= 4  → a = a / 4
%= (Mod and assign) : a %= 3  → a = a % 3
```

### 3. Relational Operators
```java
// Comparison operations (return boolean)
int x = 5, y = 10;

== (Equal to)           : x == y → false
!= (Not equal to)       : x != y → true
>  (Greater than)       : x > y  → false
<  (Less than)          : x < y  → true
>= (Greater or equal)   : x >= y → false
<= (Less or equal)      : x <= y → true
```

### 4. Logical Operators
```java
// Boolean operations
boolean p = true, q = false;

&& (Logical AND)    : p && q → false (both must be true)
|| (Logical OR)     : p || q → true  (at least one true)
!  (Logical NOT)    : !p     → false (inverts value)

// Short-circuit evaluation
&& - Second operand not evaluated if first is false
|| - Second operand not evaluated if first is true
```

### 5. Bitwise Operators
```java
// Bit-level operations
int a = 5, b = 3;  // a=101, b=011 in binary

& (Bitwise AND)     : a & b = 1   (001)
| (Bitwise OR)      : a | b = 7   (111)
^ (Bitwise XOR)     : a ^ b = 6   (110)
~ (Bitwise NOT)     : ~a = -6     (inverts all bits)
<< (Left Shift)     : a << 1 = 10 (shift bits left)
>> (Right Shift)    : a >> 1 = 2  (shift bits right)
>>> (Unsigned Right): a >>> 1 = 2 (shift with zero fill)
```

### 6. Unary Operators
```java
// Single operand operations
int x = 10;

+ (Unary Plus)      : +x → 10
- (Unary Minus)     : -x → -10
++ (Pre/Post Inc)   : ++x (pre), x++ (post)
-- (Pre/Post Dec)   : --x (pre), x-- (post)
! (Logical NOT)     : !true → false
```

### 7. Ternary Operator
```java
// Conditional operator (shorthand for if-else)
condition ? value_if_true : value_if_false

int max = (a > b) ? a : b;  // Returns larger value
String result = (score >= 60) ? "Pass" : "Fail";
```

### 8. instanceof Operator
```java
// Type checking
object instanceof ClassName

String str = "Hello";
boolean isString = str instanceof String;  // true
```

## Operator Precedence (High to Low)

| Priority | Operators | Description |
|----------|-----------|-------------|
| 1 | `()`, `[]`, `.` | Parentheses, Array access, Member access |
| 2 | `++`, `--`, `!`, `~`, `+`, `-` | Unary operators |
| 3 | `*`, `/`, `%` | Multiplicative |
| 4 | `+`, `-` | Additive |
| 5 | `<<`, `>>`, `>>>` | Shift operators |
| 6 | `<`, `<=`, `>`, `>=`, `instanceof` | Relational |
| 7 | `==`, `!=` | Equality |
| 8 | `&` | Bitwise AND |
| 9 | `^` | Bitwise XOR |
| 10 | `\|` | Bitwise OR |
| 11 | `&&` | Logical AND |
| 12 | `\|\|` | Logical OR |
| 13 | `?:` | Ternary conditional |
| 14 | `=`, `+=`, `-=`, etc. | Assignment |

## Special Cases

### Pre vs Post Increment
```java
int x = 5;
int y = ++x;  // Pre-increment: x becomes 6, then y = 6
int z = x++;  // Post-increment: z = 6, then x becomes 7
```

### Short-circuit Evaluation
```java
boolean result = false && someExpensiveFunction();
// someExpensiveFunction() is NOT called because first operand is false

boolean result2 = true || someExpensiveFunction();  
// someExpensiveFunction() is NOT called because first operand is true
```

### Integer Division vs Floating Point
```java
int a = 7, b = 2;
int result1 = a / b;      // 3 (integer division)
double result2 = a / 2.0; // 3.5 (floating point division)
```