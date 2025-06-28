package _4OOP_Part1.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();// is calling the makeNoise() method on an object named animal which is basically an instance of the Animal class.
        animal.move(speed);// is calling the move(String speed) method on an object named animal which is basically an instance of the Animal class.
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
