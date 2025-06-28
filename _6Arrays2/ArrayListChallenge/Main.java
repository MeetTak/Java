package _6Arrays2.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();// this creates a new instance of the ArrayList with an initial capacity (default is 10).
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {// parseInt is a method in the Integer calss in Java that converts a String into an int.
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());// Comparator.naturalOrder(): This method returns a comparator that compares Comparable objects in their natural order.
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add item(s) [separate items by commas]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for (String i : items) {
            String trimmed = i.trim();// we are trimming leading and trailing whitespace from the string "i" and assigning the result to a new string variable trimmed.
            // String i = "   Hello, World!   ";
            // String trimmed = i.trim();
            // System.out.println(trimmed); // Output: "Hello, World!"
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [separate items by commas]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }// we are iterating over a collection of strings called items, trimming each string to remove leading and trailing whitespace, and then removing the trimmed string from another collection called "groceries".
    }

    private static void printActions() {

        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove item(s) from list (comma delimited list)
                
                Enter a number for which action you want to be:""";
        System.out.print(textBlock + " ");
    }
}

