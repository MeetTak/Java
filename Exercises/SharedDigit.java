package Exercises;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12, 43);
    }

    public static boolean hasSharedDigit (int first, int second) {
        boolean firstValid = first > 1 && first < 100;
        boolean secondValid = second > 1 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }
        
        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
