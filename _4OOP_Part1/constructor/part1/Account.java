package _4OOP_Part1.constructor.part1;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this .customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
        // customerEmail = email;
        // customerPhone = phone;
    }

    public void depositFunds(double depositAmount) { // This is a method
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


