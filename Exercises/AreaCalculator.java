package Exercises;

public class AreaCalculator {
    public static void main(String[] args) {
        area(2);
        area(2, 3);
        // we can have two different methods with the same name
    }

    public static double area(double radius) {
        // if (radius < 0) {
        //     return -1.0;
        // } else {
        //     return radius * radius * Math.PI;
        // }
        return radius < 0 ? -1 : radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        return x < 0 || y < 0 ? -1 : x * y;
    }
}

// Alternatively
// public class AreaCalculator {

//     private static final int INVALID_VALUE = -1; // defines a class-level
// constant named INVALID_VALUE that is only accessible within its class and has
// a value of -1, typically used to signify an invalid or error condition.

//     public static double area(double radius) {

//         if (radius < 0) {
//             return INVALID_VALUE;
//         }
//         return radius * radius * Math.PI;
//     }

//     public static double area(double x, double y) {

//         if (x < 0 || y < 0) {
//             return INVALID_VALUE;
//         }
//         return x * y;
//     }
// }