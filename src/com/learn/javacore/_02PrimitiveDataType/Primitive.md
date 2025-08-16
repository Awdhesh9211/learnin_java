# Java Primitive Data Types - Quick Reference Guide

## 8 Primitive Data Types

Java mein **8 primitive data types** hain jo directly memory mein values store karte hain:

```
Primitive Data Types
├── Integer Types (Whole Numbers)
│   ├── byte    (-128 to 127)
│   ├── short   (-32,768 to 32,767)  
│   ├── int     (-2.1B to 2.1B)
│   └── long    (-9.2E18 to 9.2E18)
├── Decimal Types
│   ├── float   (±3.4E38, ~7 digits)
│   └── double  (±1.8E308, ~15 digits)
├── Character Type
│   └── char    (0 to 65,535, Unicode)
└── Boolean Type
    └── boolean (true/false)
```

## Quick Reference

### Integer Types
```java
// byte: 1 byte, -128 to 127
byte b = 127;

// short: 2 bytes, -32,768 to 32,767  
short s = 32767;

// int: 4 bytes, most common integer type
int i = 2147483647;

// long: 8 bytes, L suffix required for large numbers
long l = 9223372036854775807L;
```

### Decimal Types
```java
// float: 4 bytes, f suffix required
float fl = 3.14159f;

// double: 8 bytes, default for decimals
double db = 3.141592653589793;
```

### Character Type
```java
// char: 2 bytes, Unicode characters
char ch = 'A';
char heart = 10084;      // ❤
char arrow = '\u27A4';   // ➤
```

### Boolean Type
```java
// boolean: true or false only
boolean yes = true;
boolean result = (5 > 3);  // true
```

## Memory Usage Comparison

| Type | Size | Range | Use Case |
|------|------|-------|----------|
| `byte` | 1 byte | -128 to 127 | Small integers, byte arrays |
| `short` | 2 bytes | -32,768 to 32,767 | Memory-efficient integers |
| `int` | 4 bytes | -2.1B to 2.1B | General purpose integers |
| `long` | 8 bytes | -9.2E18 to 9.2E18 | Large integers, timestamps |
| `float` | 4 bytes | ±3.4E38 | Memory-efficient decimals |
| `double` | 8 bytes | ±1.8E308 | High precision decimals |
| `char` | 2 bytes | 0 to 65,535 | Single characters, Unicode |
| `boolean` | ~1 byte | true/false | Logical values |

## Type Conversion (Casting)

### Implicit Conversion (Widening)
```java
// Automatic conversion (no data loss)
byte b = 10;
short s = b;        // byte → short
int i = s;          // short → int
long l = i;         // int → long
float f = l;        // long → float
double d = f;       // float → double

// Chain conversion
byte → short → int → long → float → double
char → int → long → float → double
```

### Explicit Conversion (Narrowing)
```java
// Manual conversion (potential data loss)
double d = 123.456;
float f = (float) d;        // double → float
long l = (long) f;          // float → long (123)
int i = (int) l;            // long → int
short s = (short) i;        // int → short
byte b = (byte) s;          // short → byte

// Potential data loss example
int bigInt = 300;
byte smallByte = (byte) bigInt;  // Result: 44 (overflow)
```

## Wrapper Classes

Each primitive has a corresponding wrapper class:

```java
// Primitive → Wrapper Class
byte     → Byte
short    → Short
int      → Integer
long     → Long
float    → Float
double   → Double
char     → Character
boolean  → Boolean

// Autoboxing (primitive → wrapper)
Integer wrappedInt = 42;        // int → Integer
Double wrappedDouble = 3.14;    // double → Double

// Unboxing (wrapper → primitive)
int primitiveInt = wrappedInt;           // Integer → int
double primitiveDouble = wrappedDouble;  // Double → double
```

## Constants and Utility Methods

### Integer Constants
```java
// Byte
Byte.MIN_VALUE      // -128
Byte.MAX_VALUE      // 127
Byte.SIZE           // 8 (bits)

// Integer
Integer.MIN_VALUE   // -2,147,483,648
Integer.MAX_VALUE   // 2,147,483,647
Integer.SIZE        // 32 (bits)

// Long
Long.MIN_VALUE      // -9,223,372,036,854,775,808
Long.MAX_VALUE      // 9,223,372,036,854,775,807
```

### Character Utilities
```java
Character.MIN_VALUE             // '\u0000' (0)
Character.MAX_VALUE             // '\uffff' (65535)
Character.isDigit('5')          // true
Character.isLetter('A')         // true
Character.isUpperCase('A')      // true
Character.toLowerCase('A')      // 'a'
Character.toUpperCase('a')      // 'A'
Character.getNumericValue('5')  // 5
```

### Boolean Operations
```java
Boolean.TRUE                    // Boolean wrapper for true
Boolean.FALSE                   // Boolean wrapper for false
Boolean.parseBoolean("true")    // true
Boolean.toString(true)          // "true"
```

## Best Practices

### 1. Choose Appropriate Type
```java
// Good: Use int for general integers
int count = 100;

// Good: Use long for large numbers
long fileSize = System.currentTimeMillis();

// Good: Use double for precise calculations
double price = 19.99;

// Memory conscious: Use smaller types for large arrays
byte[] imageData = new byte[1000000];  // Instead of int[]
```

### 2. Avoid Floating Point Comparison
```java
// Bad: Direct comparison
double a = 0.1 + 0.2;
if (a == 0.3) {  // May be false due to precision
        System.out.println("Equal");
}

// Good: Use epsilon comparison
double epsilon = 1e-10;
if (Math.abs(a - 0.3) < epsilon) {
        System.out.println("Equal");
}
```

### 3. Use Appropriate Literals
```java
// Good: Use appropriate suffixes
long bigNumber = 1234567890L;  // L suffix
float precision = 3.14f;       // f suffix

// Good: Use underscores for readability
int million = 1_000_000;
long creditCard = 1234_5678_9012_3456L;
```

### 4. Handle Overflow
```java
// Check for overflow
int a = Integer.MAX_VALUE;
try {
int result = Math.addExact(a, 1);  // Throws ArithmeticException
} catch (ArithmeticException e) {
        System.out.println("Overflow detected!");
}
```

## Common Pitfalls

### 1. Integer Overflow
```java
int max = Integer.MAX_VALUE;    // 2147483647
int overflow = max + 1;         // -2147483648 (wraps around)
```

### 2. Floating Point Precision
```java
float f1 = 0.1f;
float f2 = 0.2f;
float result = f1 + f2;         // 0.30000001 (not exactly 0.3)
```

### 3. Character vs Integer
```java
char digit = '5';
int value1 = digit;             // 53 (ASCII value)
int value2 = digit - '0';       // 5 (actual numeric value)
```

### 4. Boolean vs Integer
```java
// Java doesn't allow this (unlike C/C++)
// boolean flag = 1;            // Compilation error
boolean flag = true;            // Correct way
```

## Performance Considerations

1. **int** is usually fastest for calculations
2. **byte/short** use same memory as int for local variables
3. **float** vs **double**: modern CPUs handle double as efficiently
4. **Array storage**: smaller types save memory in arrays
5. **Autoboxing**: has performance overhead

## Unicode and Character Encoding

```java
// Unicode examples
char chinese = '\u4E2D';        // 中
char emoji = '\uD83D';          // High surrogate for emoji
char arabic = '\u0627';         // ا

// Convert between char and int
char c = 'A';
int ascii = (int) c;            // 65
char fromInt = (char) 65;       // 'A'

// Check character properties
Character.isDigit('5');         // true
Character.isLetter('A');        // true
Character.isWhitespace(' ');    // true
```