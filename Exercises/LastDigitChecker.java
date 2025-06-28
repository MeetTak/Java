package Exercises;

public class LastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit(264, 234,435);
    }

    public static boolean hasSameLastDigit (int first, int second, int third) {
        boolean firstValid = first > 10 && first < 1000;
        boolean secondValid = second > 10 && second < 1000;
        boolean thirdValid = third > 10 && third < 1000;

        if (!firstValid || !secondValid || !thirdValid) {
            return false;
        }

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;
        boolean firstSame = firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit;
        boolean secondSame = secondLastDigit == firstLastDigit || secondLastDigit == thirdLastDigit;
        boolean thirdSame = thirdLastDigit == firstLastDigit || thirdLastDigit == secondLastDigit;
        
        return firstSame || secondSame || thirdSame;
    }
}

// Alternatively
// public class LastDigitChecker {

//     public static boolean isValid(int number) {
//         return number >= 10 && number <= 1000;
//     }

//     public static boolean hasSameLastDigit(int a, int b, int c) {

//         if (!isValid(a) || !isValid(b) || !isValid(c)) {
//             return false;
//         }

//         int lastA = a % 10;
//         int lastB = b % 10;
//         int lastC = c % 10;
//         return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
//     }
// }
