package com.learn.javacore._01Hello;

/**
 * SystemExample.java - Complete demonstration of Java System class
 * Shows all major System class methods with practical examples
 *
 * @author Java Developer
 * @version 1.0
 */

import java.io.*;
import java.nio.channels.Channel;
import java.util.*;

public class SystemExample {

    public static void main(String[] args) {
        System.out.println("=== JAVA SYSTEM CLASS COMPLETE DEMONSTRATION ===");
        System.out.println();

        // 1. Array Operations
        demonstrateArrayOperations();

        // 2. System Properties
        demonstrateSystemProperties();

        // 3. Environment Variables
        demonstrateEnvironmentVariables();

        // 4. Time Operations
        demonstrateTimeOperations();

        // 5. Memory Management
        demonstrateMemoryManagement();

        // 6. Stream Operations
        demonstrateStreamOperations();

        // 7. Console Operations
        demonstrateConsoleOperations();

        // 8. Security Manager
        demonstrateSecurityManager();

        // 9. Library Operations
        demonstrateLibraryOperations();

        // 10. Utility Methods
        demonstrateUtilityMethods();

        // 11. Performance Measurement
        demonstratePerformanceMeasurement();

        // 12. Real-world Use Cases
        demonstrateRealWorldUseCases();

        System.out.println("\n=== DEMONSTRATION COMPLETED ===");
    }

