package Exercises.carpetCostCalculator_OOP;

public class Main {
    public static void main(String[] args) {
        // First calculation
        Carpet carpet1 = new Carpet(3.5);
        Floor floor1 = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor1, carpet1);
        System.out.println("Total cost for first floor: " + calculator1.getTotalCost());

        // Second calculation
        Carpet carpet2 = new Carpet(1.5);
        Floor floor2 = new Floor(5.4, 4.5);
        Calculator calculator2 = new Calculator(floor2, carpet2);
        System.out.println("Total cost for second floor: " + calculator2.getTotalCost());
    }
}

