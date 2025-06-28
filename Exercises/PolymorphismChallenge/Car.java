package Exercises.PolymorphismChallenge;

import java.nio.charset.StandardCharsets;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> startAccelerating";
    }

    public String brake() {
        return "Car -> startBreaking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> startAccelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> startBreaking";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> startAccelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> startBraking";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> startAccelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> startBreaking";
    }
}
