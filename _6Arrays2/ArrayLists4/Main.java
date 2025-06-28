package _6Arrays2.ArrayLists4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        // originalList.remove(0);// This line throws UnsupportedOperationException
        // originalList.add("fourth");// will get the same error as above

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        System.out.println("array: " + Arrays.toString(originalArray));

    }
}
