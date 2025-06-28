package _3controlFlow;

import java.util.Scanner;

public class challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int number = scanner.nextInt();

        System.out.println("Sum of digits of the " + number + " is " + sumDigits(number));

        scanner.close();

        
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int sum = 0;
            while (number >0) {
                int digit = number % 10;
                sum += digit;//sum = sum + digit
                number /= 10;// number = number / 10
            }
            // System.out.println("sum is = " + sum);// will do the same thing if we add this statement in place of the above mentioned in the main statement.
            return sum;
        }
    }
}
