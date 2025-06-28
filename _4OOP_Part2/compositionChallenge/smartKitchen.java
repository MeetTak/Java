package _4OOP_Part2.compositionChallenge;

public class smartKitchen {

    private CoffeeMaker brewMaster;// here CoffeeMaker is a data type
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    // Creating instances of Member Variables
    public smartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
        // Each of these lines creates a new instance of the respective class(CoffeMaker, DishWasher, and Refrigerator) and assigns it to the corresponding member variable of the smartKitchen class.
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);// passing the coffeeFlag boolean to the setHasWorkToDo method of the CoffeeMaker class.
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        dishWasher.doDishes();
        brewMaster.brewCoffee();// this line calls the brewCoffee method on the brewMaster ovject (an instance of the CoffeeMaker class). This likely initiates the process of brewing coffee.
        iceBox.orderFood();
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
