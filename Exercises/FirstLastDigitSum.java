package Exercises;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of First Number and Last Number is " + sumFirstAndLastDigit(223));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstNum = 0;
        int lastNum = 0;
        int sum = 0;
        while (number != 0) {
            if (number < 0) {
                return -1;
            } else {
                lastNum = number % 10;
                firstNum = number;
                while (firstNum >= 10) {
                    firstNum /= 10;
                }
                sum = lastNum + firstNum;
            }
        }
        return sum;
    }
} // this code is causing run time error although i am getting the correct results but there might be an exception which is causing some problem.

// Alternatively
// public class FirstLastDigitSum {

//     public static int sumFirstAndLastDigit(int number) {

//         if (number < 0) {
//             return -1;
//         }

//         int lastDigit = number % 10; // use % 10 to get last digit in a number.
//         while (number >= 10) {
//             number /= 10; // divide with 10 until there is 1 digit left (< 10) to get first digit. This is
//                           // also equivalent to number = number / 10.
//         }

//         int firstDigit = number; // this is not necessary, but this makes it clear that number is now the first
//                                  // digit.
//         return firstDigit + lastDigit;
//     }
// }
