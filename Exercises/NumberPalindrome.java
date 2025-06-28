package Exercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    public static boolean isPalindrome(int number) {
        
        int num = number;
        int rd = 0;
        int reverse = 0;
        do {
            rd = number % 10;
            reverse = reverse * 10 + rd;
            number = number / 10;
        } while (number != 0);
        System.out.println(num + " & " + reverse);
        return reverse == num;
    }  
}

// Alternatively
// public class NumberPalindrome {

//     public static boolean isPalindrome(int number) {

//         int reverse = 0;
//         int original = number;
//         while (original != 0) {
//             reverse = reverse * 10 + original % 10;
//             original /= 10;
//         }
//         return reverse == number;
//     }
// }
