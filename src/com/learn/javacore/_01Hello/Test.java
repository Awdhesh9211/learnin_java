// 📦 package - यह केवल एक folder/directory structure है
// Java में package का use classes को logically group करने और name conflicts से बचाने के लिए होता है
package com.learn.javacore._01Hello;

/*
 🏗️ class - यह एक blueprint होती है (जैसे मकान का नक्शा)
 इसमें दो चीजें होती हैं:
   1. Data Members (Variables, Properties)
   2. Member Functions (Methods, Behaviors)

 👉 class दो तरह की हो सकती है:
    - default (जब access modifier नहीं लिखा जाता, package-level access मिलता है)
    - public  (पूरे project में कहीं से भी access किया जा सकता है)
*/
public class Test {

    /*
     🚀 main method - यह Java program का entry point है।
     जब भी JVM किसी Java program को चलाता है तो सबसे पहले इसी method को call करता है।
     
     public - इसका मतलब यह method कहीं से भी accessible होना चाहिए।
     static - JVM को object create किए बिना ही method call करने की सुविधा देता है।
     void   - यह method कोई value return नहीं करता।
     String[] args - command line arguments को array के रूप में receive करता है।
    */
    public static void main(String[] args) {
        
        /*
         📌 System.out.println("Hello World!");
         
         System - java.lang package की एक final class है।
                  यह system resources (input/output, environment, etc.) को access करने देती है।
         
         out    - System class का एक static data member है 
                  जो PrintStream type का object है।
         
         println - PrintStream class का method है 
                   जो message को console पर print करता है और एक new line जोड़ता है।
        */
        
        System.out.println("Hello World!"); // Output: Hello World!
    }
}
