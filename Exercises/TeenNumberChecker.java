package Exercises;

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(1, 2, 13);
        isTeen(14);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19);
    }
     public static boolean isTeen(int d) {
        return (d >= 13 && d <=19);
     }
}

// Alternatively we could have called the second method in the first one
// public class TeenNumberChecker {

//     public static boolean hasTeen(int a, int b, int c) {
//         return isTeen(a) || isTeen(b) || isTeen(c);
//     }

//     public static boolean isTeen(int number) {
//         return number > 12 && number < 20;
//     }
// }