    /**
     * 1. Array Operations - arraycopy() method
     */
    public static void demonstrateArrayOperations() {
        System.out.println("1. ARRAY OPERATIONS");
        System.out.println("-------------------");

        // Basic array copying
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = {6, 7, 8, 9, 10};

        System.out.println("Source array: " + Arrays.toString(source));
        System.out.println("Destination array (before): " + Arrays.toString(destination));

        // Copy 2 elements from source[0] to destination[2]
        System.arraycopy(source, 0, destination, 2, 2);
        System.out.println("After arraycopy(source, 0, destination, 2, 2):");
        System.out.println("Destination array (after): " + Arrays.toString(destination));

        // Copying strings
        String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai"};
        String[] newCities = new String[6];
        Arrays.fill(newCities, "Unknown");

        System.arraycopy(cities, 0, newCities, 1, cities.length);
        System.out.println("String array copy: " + Arrays.toString(newCities));

        // Exception handling
        try {
            int[] small = new int[2];
            System.arraycopy(source, 0, small, 0, 5); // This will throw exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println();
    }

    /**
     * 2. System Properties Operations
     */
    public static void demonstrateSystemProperties() {
        System.out.println("2. SYSTEM PROPERTIES");
        System.out.println("--------------------");

        // Common system properties
        String[] commonProperties = {
                "java.version", "java.home", "java.class.path",
                "os.name", "os.version", "os.arch",
                "user.name", "user.home", "user.dir",
                "file.separator", "path.separator", "line.separator"
        };

        System.out.println("Common System Properties:");
        for (String property : commonProperties) {
            String value = System.getProperty(property);
            System.out.println(property + " = " + (value != null ? value : "null"));
        }

        // Setting custom properties
        System.out.println("\nCustom Properties:");
        System.setProperty("app.name", "SystemExample");
        System.setProperty("app.version", "1.0");
        System.setProperty("app.author", "Java Developer");

        System.out.println("app.name = " + System.getProperty("app.name"));
        System.out.println("app.version = " + System.getProperty("app.version"));

        // Using default values
        String configPath = System.getProperty("config.path", "default/config");
        System.out.println("config.path = " + configPath + " (using default)");

        // Clear property
        String oldValue = System.clearProperty("app.author");
        System.out.println("Cleared app.author, old value: " + oldValue);
        System.out.println("app.author now = " + System.getProperty("app.author"));

        System.out.println();
    }

    /**
     * 3. Environment Variables
     */
    public static void demonstrateEnvironmentVariables() {
        System.out.println("3. ENVIRONMENT VARIABLES");
        System.out.println("------------------------");

        // Get all environment variables
        Map<String, String> env = System.getenv();
        System.out.println("Total environment variables: " + env.size());

        // Show first 5 environment variables
        System.out.println("\nFirst 5 Environment Variables:");
        env.entrySet().stream()
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        // Get specific environment variables
        String[] commonEnvVars = {"PATH", "JAVA_HOME", "HOME", "USER", "TEMP", "TMP"};

        System.out.println("\nCommon Environment Variables:");
        for (String var : commonEnvVars) {
            String value = System.getenv(var);
            if (value != null) {
                // Truncate long paths for display
                if (value.length() > 100) {
                    value = value.substring(0, 97) + "...";
                }
                System.out.println(var + " = " + value);
            }
        }

        System.out.println();
    }

    /**
     * 4. Time Operations
     */
    public static void demonstrateTimeOperations() {
        System.out.println("4. TIME OPERATIONS");
        System.out.println("------------------");

        // Current time in milliseconds
        long currentTime = System.currentTimeMillis();
        System.out.println("Current time (ms): " + currentTime);
        System.out.println("Current date: " + new Date(currentTime));

        // High-resolution time
        long nanoStart = System.nanoTime();
        System.out.println("Nano time start: " + nanoStart);

        // Simulate some work
        try {
            Thread.sleep(100); // Sleep for 100ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long nanoEnd = System.nanoTime();
        long duration = nanoEnd - nanoStart;

        System.out.println("Nano time end: " + nanoEnd);
        System.out.println("Duration (nanoseconds): " + duration);
        System.out.println("Duration (milliseconds): " + duration / 1_000_000);

        System.out.println();
    }

    /**
     * 5. Memory Management
     */
    public static void demonstrateMemoryManagement() {
        System.out.println("5. MEMORY MANAGEMENT");
        System.out.println("-------------------");

        Runtime runtime = Runtime.getRuntime();

        // Memory info before creating objects
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Memory before object creation:");
        System.out.println("Total memory: " + totalMemory / 1024 / 1024 + " MB");
        System.out.println("Free memory: " + freeMemory / 1024 / 1024 + " MB");
        System.out.println("Used memory: " + usedMemory / 1024 / 1024 + " MB");

        // Create many objects
        List<String> objects = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            objects.add("Object " + i);
        }

        System.out.println("\nAfter creating 100,000 objects:");
        freeMemory = runtime.freeMemory();
        usedMemory = totalMemory - freeMemory;
        System.out.println("Used memory: " + usedMemory / 1024 / 1024 + " MB");

        // Clear references
        objects.clear();
        objects = null;

        // Suggest garbage collection
        System.gc();
//        System.runFinalization();  -- deprecated

        // Check memory after GC
        try {
            Thread.sleep(100); // Give GC time to run
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAfter garbage collection:");
        freeMemory = runtime.freeMemory();
        usedMemory = runtime.totalMemory() - freeMemory;
        System.out.println("Used memory: " + usedMemory / 1024 / 1024 + " MB");

        System.out.println();
    }

    /**
     * 6. Stream Operations
     */
    public static void demonstrateStreamOperations() {
        System.out.println("6. STREAM OPERATIONS");
        System.out.println("-------------------");

        // Save original streams
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        InputStream originalIn = System.in;

        try {
            // Demonstrate output redirection
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);

            System.setOut(newOut);
            System.out.println("This message goes to the new output stream");
            System.out.println("And so does this one!");

            // Restore original output
            System.setOut(originalOut);
            System.out.println("Redirected output captured: " + baos.toString().trim());

            // Demonstrate error stream redirection
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            System.setErr(new PrintStream(errorStream));

            System.err.println("This is an error message");

            // Restore error stream
            System.setErr(originalErr);
            System.out.println("Captured error: " + errorStream.toString().trim());

        } catch (Exception e) {
            System.out.println("Error in stream operations: " + e.getMessage());
        } finally {
            // Always restore original streams
            System.setOut(originalOut);
            System.setErr(originalErr);
            System.setIn(originalIn);
        }

        System.out.println();
    }

    /**
     * 7. Console Operations
     */
    public static void demonstrateConsoleOperations() {
        System.out.println("7. CONSOLE OPERATIONS");
        System.out.println("--------------------");

        Console console = System.console();
        if (console != null) {
            System.out.println("Console is available");
            // In real application, you can use:
            // String input = console.readLine("Enter your name: ");
            // char[] password = console.readPassword("Enter password: ");
        } else {
            System.out.println("Console is not available (probably running in IDE)");
            System.out.println("Console methods work best in terminal/command prompt");
        }

        System.out.println();
    }

    /**
     * 8. Security Manager (deprecated in Java 17+)
     */
    public static void demonstrateSecurityManager() {
        System.out.println("8. SECURITY MANAGER");
        System.out.println("------------------");

//        SecurityManager sm = System.getSecurityManager(); -- deprecated

//        if (sm == null) {
//            System.out.println("No security manager is currently installed");
//        } else {
//            System.out.println("Security manager is active: " + sm.getClass().getName());
//        }

        // Note: Setting security manager is deprecated in Java 17+
        System.out.println("Note: SecurityManager is deprecated since Java 17");

        System.out.println();
    }

    /**
     * 9. Library Operations
     */
    public static void demonstrateLibraryOperations() {
        System.out.println("9. LIBRARY OPERATIONS");
        System.out.println("--------------------");

        // Map library names to platform-specific names
        String[] libraries = {"math", "ssl", "crypto", "zip"};

        System.out.println("Library name mapping:");
        for (String lib : libraries) {
            String mappedName = System.mapLibraryName(lib);
            System.out.println(lib + " -> " + mappedName);
        }

        // Note: Actually loading libraries would require existing native libraries
        System.out.println("\nNote: load() and loadLibrary() methods are used for native libraries");
        System.out.println("These methods require actual native library files to demonstrate");

        System.out.println();
    }

    /**
     * 10. Utility Methods
     */
    public static void demonstrateUtilityMethods() {
        System.out.println("10. UTILITY METHODS");
        System.out.println("------------------");

        // Line separator
        String lineSeparator = System.lineSeparator();
        System.out.println("Line separator: " + Arrays.toString(lineSeparator.toCharArray()));
        System.out.println("Line separator length: " + lineSeparator.length());

        // Identity hash code
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1;

        System.out.println("\nIdentity Hash Codes:");
        System.out.println("str1.hashCode(): " + str1.hashCode());
        System.out.println("str2.hashCode(): " + str2.hashCode());
        System.out.println("str1.identityHashCode(): " + System.identityHashCode(str1));
        System.out.println("str2.identityHashCode(): " + System.identityHashCode(str2));
        System.out.println("str3.identityHashCode(): " + System.identityHashCode(str3));

        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str2: " + (str1 == str2));

        // Inherited channel
        try {
            Channel channel = System.inheritedChannel();
            System.out.println("\nInherited channel: " +
                    (channel != null ? channel.getClass().getName() : "null"));
        } catch (IOException e) {
            System.out.println("Error getting inherited channel: " + e.getMessage());
        }

        System.out.println();
    }

    /**
     * 11. Performance Measurement
     */
    public static void demonstratePerformanceMeasurement() {
        System.out.println("11. PERFORMANCE MEASUREMENT");
        System.out.println("---------------------------");

        // Measure different operations
        measureOperation("String concatenation", () -> {
            String result = "";
            for (int i = 0; i < 1000; i++) {
                result += "test" + i;
            }
        });

        measureOperation("StringBuilder", () -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 1000; i++) {
                sb.append("test").append(i);
            }
            sb.toString();
        });

