package Exercises;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a kiloBytes: ");
        int kiloBytes = scanner.nextInt();

        printMegaBytesAndKiloBytes(kiloBytes);

        scanner.close();

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + "MB + " + remainingKiloBytes + " KB"); 
    }
}

// Alternatively
// public class MegaBytesConverter {

//     public static void printMegaBytesAndKiloBytes(int kiloBytes) {

//         if (kiloBytes < 0) {
//             System.out.println("Invalid Value");
//             return;
//         }

//         int mb = kiloBytes / 1024;
//         int remainingKB = kiloBytes % 1024;
//         System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
//     }
// }