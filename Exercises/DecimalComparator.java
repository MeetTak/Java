package Exercises;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1598, 3.1598686);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = (int) (firstNumber * 1000);
        secondNumber = (int) (secondNumber * 1000);
        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}

// Alternatively (better solution)
// public class DecimalComparator {

//     public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

//         long firstRounded = (long) (first * 1000);
//         long secondRounded = (long) (second * 1000);
//         return firstRounded == secondRounded;
//     }
// }
