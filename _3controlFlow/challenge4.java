package _3controlFlow;

public class challenge4 {
    public static void main(String[] args) {
        int counter = 0;
        // for (int number = 0; counter < 3; number++) {
        //     if (isPrime(number)) {
        //         System.out.println(number + " is a prime number");
        //         counter++;
        //     }

        //Alternatively
        // for (int number = 0; number <= 1000; number++ ) {
        //     if (isPrime(number)) {
        //         System.out.println(number + " is a prime number");
        //         counter++;
        //         if (counter == 3) {
        //             System.out.println("Found 3 - Exiting for loop");
        //             break;
        //         }
        //     }
        // }

        //Alternatively
        for (int number = 0; counter <3 && number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
                counter++;
            }
        }
    }
    

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    } 
}
