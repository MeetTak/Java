package Exercises;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of all the even numbers is " + getEvenDigitSum(23452));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int num = 0;
        int sum = 0;
        while (number > 0) { // firstly i had a logical error in my code i have written it as while (number >= 0) which is logically incorrect as it makes an infinite loop. 
            num = number % 10;
            number /= 10;
            if (num % 2 == 0) {
                sum += num;
                // number /= 10;
            }
            else {
                // number /= 10;
                continue;
            }
        }
        return sum;
    }
}

// Alternatively
// public class EvenDigitSum {

//     public static int getEvenDigitSum(int number) {

//         if (number < 0) {
//             return -1;
//         }

//         int sum = 0;
//         for (int i = number; i > 0; i /= 10) {
//             int lastDigit = i % 10;
//             if (lastDigit % 2 == 0) {
//                 sum += lastDigit;
//             }
//         }

//         // == alternative using while loop ==
//         // while (number > 0) {
//         // int lastDigit = number % 10;
//         // if (lastDigit % 2 == 0) {
//         // sum += lastDigit;
//         // }
//         // number /= 10;
//         // }

//         return sum;
//     }
// }
