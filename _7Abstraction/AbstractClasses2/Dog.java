package _7Abstraction.AbstractClasses2;

public class Dog extends Animal {
    
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
    
    @Override
    public void move(String speed) {
        
        if (speed.equals("slow")) { // the equals() checks for value equality, meaning it checks if the values of the strings are the same.
            System.out.println(type + " walking");
        } else {
            System.out.println(type + " running");
        }
    }
    
    @Override
    public void makeNoise() { // the == operator checks for reference equality, meaning it checks if both references point to the same object in memorey.
        
        if (type == "Wolf") {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}