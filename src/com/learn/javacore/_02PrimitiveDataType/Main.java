package com.learn.javacore._02PrimitiveDataType;

/**
 * Simple demonstration of all Java primitive data types
 * @author Java Developer
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== JAVA PRIMITIVE DATA TYPES ===\n");

        // 1. INTEGER TYPES (Whole Numbers)

        // byte: 8-bit signed (-128 to 127)
        byte b = 127;
        System.out.println("byte: " + b + " (Range: -128 to 127)");

        // short: 16-bit signed (-32,768 to 32,767)
        short s = 32767;
        System.out.println("short: " + s + " (Range: -32,768 to 32,767)");

        // int: 32-bit signed (most common)
        int i = 2147483647;
        System.out.println("int: " + i + " (Range: -2.1B to 2.1B)");

        // long: 64-bit signed (L suffix for large numbers)
        long l = 9223372036854775807L;
        System.out.println("long: " + l + " (Range: -9.2E18 to 9.2E18)");

        // 2. FLOATING POINT TYPES (Decimal Numbers)

        // float: 32-bit IEEE 754 (f suffix required)
        float fl = 3.4577f;
        System.out.println("float: " + fl + " (Range: ±3.4E38, ~7 digits precision)");

        // double: 64-bit IEEE 754 (default for decimals)
        double db = 5.765454d;
        System.out.println("double: " + db + " (Range: ±1.8E308, ~15 digits precision)");

        // 3. CHARACTER TYPE (Single character/Unicode)

        // char: 16-bit Unicode (0 to 65,535)
        char ch = 'w';
        char heart = 10084;        // Unicode code point
        char arrow = '\u27A4';     // Unicode escape sequence

        System.out.println("char letter: " + ch);
        System.out.println("char heart: " + heart + " (Unicode: " + (int)heart + ")");
        System.out.println("char arrow: " + arrow + " (Unicode: \\u27A4)");
        System.out.println("char range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);

        // 4. BOOLEAN TYPE (True/False)

        // boolean: logical values only
        boolean yes = true;
        boolean no = false;
        boolean result = (5 > 3);

        System.out.println("boolean yes: " + yes);
        System.out.println("boolean no: " + no);
        System.out.println("boolean result (5 > 3): " + result);

        // 5. TYPE CONVERSIONS
        System.out.println("\n=== TYPE CONVERSIONS ===");

        // Implicit conversion (widening)
        byte byteVal = 100;
        int intVal = byteVal;      // byte → int (automatic)
        double doubleVal = intVal; // int → double (automatic)
        System.out.println("byte " + byteVal + " → int " + intVal + " → double " + doubleVal);

        // Explicit conversion (narrowing)
        double d = 123.456;
        int converted = (int) d;   // double → int (cast required, loses decimal)
        System.out.println("double " + d + " → int " + converted + " (decimal lost)");

        // 6. COMMON OPERATIONS
        System.out.println("\n=== COMMON OPERATIONS ===");

        // Arithmetic operations
        int a = 10, b2 = 3;
        System.out.println("Arithmetic: " + a + " + " + b2 + " = " + (a + b2));
        System.out.println("Division: " + a + " / " + b2 + " = " + (a / b2) + " (integer division)");
        System.out.println("Division: " + a + " / " + b2 + ".0 = " + (a / (double)b2) + " (decimal division)");

        // Logical operations
        boolean x = true, y = false;
        System.out.println("Logical AND: " + x + " && " + y + " = " + (x && y));
        System.out.println("Logical OR: " + x + " || " + y + " = " + (x || y));

        // Character operations
        char c1 = 'A';
        System.out.println("Character 'A' code: " + (int)c1);
        System.out.println("Character from code 66: " + (char)66);

        // 7. COMMON PITFALLS
        System.out.println("\n=== COMMON PITFALLS ===");

        // Integer overflow
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int: " + maxInt);
        System.out.println("Max int + 1: " + (maxInt + 1) + " (overflow!)");

        // Floating point precision
        double precision = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + precision + " (not exactly 0.3)");

        // Character vs numeric
        char digit = '5';
        System.out.println("char '5' as int: " + (int)digit + " (ASCII value)");
        System.out.println("char '5' as digit: " + (digit - '0') + " (actual digit value)");
    }
}