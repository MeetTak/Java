package Exercises;

import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double kilometersPerHour = scanner.nextDouble();

        printConversion(kilometersPerHour);
        
        scanner.close();
    }
    public static int toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            return (int) (kilometersPerHour * 0.621371);// bcoz of typecasting the value automaically gets rounded as the value first get calculated in double and then casts it to an int.
        }
    }

    public static void printConversion(double kilometersPerHour) {
        int milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mph.");
        }
    }
}

// Alternatively, correct solution as we only need to use two methods toMilesPerHour of type long and printConversion of type void

// public class SpeedConverter {
 
//     public static long toMilesPerHour(double kilometersPerHour) {
        
//         if (kilometersPerHour < 0) {
//             return -1;
//         }
//         return Math.round(kilometersPerHour / 1.609);
//     }
 
//     public static void printConversion(double kilometersPerHour) {
        
//         if (kilometersPerHour < 0) {
//             System.out.println("Invalid Value");
//             return;
//         }
//         long milesPerHour = toMilesPerHour(kilometersPerHour);
//         System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//     }
// }
