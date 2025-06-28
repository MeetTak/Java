package _7Abstraction.Interfaces;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird(); // This creates a new instance of the Bird class and assigns it to the variable bird.
        Animal animal = bird; // Since Bird extends Animal, the bird instance can be assigned to a variable of type Animal.
        FlightEnabled flier = bird; // Since Bird implements the FlightEnabled interface, the bird instance can be assigned to a variable of type FlightEnabled.
        Trackable tracked = bird; // Since Bird also implements the Trackable interface, the bird instance can be assigned to a variable of type Trackable.

        animal.move();
        // flier.move(); // they do not have a move method on them because of that they will cause a compile error.
        // tracked.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
