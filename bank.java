import java.util.Scanner;

// Base class for all account types
class Account {
    String customerName;
    int accountNumber;
    double balance;

    public Account(String customerName, int accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit money and update balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Savings account class with compound interest feature
class SavAcct extends Account {
    double interestRate;

    public SavAcct(String customerName, int accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Compute and deposit interest into the account
    public void computeAndDepositInterest(int timePeriod) {
        double interest = balance * Math.pow((1 + interestRate / 100), timePeriod) - balance;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    // Withdraw from savings account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// Current account class with minimum balance requirement
class CurAcct extends Account {
    double minimumBalance;
    double serviceCharge;

    public CurAcct(String customerName, int accountNumber, double initialBalance, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    // Withdraw from current account with penalty check
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Balance below minimum. Service charge imposed: " + serviceCharge);
            }
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// Main Bank class
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a savings account
        SavAcct savings = new SavAcct("John Doe", 101, 1000, 5);
        System.out.println("\nSavings Account Created");
        savings.displayBalance();
        savings.deposit(500);
        savings.displayBalance();
        savings.computeAndDepositInterest(1); // Compound interest for 1 year
        savings.displayBalance();
        savings.withdraw(300);
        savings.displayBalance();

        // Create a current account
        CurAcct current = new CurAcct("Jane Smith", 102, 1500, 1000, 50);
        System.out.println("\nCurrent Account Created");
        current.displayBalance();
        current.deposit(300);
        current.displayBalance();
        current.withdraw(2000); // This should impose a penalty if balance < minimum
        current.displayBalance();

        scanner.close();
    }
}