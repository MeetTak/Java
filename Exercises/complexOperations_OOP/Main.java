package Exercises.complexOperations_OOP;

public class Main {
    public static void main(String[] args) {
        // Creating complex numbers
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        // Adding another complex number to 'one'
        one.add(new ComplexNumber(1, 1));
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        // Subtracting 'number' from 'one'
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        // Subtracting 'one' from 'number'
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
