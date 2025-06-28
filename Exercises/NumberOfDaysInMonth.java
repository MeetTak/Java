package Exercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        getDaysInMonth(2, 2020);
        isLeapYear(300);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else {
                System.out.println(year + " is not a leap year");
                return false;
            }
        } else if (year <= 1 || year >= 9999) {
            System.out.println(year + " is not in range.");
            return false;
        } else {
            return true;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    System.out.println("January");
                    return 31;
                case 2: {
                    // if (isLeapYear(year)) {
                    //     System.out.println("February");
                    //     return 29;
                    // } else {
                    //     System.out.println("February");
                    //     return 28;
                    System.out.println("February");
                    return isLeapYear(year) ? 29 : 28; //ternary operator
                    }
                case 3:
                    System.out.println("March");
                    return 31;
                case 4:
                    System.out.println("April");
                    return 30;
                case 5:
                    System.out.println("May");
                    return 31;
                case 6:
                    System.out.println("June");
                    return 30;
                case 7:
                    System.out.println("July");
                    return 31;
                case 8:
                    System.out.println("August");
                    return 31;
                case 9:
                    System.out.println("September");
                    return 30;
                case 10:
                    System.out.println("October");
                    return 31;
                case 11:
                    System.out.println("November");
                    return 30;
                case 12:
                    System.out.println("December");
                    return 31;
                default:
                    return -1;
            }
        }
    }
}
// Alternatively
// public class NumberOfDaysInMonth {

//     public static int getDaysInMonth(int month, int year) {

//         if (year < 1 || year > 9_999) {
//             return -1;
//         }

//         return switch (month) {
//             case 1, 3, 5, 7, 8, 10, 12 -> 31; // for any of the following months, return 31
//             case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return
//                                                   // either 28 or 29.
//             case 4, 6, 9, 11 -> 30; // return 30 for the following months
//             default -> -1; // return -1 if the month parameter is not between 1 and 12.
//         };
//     }

//     public static boolean isLeapYear(int year) {

//         if (year < 1 || year > 9_999) {
//             return false;
//         }

//         if (year % 4 == 0) {
//             if (year % 100 != 0) {
//                 return true;
//             } else {
//                 if (year % 400 == 0) {
//                     return true;
//                 } else {
//                     return false;
//                 }
//             }
//         } else {
//             return false;
//         }
//     }
// }
