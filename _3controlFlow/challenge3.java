package _3controlFlow;

public class challenge3 {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate = rate + 0.25 ) {// you could have also written rate += 0.25
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + rate + "% interest = $" + interestAmount);
        }
    }

    public static double calculateInterest(double interestAmount, double rate) {
            return (interestAmount * (rate / 100));
    }
}
