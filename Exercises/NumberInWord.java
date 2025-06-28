package Exercises;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(9);
    }

    public static void printNumberInWord (int number) {
        
        switch (number) {
            case 0: {
            System.out.println("ZERO");
            break;}
            case 1: {
            System.out.println("ONE");
            break;}
            case 2: {
            System.out.println("TWO");
            break;}
            case 3: {
            System.out.println("THREE");
            break;}
            case 4: {
            System.out.println("FOUR");
            break;}
            case 5: {
            System.out.println("FIVE");
            break;}
            case 6: {
            System.out.println("SIX");
            break;}
            case 7: {
            System.out.println("SEVEN");
            break;}
            case 8: {
            System.out.println("EIGHT");
            break;}
            case 9: {
            System.out.println("NINE");
            break;}
            default: {
            System.out.println("OTHER");
            break;}
        }
    }
}

// Alternatively using enhanced switch  expression
// public class NumberInWord {

//     public static void printNumberInWord(int number) {

//         String numberInWord;
//         switch (number) {
//             case 0 -> numberInWord = "ZERO";
//             case 1 -> numberInWord = "ONE";
//             case 2 -> numberInWord = "TWO";
//             case 3 -> numberInWord = "THREE";
//             case 4 -> numberInWord = "FOUR";
//             case 5 -> numberInWord = "FIVE";
//             case 6 -> numberInWord = "SIX";
//             case 7 -> numberInWord = "SEVEN";
//             case 8 -> numberInWord = "EIGHT";
//             case 9 -> numberInWord = "NINE";
//             default -> numberInWord = "OTHER";
//         }
//         System.out.println(numberInWord);
//     }
// }
