package _4OOP_Part1.getMethod;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        // car.make = "Porsche";
        // car.model = "Carrera";
        // car.color = "Red";
        // System.out.println("make = " + car.make);// ERROR MESSAGE: the field car.make is not visible bcoz we setted it to private firstly in Car.java
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