        measureOperation("Array creation", () -> {
            int[] array = new int[10000];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * i;
            }
        });

        System.out.println();
    }

    /**
     * Helper method to measure operation performance
     */
    private static void measureOperation(String operationName, Runnable operation) {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();

        long durationNanos = endTime - startTime;
        double durationMillis = durationNanos / 1_000_000.0;

        System.out.printf("%-20s: %8.2f ms (%,d ns)%n",
                operationName, durationMillis, durationNanos);
    }

    /**
     * 12. Real-world Use Cases
     */
    public static void demonstrateRealWorldUseCases() {
        System.out.println("12. REAL-WORLD USE CASES");
        System.out.println("------------------------");

        // Configuration management
        ApplicationConfig config = new ApplicationConfig();
        System.out.println("Application Configuration:");
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Debug Mode: " + config.isDebugMode());
        System.out.println("Log Level: " + config.getLogLevel());

        // Platform detection
        PlatformUtils platform = new PlatformUtils();
        System.out.println("\nPlatform Information:");
        System.out.println("Operating System: " + platform.getOperatingSystem());
        System.out.println("Is Windows: " + platform.isWindows());
        System.out.println("Is Unix/Linux: " + platform.isUnix());
        System.out.println("Architecture: " + platform.getArchitecture());

        // File operations
        FileUtils fileUtils = new FileUtils();
        System.out.println("\nFile Operations:");
        System.out.println("User Home: " + fileUtils.getUserHome());
        System.out.println("Current Directory: " + fileUtils.getCurrentDirectory());
        System.out.println("Temp Directory: " + fileUtils.getTempDirectory());

        String[] pathParts = {"home", "user", "documents", "file.txt"};
        System.out.println("Built Path: " + fileUtils.buildPath(pathParts));

        System.out.println();
    }

    /**
     * Configuration management using System properties
     */
    static class ApplicationConfig {
        public String getAppName() {
            return System.getProperty("app.name", "DefaultApp");
        }

        public String getVersion() {
            return System.getProperty("app.version", "1.0.0");
        }

        public boolean isDebugMode() {
            return Boolean.parseBoolean(System.getProperty("debug.mode", "false"));
        }

        public String getLogLevel() {
            return System.getProperty("log.level", "INFO");
        }
    }

    /**
     * Platform utility class
     */
    static class PlatformUtils {
        public String getOperatingSystem() {
            return System.getProperty("os.name");
        }

        public boolean isWindows() {
            return getOperatingSystem().toLowerCase().contains("windows");
        }

        public boolean isUnix() {
            String os = getOperatingSystem().toLowerCase();
            return os.contains("unix") || os.contains("linux") || os.contains("mac");
        }

        public String getArchitecture() {
            return System.getProperty("os.arch");
        }
    }

    /**
     * File utility class using System properties
     */
    static class FileUtils {
        public String getUserHome() {
            return System.getProperty("user.home");
        }

        public String getCurrentDirectory() {
            return System.getProperty("user.dir");
        }

        public String getTempDirectory() {
            return System.getProperty("java.io.tmpdir");
        }

        public String getFileSeparator() {
            return System.getProperty("file.separator");
        }

        public String buildPath(String... pathParts) {
            return String.join(getFileSeparator(), pathParts);
        }
    }
}

/*
 * How to run this example:
 *
 * 1. Compile: javac SystemExample.java
 * 2. Run: java SystemExample
 *
 * You can also set system properties while running:
 * java -Dapp.name="MyApp" -Ddebug.mode=true SystemExample
 *
 * For console operations to work properly, run from command line/terminal
 * rather than from an IDE.
 */
