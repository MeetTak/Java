package _5Arrays.MinimumElementChallenge;

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         int[] myArrays = readInteger(5);
//         System.out.println("The minimum element in the array is: " + findMin(myArrays));
//     }

//     public static int[] readInteger(int count) {
//         int[] arr = new int[count];
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter " + count + " numbers: ");
//         for(int i = 0; i < count; i++ ) {
//             arr[i] = scanner.nextInt();
//         }
//         return arr;
//     }

//     public static int findMin(int[] array) {
//         int min = array[0];
//         int[] minArr = new int[1];
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] < min) {
//                 min = array[i];
//                 minArr[0] = min;
//             }
//         }
//         return min;
//     }
// }

// Alternatively
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }
}
