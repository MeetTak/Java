package _7Abstraction.AbstractClasses;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) { // by intializing them in the constructor, you ensure that every Animal ovject has a defined type, size, and weight when it is created.
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed); // we are declaring the abstract method inside a abstract class
    public abstract void makeNoise();
}
