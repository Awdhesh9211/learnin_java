package com.learn.javacore._04Operator;

/**
 * Complete demonstration of all Java operators
 * @author Java Developer
 */
public class OperatorExample {

    public static void main(String[] args) {
        System.out.println("=== JAVA OPERATORS COMPLETE DEMONSTRATION ===\n");

        // 1. ARITHMETIC OPERATORS
        System.out.println("1. ARITHMETIC OPERATORS");
        System.out.println("------------------------");

        int a = 10, b = 3;
        System.out.println("Assignment     =>    a = " + a + ", b = " + b);
        System.out.println("Addition       =>    a + b = " + (a + b));    // Addition: 13
        System.out.println("Subtraction    =>    a - b = " + (a - b));    // Subtraction: 7
        System.out.println("Multiplication =>    a * b = " + (a * b));    // Multiplication: 30
        System.out.println("Division       =>    a / b = " + (a / b));    // Division: 3 (integer division)
        System.out.println("Modulus        =>    a % b = " + (a % b));    // Modulus: 1 (remainder)

        // Floating point division
        System.out.println("a / (double)b = " + (a / (double)b)); // 3.333...

        // Increment and Decrement
        int x = 5;
        System.out.println("Original x = " + x);
        System.out.println("++x (pre-increment) = " + (++x) + ", x is now " + x);
        x = 5; // Reset
        System.out.println("x++ (post-increment) = " + (x++) + ", x is now " + x);
        System.out.println("--x (pre-decrement) = " + (--x) + ", x is now " + x);
        x = 5; // Reset
        System.out.println("x-- (post-decrement) = " + (x--) + ", x is now " + x);

        // 2. ASSIGNMENT OPERATORS
        System.out.println("\n2. ASSIGNMENT OPERATORS");
        System.out.println("------------------------");

        int num = 10;
        System.out.println("Initial num = " + num);

        num += 5;  // num = num + 5
        System.out.println("num += 5  → num = " + num);

        num -= 3;  // num = num - 3
        System.out.println("num -= 3  → num = " + num);

        num *= 2;  // num = num * 2
        System.out.println("num *= 2  → num = " + num);

        num /= 4;  // num = num / 4
        System.out.println("num /= 4  → num = " + num);

        num %= 3;  // num = num % 3
        System.out.println("num %= 3  → num = " + num);

        // 3. RELATIONAL OPERATORS
        System.out.println("\n3. RELATIONAL OPERATORS");
        System.out.println("------------------------");

        int p = 1, q = 2;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q : " + (p == q));  // Equal to: false
        System.out.println("p != q : " + (p != q));  // Not equal: true
        System.out.println("p > q  : " + (p > q));   // Greater than: false
        System.out.println("p >= q : " + (p >= q));  // Greater or equal: false
        System.out.println("p < q  : " + (p < q));   // Less than: true
        System.out.println("p <= q : " + (p <= q));  // Less or equal: true

        // String comparison (be careful!)
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println("str1 == str2 : " + (str1 == str2));        // true (same reference)
        System.out.println("str1 == str3 : " + (str1 == str3));        // false (different reference)
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true (same content)

        // 4. LOGICAL OPERATORS
        System.out.println("\n4. LOGICAL OPERATORS");
        System.out.println("--------------------");

        boolean expr1 = true;
        boolean expr2 = false;
        System.out.println("expr1 = " + expr1 + ", expr2 = " + expr2);
        System.out.println("expr1 && expr2 : " + (expr1 && expr2)); // AND: false (both must be true)
        System.out.println("expr1 || expr2 : " + (expr1 || expr2)); // OR: true (at least one true)
        System.out.println("!expr1         : " + (!expr1));         // NOT: false (inverts value)
        System.out.println("!expr2         : " + (!expr2));         // NOT: true

        // Complex expressions
        boolean result1 = (5 > 3) && (10 < 20);  // true && true = true
        boolean result2 = (5 < 3) || (10 > 5);   // false || true = true
        System.out.println("(5 > 3) && (10 < 20) : " + result1);
        System.out.println("(5 < 3) || (10 > 5)  : " + result2);

        // Short-circuit evaluation demonstration
        System.out.println("Short-circuit evaluation:");
        System.out.print("false && expensiveFunction() : ");
        boolean shortCircuit1 = false && expensiveFunction(); // expensiveFunction() NOT called
        System.out.println(shortCircuit1);

        System.out.print("true || expensiveFunction() : ");
        boolean shortCircuit2 = true || expensiveFunction(); // expensiveFunction() NOT called
        System.out.println(shortCircuit2);

        // 5. BITWISE OPERATORS
        System.out.println("\n5. BITWISE OPERATORS");
        System.out.println("--------------------");

        int m = 5, n = 3;  // m = 101 (binary), n = 011 (binary)
        System.out.println("m = " + m + " (binary: " + Integer.toBinaryString(m) + ")");
        System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");

        System.out.println("m & n  = " + (m & n) + " (AND - binary: " + Integer.toBinaryString(m & n) + ")");
        System.out.println("m | n  = " + (m | n) + " (OR - binary: " + Integer.toBinaryString(m | n) + ")");
        System.out.println("m ^ n  = " + (m ^ n) + " (XOR - binary: " + Integer.toBinaryString(m ^ n) + ")");
        System.out.println("~m     = " + (~m) + " (NOT)");
        System.out.println("m << 1 = " + (m << 1) + " (Left shift - binary: " + Integer.toBinaryString(m << 1) + ")");
        System.out.println("m >> 1 = " + (m >> 1) + " (Right shift - binary: " + Integer.toBinaryString(m >> 1) + ")");

        // 6. UNARY OPERATORS
        System.out.println("\n6. UNARY OPERATORS");
        System.out.println("------------------");

        int unary = 10;
        System.out.println("Original value: " + unary);
        System.out.println("+unary = " + (+unary));  // Unary plus
        System.out.println("-unary = " + (-unary));  // Unary minus

        boolean flag = true;
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag));    // Logical NOT

        // 7. TERNARY OPERATOR (Conditional)
        System.out.println("\n7. TERNARY OPERATOR");
        System.out.println("-------------------");

        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Age: " + age + " → " + eligibility);

        int num1 = 15, num2 = 25;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        // Nested ternary (not recommended for readability)
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";
        System.out.println("Score: " + score + " → Grade: " + grade);

        // 8. instanceof OPERATOR
        System.out.println("\n8. instanceof OPERATOR");
        System.out.println("----------------------");

        String text = "Hello World";
        Integer number = 42;
        Object obj = "I'm a String object";

        System.out.println("text instanceof String: " + (text instanceof String));
        System.out.println("number instanceof Integer: " + (number instanceof Integer));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));

        // null instanceof always returns false
        String nullString = null;
        System.out.println("null instanceof String: " + (nullString instanceof String));

        // 9. OPERATOR PRECEDENCE DEMONSTRATION
        System.out.println("\n9. OPERATOR PRECEDENCE");
        System.out.println("----------------------");

        int result = 2 + 3 * 4;  // Multiplication first, then addition
        System.out.println("2 + 3 * 4 = " + result + " (not 20, because * has higher precedence)");

        int result3 = (2 + 3) * 4;  // Parentheses override precedence
        System.out.println("(2 + 3) * 4 = " + result3);

        boolean complex = 5 > 3 && 10 < 20 || 1 > 2;  // AND has higher precedence than OR
        System.out.println("5 > 3 && 10 < 20 || 1 > 2 = " + complex);

        // 10. PRACTICAL EXAMPLES
        System.out.println("\n10. PRACTICAL EXAMPLES");
        System.out.println("----------------------");

        // Even/Odd check
        int checkNumber = 17;
        String evenOdd = (checkNumber % 2 == 0) ? "Even" : "Odd";
        System.out.println(checkNumber + " is " + evenOdd);

        // Leap year check (simplified)
        int year = 2024;
        boolean isLeap = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        System.out.println(year + " is " + (isLeap ? "a leap year" : "not a leap year"));

        // Grade calculation
        int marks = 87;
        char gradeChar;
        if (marks >= 90) gradeChar = 'A';
        else if (marks >= 80) gradeChar = 'B';
        else if (marks >= 70) gradeChar = 'C';
        else if (marks >= 60) gradeChar = 'D';
        else gradeChar = 'F';
        System.out.println("Marks: " + marks + " → Grade: " + gradeChar);

        // Absolute value without Math.abs()
        int negativeNum = -15;
        int absolute = (negativeNum < 0) ? -negativeNum : negativeNum;
        System.out.println("Absolute value of " + negativeNum + " is " + absolute);

        // Swapping without temporary variable (using XOR)
        int swap1 = 10, swap2 = 20;
        System.out.println("Before swap: swap1=" + swap1 + ", swap2=" + swap2);
        swap1 = swap1 ^ swap2;
        swap2 = swap1 ^ swap2;
        swap1 = swap1 ^ swap2;
        System.out.println("After swap: swap1=" + swap1 + ", swap2=" + swap2);
    }

    /**
     * Helper method to demonstrate short-circuit evaluation
     */
    private static boolean expensiveFunction() {
        System.out.print("expensiveFunction() called! ");
        return true;
    }
}

/*
 * Key Points about Java Operators:
 *
 * 1. Arithmetic: +, -, *, /, %, ++, --
 * 2. Assignment: =, +=, -=, *=, /=, %=
 * 3. Relational: ==, !=, >, <, >=, <=
 * 4. Logical: &&, ||, ! (with short-circuit evaluation)
 * 5. Bitwise: &, |, ^, ~, <<, >>, >>>
 * 6. Unary: +, -, ++, --, !
 * 7. Ternary: condition ? true_value : false_value
 * 8. instanceof: object instanceof Class
 *
 * Remember:
 * - Use parentheses to clarify precedence
 * - Be careful with == vs .equals() for objects
 * - Logical operators have short-circuit evaluation
 * - Integer division truncates decimal part
 * - Pre/post increment behave differently
 *
 * Compile: javac OperatorExample.java
 * Run: java OperatorExample
 */