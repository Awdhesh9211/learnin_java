// 📦 package - यह केवल एक folder/directory structure है
// Java में package का use classes को logically group करने और name conflicts से बचाने के लिए होता है
package com.learn.javacore._01Hello;

/*
 🏗️ class - यह एक blueprint होती है (जैसे मकान का नक्शा)
 इसमें दो चीजें होती हैं:
   1. Data Members (Variables, Properties)
   2. Member Functions (Methods, Behaviors)

 👉 हर class Java में by default Object class से inherit करती है
    यानी compiler internally इस तरह मान लेता है:
       class Test extends Object { ... }

 👉 Object class Java का root class है और इसमें common methods होती हैं:
    - toString()
    - equals(Object obj)
    - hashCode()
    - getClass()
    - clone()
    - finalize()
*/
public class Test {

    /*
     🚀 main method - यह Java program का entry point है।
     जब भी JVM किसी Java program को चलाता है तो सबसे पहले इसी method को call करता है।
     
     public - कहीं से भी access हो सकता है
     static - JVM को object create किए बिना ही call करने की सुविधा देता है
     void   - return type (कुछ return नहीं करता)
     String[] args - command line arguments array
    */
    public static void main(String[] args) {

        /*
         📌 System.out.println("Hello World!");
         System - java.lang package की final class
         out    - static object (PrintStream का instance)
         println - PrintStream का method जो console पर print करता है
        */
        System.out.println("Hello World!"); // Output: Hello World!

        // ---------------------------
        // 🌍 Object class inheritance demo
        // ---------------------------

        // 👇 Test class का object बनाते हैं
        Test obj = new Test();

        // 🔹 toString() - Object को String representation देता है
        // Default implementation -> className@hashCode
        System.out.println("toString(): " + obj.toString());

        // 🔹 getClass() - runtime पर object की class बताता है
        System.out.println("getClass(): " + obj.getClass());

        // 🔹 hashCode() - object का unique hash value देता है
        System.out.println("hashCode(): " + obj.hashCode());

        // 🔹 equals() - दो objects की equality check करता है
        Test obj2 = new Test();
        System.out.println("equals(obj2): " + obj.equals(obj2)); // false (क्योंकि अलग objects हैं)

        // ---------------------------
        // ⚙️ Behind the Scenes (JVM Flow)
        // ---------------------------
        /*
         1. Source Code (Test.java) -> javac compiler -> Bytecode (Test.class)
         2. JVM का Class Loader -> Test.class + Object.class load करता है
         3. Method Area में Virtual Method Table (VMT) बनता है
            - पहले Object class की methods
            - फिर Test class की methods (main)
         4. Execution शुरू होता है -> JVM main() को call करता है
        */
    }
}
