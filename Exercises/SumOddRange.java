package Exercises;

// public class SumOddRange {
//     public static int sumOdd(int start, int end){
//         if (start < 0 || end < 0 || start < end || start == end ) {
//             System.out.println("false");
//             return -1;
//             // return false;// since falsse is a boolean value not int so we can't use it.
//         }

//         else {
//             int sum = 0;
//             for (int number = start; number <= end; number++) {
//                 if (isOdd(number)) {
//                     sum += number;
//                     // return sum;
//                 }
//             }
//             return sum;
//         }
//     }

//     public static boolean isOdd(int number) {
//         if (number % 2 == 0) {
//             return true;
//         }
//     }
// }



public class SumOddRange {

    public static void main(String[] args) {
        System.out.println("Sum of odd numbers between 1 and 100: " + sumOdd(1, 100));
        System.out.println("Sum of odd numbers between -1 and 100: " + sumOdd(-1, 100));
        System.out.println("Sum of odd numbers between 100 and 100: " + sumOdd(100, 100));
        System.out.println("Sum of odd numbers between 13 and 13: " + sumOdd(13, 13));
        System.out.println("Sum of odd numbers between 100 and 1: " + sumOdd(100, 1)); // This should return -1 due to
                                                                                       // invalid range
    }
    
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
