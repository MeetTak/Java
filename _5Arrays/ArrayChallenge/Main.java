package _5Arrays.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] myArray = getRandomArray(10);
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        reverseArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private static int[] reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return array;
    }
}
