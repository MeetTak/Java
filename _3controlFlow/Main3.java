package _3controlFlow;

public class Main3 {
    public static void main(String[] args) {
        
        for (int counter = 1; counter <= 5; counter++)
        {
            System.out.println(counter);
        }

        // System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        // System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        // System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        // Alternatively

        for (double rate = 2.0; rate <= 4.0; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
