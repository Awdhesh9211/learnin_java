# Java System Class - Complete Hierarchy & Methods Guide

## System Class Overview

**Package:** `java.lang.System`
**Type:** `public final class System extends Object`
**Purpose:** System class provides access to system-related resources and utilities

```
java.lang.Object
    └── java.lang.System (final class)
```

## System Class Characteristics

- **Final Class:** Cannot be extended
- **No Constructor:** Cannot be instantiated (all methods are static)
- **Utility Class:** Provides system-level operations
- **Thread-Safe:** Most operations are thread-safe

## Fields (Static Final)

### Input/Output Streams

```java
// Standard input stream (usually keyboard)
public static final InputStream in

// Standard output stream (usually console)
public static final PrintStream out

// Standard error output stream
public static final PrintStream err
```

## Core Methods Categories

### 1. Array Operations

#### arraycopy()
```java
public static void arraycopy(Object src, int srcPos, 
                           Object dest, int destPos, int length)

// Example
int[] source = {1, 2, 3, 4, 5};
int[] destination = {6, 7, 8, 9, 10};
System.arraycopy(source, 0, destination, 2, 2);
// Result: [6, 7, 1, 2, 10]

// Exceptions:
// - IndexOutOfBoundsException: Invalid indices
// - ArrayStoreException: Type mismatch
// - NullPointerException: null array
```

### 2. System Properties Operations

#### getProperty()
```java
// Get system property
public static String getProperty(String key)
public static String getProperty(String key, String defaultValue)

// Examples
System.getProperty("user.name");        // Current user
System.getProperty("os.name");          // Operating system
System.getProperty("java.version");     // Java version
System.getProperty("file.separator");   // File separator (\ or /)
System.getProperty("path.separator");   // Path separator (; or :)
System.getProperty("line.separator");   // Line separator

// With default value
System.getProperty("custom.property", "default_value");
```

#### setProperty()
```java
// Set system property
public static String setProperty(String key, String value)

// Example
System.setProperty("user.country", "IN");
String oldValue = System.setProperty("app.name", "MyApp");
```

#### clearProperty()
```java
// Remove system property
public static String clearProperty(String key)

// Example
String oldValue = System.clearProperty("user.timezone");
```

### 3. Environment Variables

#### getenv()
```java
// Get all environment variables
public static Map<String, String> getenv()

// Get specific environment variable
public static String getenv(String name)

// Examples
Map<String, String> env = System.getenv();
String path = System.getenv("PATH");
String home = System.getenv("HOME");        // Unix/Linux
String userProfile = System.getenv("USERPROFILE"); // Windows
```

### 4. Time Operations

#### currentTimeMillis()
```java
public static long currentTimeMillis()

// Returns: milliseconds since January 1, 1970, 00:00:00 UTC
long currentTime = System.currentTimeMillis();

// Usage for measuring execution time
long start = System.currentTimeMillis();
// ... some operation
long end = System.currentTimeMillis();
System.out.println("Execution time: " + (end - start) + " ms");
```

#### nanoTime()
```java
public static long nanoTime()

// Returns: nanoseconds from arbitrary origin (for measuring elapsed time)
long startTime = System.nanoTime();
// ... some operation
long endTime = System.nanoTime();
System.out.println("Duration: " + (endTime - startTime) + " ns");
```

### 5. Memory Management

#### gc()
```java
public static void gc()

// Suggests JVM to run garbage collector
System.gc(); // Just a suggestion, not guaranteed to run immediately

// Better to let JVM handle automatically
Runtime.getRuntime().gc(); // Alternative approach
```

#### runFinalization()
```java
public static void runFinalization()

// Suggests JVM to run finalize() methods of pending objects
System.runFinalization();
```

### 6. JVM Control

#### exit()
```java
public static void exit(int status)

// Terminates JVM
// Status codes:
// 0 = Normal termination
// Non-zero = Abnormal termination

System.exit(0);  // Normal exit
System.exit(1);  // Error exit
System.exit(-1); // General error
```

