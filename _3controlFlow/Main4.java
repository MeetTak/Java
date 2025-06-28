package _3controlFlow;

public class Main4 {
    public static void main(String[] args) {
        
        System.out.println("8 is " + (isPrime(8) ? "" : "not ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "not ") + "a prime number");
    }

    public static boolean isPrime(int wholeNumber) {

        if ( wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
