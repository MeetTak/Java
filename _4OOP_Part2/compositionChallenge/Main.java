package _4OOP_Part2.compositionChallenge;

public class Main {

    public static void main(String[] args) {

        smartKitchen kitchen = new smartKitchen();

//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
