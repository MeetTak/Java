package Exercises;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int num = 1; num <= number; num++) {
                if (number % num == 0) {
                    System.out.println(num);
                }
            }
        }
    }
}

// Alternatively
// public class FactorPrinter {

//     public static void printFactors(int number) {

//         if (number < 1) {
//             System.out.println("Invalid Value");
//             return;
//         }

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }