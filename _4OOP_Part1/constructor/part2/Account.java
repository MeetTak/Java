package _4OOP_Part1.constructor.part2;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {// this is a constructor
        this("56789", 2.50, "Default name", "Default address", "Default phone");// need to use this in the first line of constructor only if you use this after the print statement it will cause an error.
        System.out.println("Empty constructor called");
    }

    // So we will be going to defind two constructors now 
    // if all the basically parameters are provided this particular constructor will be used
    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
        // customerEmail = email;
        // customerPhone = phone;
    }

    // if only a certain parameters are given then this constructor will be used
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);// example of constructor chaining, where one constructor calls another constructor of the smae class to reuse code.
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }
    // the commented-out lines in both constructors suggest that there were initial attempts to directly initialize the fields. However, these lines were replaced by constructor chaining to avoid redundancy and ensure a single point of initialization, which is a good practice for code maintainability and readability.

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);// instead of balance u can also write this.balance
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerBalance(String customerBalance) {
        this.customerName = customerBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
