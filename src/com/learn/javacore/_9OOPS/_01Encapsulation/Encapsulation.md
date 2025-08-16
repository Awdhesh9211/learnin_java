# Encapsulation in Java

Encapsulation = **Data Hiding + Controlled Access**.  
It wraps **fields (variables)** and **methods (functions)** inside a class and restricts direct access.

---

## 🔑 Key Rules
1. Variables should be **private**.
2. Provide **public getters and setters** to access/update data.
3. Add **validation logic** inside setters to ensure data integrity.

---

## ✅ Example 1: Student Class
```java
class Student {
    private String name;
    private int age;

    // Getter and Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }
}
✅ Example 2: BankAccount
java
Copy
Edit
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Only getter for accountNumber (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid Withdraw Amount");
        }
    }
}
Usage:

java
Copy
Edit
BankAccount acc = new BankAccount("ACC123", 5000);
acc.deposit(1500);
acc.withdraw(2000);
System.out.println("Balance: " + acc.getBalance());
✅ Example 3: Employee
java
Copy
Edit
class Employee {
    private int id;
    private String name;
    private double salary;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be at least 10,000");
        }
    }
}
🎯 Benefits of Encapsulation
✅ Protects sensitive data (balance, salary, etc.)

✅ Ensures validation (age > 0, salary ≥ 10000, balance ≥ 0)

✅ Can provide read-only/write-only properties

✅ Improves code security, maintainability, and reusability

📝 Real-Life Analogy
ATM Machine: You don’t access the bank’s database directly.

You interact with an interface (ATM screen → public methods).

Actual data (your balance → private fields) is hidden.