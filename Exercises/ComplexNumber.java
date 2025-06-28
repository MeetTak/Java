package Exercises;

public class ComplexNumber {

    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real; // this.real = 2.0 real = 2.5 for the first time
        this.imaginary -= imaginary; // this.imaginary = 2.0 imaginary = -1.5 for the first time
    }

    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }

    public static void main(String[] args) {

        // we will be performing 3 calculations here
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}

