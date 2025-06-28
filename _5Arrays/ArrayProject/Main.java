package _5Arrays.ArrayProject;

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
        System.out.println("Last element = " + firstTen[arrayLength - 1]); // elements starts from index 0

        int[] newArray;
//        newArray = {5, 4, 3, 2, 1};// will throw an compiler error bcoz the array is not initialized
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