### 7. Security Operations

#### getSecurityManager() & setSecurityManager()
```java
public static SecurityManager getSecurityManager()
public static void setSecurityManager(SecurityManager s)

// Check if security manager exists
SecurityManager sm = System.getSecurityManager();
if (sm != null) {
    System.out.println("Security manager is active");
}

// Set security manager (deprecated in Java 17+)
System.setSecurityManager(new SecurityManager());
```

### 8. Stream Redirection

#### setIn(), setOut(), setErr()
```java
public static void setIn(InputStream in)
public static void setOut(PrintStream out)  
public static void setErr(PrintStream err)

// Example: Redirect output to file
try {
    PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt"));
    System.setOut(fileOut);
    System.out.println("This goes to file");
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

### 9. Console Operations

#### console()
```java
public static Console console()

// Get console object (may return null in IDEs)
Console console = System.console();
if (console != null) {
    String username = console.readLine("Username: ");
    char[] password = console.readPassword("Password: ");
}
```

### 10. Library Operations

#### load() & loadLibrary()
```java
public static void load(String filename)      // Full path
public static void loadLibrary(String libname) // Library name

// Load native library with full path
System.load("/path/to/library.so");

// Load library by name (searches in java.library.path)
System.loadLibrary("nativeLib");
```

#### mapLibraryName()
```java
public static String mapLibraryName(String libname)

// Maps library name to platform-specific format
String mappedName = System.mapLibraryName("mylib");
// Windows: mylib.dll
// Linux: libmylib.so  
// macOS: libmylib.dylib
```

### 11. Object Identity

#### identityHashCode()
```java
public static int identityHashCode(Object x)

// Returns default hashCode regardless of overridden hashCode()
Object obj1 = new Object();
Object obj2 = new Object();

int hash1 = System.identityHashCode(obj1);
int hash2 = System.identityHashCode(obj2);
// Different values even if hashCode() is overridden
```

### 12. Line Separator

#### lineSeparator()
```java
public static String lineSeparator()

// Returns platform-specific line separator
String newLine = System.lineSeparator();
// Windows: "\r\n"
// Unix/Linux/Mac: "\n"

// Usage
System.out.print("Line 1" + System.lineSeparator() + "Line 2");
```

### 13. Inherited Channel

#### inheritedChannel()
```java
public static Channel inheritedChannel() throws IOException

// Returns channel inherited from parent process
Channel channel = System.inheritedChannel();
if (channel != null) {
    // Process inherited channel
}
```

## Common System Properties

```java
// User properties
System.getProperty("user.name");     // Username
System.getProperty("user.home");     // User home directory
System.getProperty("user.dir");      // Current working directory

// Java properties  
System.getProperty("java.version");     // Java version
System.getProperty("java.home");        // Java installation directory
System.getProperty("java.class.path");  // Classpath
System.getProperty("java.library.path"); // Library path

// OS properties
System.getProperty("os.name");       // Operating system name
System.getProperty("os.version");    // OS version
System.getProperty("os.arch");       // System architecture

// File system properties
System.getProperty("file.separator");   // File separator
System.getProperty("path.separator");   // Path separator  
System.getProperty("line.separator");   // Line separator
```

## Best Practices

### 1. Property Handling
```java
// Always provide default values
String configPath = System.getProperty("config.path", "default/config");

// Validate properties
String port = System.getProperty("server.port", "8080");
try {
    int portNum = Integer.parseInt(port);
    if (portNum <= 0 || portNum > 65535) {
        throw new IllegalArgumentException("Invalid port: " + port);
    }
} catch (NumberFormatException e) {
    System.err.println("Invalid port format: " + port);
}
```

### 2. Time Measurement
```java
// Use nanoTime() for measuring durations
long startTime = System.nanoTime();
performOperation();
long duration = System.nanoTime() - startTime;
System.out.println("Duration: " + duration / 1_000_000 + " ms");

