package _5Arrays.MultipleArrays2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {// outer is the iteration variable and is declared as an int[], which means that in each iteration of the loop, outer will hold a reference to one of the inner arays(rows) of array2.
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            // System.out.println();
        }

        // for (var outer : array2) {
        // for (var element : outer) {
        // System.out.print(element + " ");
        // }
        // System.out.println();
        // }

        System.out.println(Arrays.deepToString(array2));// will produce a string that reperesents the entire structure and contents of the array2.

        array2[1] = new int[] { 10, 20, 30 };
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] { "a", "b", "c" };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {
                { "1", "2" },
                { "3", "4", "5" },
                { "6", "7", "8", "9" }
        };
        System.out.println(Arrays.deepToString(anyArray));

        // anyArray[2] = new int[2][2][2];
        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());// element.getClass().getsimpleName() in Java is used to obtain the simple name of the class referenced by element.
            System.out.println("Element toString() = " + element);// prints the string representation of the element object.
            System.out.println(Arrays.deepToString((Object[]) element));// prints a comprehensive string representation of a multi-dimensional array to the console.
        }
    }
}
