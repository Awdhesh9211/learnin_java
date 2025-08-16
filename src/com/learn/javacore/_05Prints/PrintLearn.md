# Java Print Methods - Complete Guide

## Overview
Java provides three main methods for outputting text to the console, each serving different purposes and offering varying levels of control over formatting.

## 1. System.out.println()

**Purpose**: Prints text and automatically adds a new line at the end.

**Syntax**: `System.out.println(value)`

**Key Features**:
- Automatically appends `\n` (newline) after printing
- Can print any data type (String, int, double, boolean, char, Object)
- Most commonly used for simple output

**Examples**:
```java
System.out.println("Hello World");  // Prints: Hello World\n
System.out.println(42);             // Prints: 42\n
System.out.println(true);           // Prints: true\n
```

## 2. System.out.print()

**Purpose**: Prints text without adding a new line at the end.

**Syntax**: `System.out.print(value)`

**Key Features**:
- No automatic newline - output continues on the same line
- Useful for building output on a single line
- Often used in loops or when you want precise control over line breaks

**Examples**:
```java
System.out.print("Hello ");
System.out.print("World");
// Output: Hello World (on same line)
```

## 3. System.out.printf()

**Purpose**: Formatted printing with placeholders and precise control over output format.

**Syntax**: `System.out.printf(format_string, arguments...)`

**Key Features**:
- Uses format specifiers (placeholders) like `%s`, `%d`, `%f`
- Allows precise control over formatting, alignment, and precision
- Similar to C's `printf()` function
- No automatic newline (use `%n` for platform-independent newline)

### Common Format Specifiers

| Specifier | Purpose | Example |
|-----------|---------|---------|
| `%s` | String | `printf("Name: %s", "John")` |
| `%d` | Integer | `printf("Age: %d", 25)` |
| `%f` | Float/Double | `printf("Price: %f", 19.99)` |
| `%.2f` | Float with 2 decimal places | `printf("Price: %.2f", 19.99)` |
| `%e` | Scientific notation | `printf("Number: %e", 123456.0)` |
| `%x` | Hexadecimal | `printf("Hex: %x", 255)` |
| `%o` | Octal | `printf("Octal: %o", 64)` |
| `%c` | Character | `printf("Grade: %c", 'A')` |
| `%b` | Boolean | `printf("Valid: %b", true)` |
| `%n` | Platform-independent newline | `printf("Line 1%nLine 2")` |

### Width and Alignment

```java
// Right-aligned in 10 character width
System.out.printf("%10s", "Java");     // "      Java"

// Left-aligned in 10 character width
System.out.printf("%-10s", "Java");    // "Java      "

// Zero-padded numbers
System.out.printf("%05d", 42);         // "00042"
```

## When to Use Each Method

### Use `println()` when:
- You want simple output with automatic line breaks
- Debugging or logging simple values
- Each piece of information should be on a separate line

### Use `print()` when:
- Building output on the same line
- Creating progress indicators or loading animations
- You want full control over when line breaks occur

### Use `printf()` when:
- You need formatted output (tables, reports, etc.)
- Working with numbers that need specific decimal places
- Creating aligned columns or structured output
- Interpolating multiple variables into a string

## Best Practices

1. **For Simple Output**: Use `println()` for straightforward text output
2. **For Formatted Output**: Use `printf()` when you need precise formatting
3. **Use `%n` instead of `\n`**: In `printf()`, use `%n` for newlines (platform-independent)
4. **Type Safety**: Match format specifiers with argument types to avoid runtime errors
5. **Performance**: `printf()` is slightly slower due to parsing format strings

## Common Mistakes to Avoid

1. **Mismatched format specifiers and arguments**:
   ```java
   // Wrong: %d expects integer, but string provided
   System.out.printf("Number: %d", "hello");
   ```

2. **Forgetting newlines in printf**:
   ```java
   // This won't add a newline automatically
   System.out.printf("Hello World");
   // Better:
   System.out.printf("Hello World%n");
   ```

3. **Using platform-specific newlines**:
   ```java
   // Less portable
   System.out.printf("Line 1\nLine 2");
   // Better
   System.out.printf("Line 1%nLine 2");
   ```

## Performance Considerations

- `println()` and `print()` are generally faster for simple output
- `printf()` has overhead due to format string parsing
- For high-performance applications, consider using `StringBuilder` for complex string building
- The performance difference is negligible for typical applications

## Practical Applications

- **Debugging**: Use `println()` for quick debug output
- **User Interfaces**: Use `printf()` for formatted menus and reports
- **Data Display**: Use `printf()` for tables and aligned columns
- **Progress Indicators**: Use `print()` for same-line updates

This guide covers the essential aspects of Java's print methods, helping you choose the right method for your specific output needs.