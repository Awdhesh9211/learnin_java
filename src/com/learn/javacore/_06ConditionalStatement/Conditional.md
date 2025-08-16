📘 Explanation in Markdown Format
# Conditional Statements in Java

Conditional statements are used to **make decisions** in a program based on certain conditions.

---

## 1. `if` Statement
The `if` statement executes a block of code **only if the condition is true**.

```java
if (age > 30) {
    System.out.println("Age is greater than 30");
}


✔️ If the condition is false → code inside if is skipped.

2. if-else Statement

The if-else provides two possible paths:

if block runs when the condition is true.

else block runs when the condition is false.

if (age < 30) {
    System.out.println("Young");
} else {
    System.out.println("Mature");
}

3. if-else if Ladder

This allows multiple conditions to be checked sequentially.
As soon as one condition is true, its block executes, and the rest are skipped.

if (age > 60) {
    System.out.println("Senior Citizen");
} else if (marks > 34) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}

4. switch Statement

The switch is used when you need to compare a single value against multiple possible values.
It makes code cleaner than writing multiple if-else conditions.

int day = 1;
switch (day) {
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Invalid Day");
}

5. Ternary Operator

A shorthand for if-else:

String result = (marks >= 35) ? "PASS" : "FAIL";


✔️ If condition is true → PASS
❌ Else → FAIL

🔑 Key Points

Use if when you want to check one condition.

Use if-else when you need two outcomes.

Use if-else if when there are multiple conditions.

Use switch when comparing one value with multiple possible values.

Use ternary operator for short, simple decisions.


---

👉 Do you also want me to make a **diagram/flowchart** (like decision-making flow) in the `.md` file so you can visualize ho