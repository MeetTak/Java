package _4OOP_Part1.inheritance;

public class Animal {
    
    private String type;// we are decalring a private instance variable; it's basically field declaration within a class, used to specify attributes of objects of that class.
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {// this is a constructor with three parameters; a constructor is a special method used to intialize new objects.
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    // The this keyword is used to distinguish between the instance variables and the parameters of the constructor, as they have the same names. The values of the parameters are assigned to the instance variables, setting the state of the new Animal object.
    // the constructor allows for the creation of Animal objects with specified type, size and weight properties.

    // The toString() method is overridden in the Animal class to provide a custom string representation of an Animal object.
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
    // in the following lines we gonna be declaring the common things of the animals that most of them have
    public void move(String speed) {// this is a method
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
