package _1Basics;

public class Hello2 {
    public static void main(String[] args) {
        System.out.print("Hello, Meet");

        boolean isAlien = true;
        if (isAlien == false)
            System.out.print("It is not an alien!");
            System.out.print("And I am scared of aliens"); // this line will get printed bcoz all subsequent lines are not considered to be part of the if-then statement.
            // to overcome this problem we use a code block check Hello3
    }
}
