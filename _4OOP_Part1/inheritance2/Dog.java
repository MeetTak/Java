package _4OOP_Part1.inheritance2;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {// used constructor chaining to define the values of earShape and tailShape
        // meant to say that this constructor defines the values of earShape and
        // tailShape as "Perky" and "Curled", respectively, by delegating to the second
        // constructor with these values.
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        // this method does nothing
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
