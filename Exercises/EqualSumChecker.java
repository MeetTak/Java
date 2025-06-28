package Exercises;

public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, 2, 5);
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        return (firstNum + secondNum) == thirdNum;
    }
}
