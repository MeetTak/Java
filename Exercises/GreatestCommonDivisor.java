package Exercises;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("The greatest common factor is " + getGreatestCommonDivisor(39, 13));
    }

    public static int getGreatestCommonDivisor (int first, int  second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int gcd = 1;
            for (int num = 1;num <= first && num <= second; num++) {
                if (first % num == 0 && second % num == 0) {
                    gcd = num;
                }
            }
            return gcd;
        }
        // return gcd; // if you try using the return statement it will cause error bcoz we are using if else statement
    }
}
// Do remember this approach that we have initialized gcd first and then returned num

// Alternatively
// public class GreatestCommonDivisor {

//     public static int getGreatestCommonDivisor(int first, int second) {

//         if (first < 10 || second < 10) {
//             return -1;
//         }

//         int min = first < second ? first : second;
//         int gcd = 1;
//         for (int j = 1; j <= min; j++) {
//             if (first % j == 0 && second % j == 0) {
//                 gcd = j;
//             }
//         }
//         return gcd;
//     }
// }