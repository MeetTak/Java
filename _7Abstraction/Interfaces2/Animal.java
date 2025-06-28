package _7Abstraction.Interfaces2;

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371; // here KM_TO_MILES is a constant

    void takeOff();
    void land();
    void fly();
}

interface Trackable {

    void  track();
}

public abstract class Animal {

    public abstract void move();
}
