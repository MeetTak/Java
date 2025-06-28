package _4OOP_Part1.getMethod;

public class Car {
// The public keyword makes the class accessible from other classes, packages,
// or modules. This means that other classes can create instances of the Main
// class or call its static methods if they are public as well.

    // Declaration of fields
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Declaration of methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // Declaring another method describeCar
    // how can i say that its a method not a field?
    // The purpose of describeCar() is to perform an action, specifically to print
    // out a description of the car to the console. This aligns with the role of
    // methods in Java, which is to define behavior. Fields, in contrast, are used
    // to store data or state and do not define behavior.
    public void describeCar() {
    // this method takes no parameters, as indicated by the empty parenthesis (). This means that the method solely operates on the instance variables (fields) of the class or other global information accessible within the method.
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
