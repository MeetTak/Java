package Exercises.SimpleCalculator_OOP;

public class Main {
    
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult());
    }
    // The errors in the provided Java code snippet are due to attempting to execute statements directly in the class body outside of any method, constructor, or static initializer block. Java does not allow this. All statements that are not declarations must be contained within a method, a constructor, or a static initialization block.
    
    // SimpleCalculator calculator = new SimpleCalculator();

    // calculator.setFirstNumber(5.0);
    // calculator.setSecondNumber(4);
    // System.out.println("add= " + calculator.getAdditionResult());
    // System.out.println("subtract= " + calculator.getSubtractionResult());
    // calculator.setFirstNumber(5.25);
    // calculator.setSecondNumber(0);
    // System.out.println("multiply= " + calculator.getMultiplicationResult());
    // System.out.println("divide= " + calculator.getDivisionResult());

}
