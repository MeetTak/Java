package _5Arrays.ArrayProject2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
//        System.out.println("Last element = " + firstTen[arrayLength]);// will throw an exception because the index is out of bounds
        System.out.println("Last element = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = {5, 4, 3, 2, 1};// will throw an compiler error bcoz the array is not initialized
//        newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(newArray); // will get output as [I@13969fbe, this is the hashcode of the array object in memory
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) { // here the instanceof operator checks if objectVariable is an array of integers. Instance operator is used to test whether an object is an instance of a specific class or interface. It returns true if the object is an instance of the specified type and false otherwise.
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray [2] = newArray;
    }
}
