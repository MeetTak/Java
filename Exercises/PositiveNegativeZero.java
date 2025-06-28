package Exercises;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        checkNumber(number);

        scanner.close();
    }
    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");    
    }
}