// Use currentTimeMillis() for timestamps
long timestamp = System.currentTimeMillis();
Date currentDate = new Date(timestamp);
```

### 3. Error Handling
```java
// Proper exception handling for System operations
try {
    String value = System.getProperty("required.property");
    if (value == null) {
        System.err.println("Required property not set");
        System.exit(1);
    }
} catch (SecurityException e) {
    System.err.println("Security manager prevents property access");
    System.exit(1);
}
```

### 4. Resource Management
```java
// Proper stream redirection cleanup
PrintStream originalOut = System.out;
try {
    PrintStream fileOut = new PrintStream(new FileOutputStream("log.txt"));
    System.setOut(fileOut);
    // ... operations
} finally {
    System.setOut(originalOut); // Restore original output
}
```

## Common Use Cases

### 1. Configuration Management
```java
public class AppConfig {
    private static final String CONFIG_FILE = 
        System.getProperty("config.file", "app.properties");
    
    private static final String LOG_LEVEL = 
        System.getProperty("log.level", "INFO");
}
```

### 2. Performance Monitoring
```java
public class PerformanceMonitor {
    public static void timeOperation(Runnable operation) {
        long start = System.nanoTime();
        operation.run();
        long duration = System.nanoTime() - start;
        System.out.printf("Operation took: %.2f ms%n", 
                         duration / 1_000_000.0);
    }
}
```

### 3. Environment Detection
```java
public class EnvironmentUtil {
    public static boolean isWindows() {
        return System.getProperty("os.name")
                    .toLowerCase().contains("windows");
    }
    
    public static boolean isDevelopment() {
        return "development".equals(System.getProperty("env"));
    }
}
```

### 4. File Operations
```java
public class FileUtil {
    public static String getUserHome() {
        return System.getProperty("user.home");
    }
    
    public static String getFileSeparator() {
        return System.getProperty("file.separator");
    }
    
    public static String buildPath(String... parts) {
        return String.join(System.getProperty("file.separator"), parts);
    }
}
```

## Important Notes

1. **Thread Safety**: Most System methods are thread-safe
2. **Security**: Security manager can restrict access to System methods
3. **Platform Independence**: Use System properties instead of hard-coded paths
4. **Performance**: Avoid frequent calls to time methods in tight loops
5. **Memory**: System.gc() is just a hint, JVM may ignore it
6. **Exit Codes**: Follow standard conventions (0 = success, non-zero = error)

---

## Complete System Class Methods Summary

| Category | Method | Description | Return Type |
|----------|---------|-------------|-------------|
| **Array** | `arraycopy()` | Copy array elements | `void` |
| **Properties** | `getProperty()` | Get system property | `String` |
| | `setProperty()` | Set system property | `String` |
| | `clearProperty()` | Remove system property | `String` |
| | `getProperties()` | Get all properties | `Properties` |
| **Environment** | `getenv()` | Get environment variables | `Map<String,String>` |
| | `getenv(String)` | Get specific env variable | `String` |
| **Time** | `currentTimeMillis()` | Current time in milliseconds | `long` |
| | `nanoTime()` | High-resolution time | `long` |
| **Memory** | `gc()` | Suggest garbage collection | `void` |
| | `runFinalization()` | Run finalize methods | `void` |
| **JVM** | `exit()` | Terminate JVM | `void` |
| **Security** | `getSecurityManager()` | Get security manager | `SecurityManager` |
| | `setSecurityManager()` | Set security manager | `void` |
| **Streams** | `setIn()` | Set standard input | `void` |
| | `setOut()` | Set standard output | `void` |
| | `setErr()` | Set error output | `void` |
| **Console** | `console()` | Get console object | `Console` |
| **Libraries** | `load()` | Load native library | `void` |
| | `loadLibrary()` | Load library by name | `void` |
| | `mapLibraryName()` | Map library name | `String` |
| **Utility** | `identityHashCode()` | Get identity hash code | `int` |
| | `lineSeparator()` | Get line separator | `String` |
| | `inheritedChannel()` | Get inherited channel | `Channel` |