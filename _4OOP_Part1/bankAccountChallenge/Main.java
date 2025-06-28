package _4OOP_Part1.bankAccountChallenge;

public class Main {

    public static void main(String[] args) {
        
        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerBalance("Bob Brown");
        bobsAccount.setCustomerBalance("myemail@bob.com");
        bobsAccount.setCustomerBalance("(087) 123-4567");
        
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.depositFunds(54.45);
    }
}
