package Exercises;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("The number is " + isPerfectNumber(6) + "ly perfect number");
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            for (int num = 1; num <= number / 2; num++) {
                if (number % num == 0) {
                    sum += num;
                }
            }
            return sum == number; // while using else u need to remember on thing is to mention this statement within the else statement itself if you forgot to do so u will make an error.
        }
    }
}

// Alternatively
// public class PerfectNumber {

//     public static boolean isPerfectNumber(int number) {

//         if (number < 1) {
//             return false;
//         }

//         int sum = 0;
//         for (int i = 1; i < number; i++) {
//             if (number % i == 0) {
//                 sum += i;
//             }
//         }
//         return sum == number;
//     }
// }
