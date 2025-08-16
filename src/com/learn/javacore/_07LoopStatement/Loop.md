📘 Explanation in Markdown
# Loop Statements in Java

Loops allow us to **execute a block of code multiple times** until a condition is met.

---

## 1. `for` Loop
The **traditional for loop** is used when the number of iterations is **known**.

```java
for (int i = 0; i < 4; i++) {
    System.out.println("Iteration: " + i);
}


✔️ Initialization → Condition → Increment/Decrement

2. Enhanced for-each Loop

Used to iterate over arrays or collections without index handling.

char[] chars = {'a', 'b', 'c'};
for (char c : chars) {
    System.out.println(c);
}

3. while Loop

Executes a block of code as long as the condition is true.

int i = 3;
while (i > 0) {
    System.out.println("Countdown: " + i);
    i--;
}

4. do-while Loop

Similar to while, but executes at least once before checking the condition.

int num = 1;
do {
    System.out.println("Runs once");
    num--;
} while (num > 0);

5. Nested Loops

Loops inside another loop. Commonly used in matrices, patterns, and tables.

for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print(row * col + " ");
    }
    System.out.println();
}

🔑 Key Points

Use for when you know the number of iterations.

Use for-each to loop over arrays/collections.

Use while when the number of iterations is unknown (depends on condition).

Use do-while when you need to run at least once.

Use nested loops for grids, tables, and patterns.


