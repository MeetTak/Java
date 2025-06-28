package Exercises;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(300);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <=9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else {
                System.out.println(year + " is not a leap year");
                return false;
            }
        }
        else if (year <=1 || year >=9999) {
            System.out.println(year + " is not in range.");
            return false;
        }
        else {
            return true;
        }
    }
}

// Alternatively
// public class LeapYear {

//     public static boolean isLeapYear(int year) {

//         // if year is less than 1 or greater than 9_999, it's invalid,
//         // so return false
//         if (year < 1 || year > 9_999) {
//             return false;
//         }

//         if (year % 4 == 0) { // if year is divisible by 4, go to next step.
//             if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
//                 return true;
//             } else { // if year was divisible by 100, let's check if it's divisible by 400.
//                 if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
//                     return true;
//                 } else { // otherwise, it's not a leap year, so return false.
//                     return false;
//                 }
//             }
//         } else { // year is not divisible by 4, so it's not a leap year.
//             return false;
//         }
//     }
// }
