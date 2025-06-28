package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] myArray;
        Scanner array = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int len = array.nextInt();
        myArray = getIntegers(len);
        printArray(myArray);
        myArray = sortIntegers(myArray);
        printArray(myArray);
    }

    public static int[] getIntegers(int len) {
        Scanner array = new Scanner(System.in);
        int[] newInt = new int[len];
        System.out.println("Enter " + len + " elements in the array: ");
        for (int i = 0; i < len; i++) {
            newInt[i] = array.nextInt();
        }

        return newInt;
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}

// Alternatively

//import java.util.Scanner;
//import java.util.Arrays;
//
//public class SortedArray {
//
//    public static int[] getIntegers(int capacity) {
//
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[capacity];
//        System.out.println("Enter " + capacity + " integer values:\r");
//        for (int i=0; i<array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    public static int[] sortIntegers(int[] array) {
//
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i=0; i<sortedArray.length-1; i++) {
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];                     // 1
//                    sortedArray[i] = sortedArray[i+1];         // 2
//                    sortedArray[i+1] = temp;                   // 3
//                    flag = true;                               // 4
//                }
//            }
//        }
//        return sortedArray;
//    }
//}