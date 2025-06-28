package _4OOP_Part1.setMethod;

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

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

//     This Java method, setMake, is designed to set the make of a car based on the input string make. Here's a step-by-step explanation:
// 1. Check for null Input: It first checks if the input make is null. If it is, it sets make to "Unknown" to avoid processing a null value.
// 2. Convert to Lowercase: It converts the input make to lowercase. This is likely done to make the comparison case-insensitive, ensuring that "Tesla", "tesla", or "TESLA" are treated the same.
// 3. Switch Statement: It uses a switch statement on the lowercase version of make to handle specific car makes:
// • If make is "holden", "porsche", or "tesla", it sets the instance variable this. make to the original input make. This means these makes are supported.
// • For any other value of make, it sets this.make to "Unsupported". This indicates that only certain car makes are supported, and anything else is considered unsupported.
// 4. Setting the Car Make: Depending on the input, this method either sets the car's make to the input value (if it's one of the supported makes), to "Unsupported" if it's not a supported make, or to "Unknown" if the input was null.
    public void setMake(String make) {

        if (make == null)
            make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
