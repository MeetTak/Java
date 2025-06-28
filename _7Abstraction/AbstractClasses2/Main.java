package _7Abstraction.AbstractClasses2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100); // Animal is abstract, cannot be instantiated directly

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise(); // will print Howling!
        doAnimalStuff(dog); // will print Howling! and Wolf walking

        ArrayList<Animal> animals = new ArrayList<>(); 
        animals.add(dog); // will print Howling! and Wolf walking
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for (Animal animal : animals) { // will first print Howling! and Wolf walking
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }
}
