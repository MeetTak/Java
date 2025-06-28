package _4OOP_Part1.setMethod;

public class Main {

    public static void main(String[] args) {

        // Create a new instance of the Car class
        Car car = new Car();// difference between unintialised variable and variable with null reference,
                            // unintialised variable causes compile time error and the variable with null
                            // reference can be used in code without throwing an error during the
                            // compilation but will throw an exception at runtime.

        // Set the make, model, doors, convertible, and color of the car using setter methods
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        // Print the make and model of the car using getter methods
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        // Call the describeCar method of the car object to display additional information about the car
        car.describeCar();

        // Create another instance of the Car class
        Car targa = new Car();

        // Set the make, model, doors, convertible, and color of the targa using setter methods
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        // Call the describeCar method of the targa object to display additional information about the targa
        targa.describeCar();
    }
}
