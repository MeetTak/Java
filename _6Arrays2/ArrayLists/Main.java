package _6Arrays2.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {// this is a constructor; a constructor is called when an instance of a class is created.
        this(name, "DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();// angle bracket is called the diamond operator.
        groceryList.add(new GroceryItem("Butter"));
    }
}
