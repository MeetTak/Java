package _1Basics;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Hello, Meet");

        boolean isAlien = false;
        if (isAlien == false) // by putting the semiclon at the end of this line means that we are ending this particular line of code bcoz which problems arises as if the conditions are set to be true then too we will get the statement printed the "It is not an alien!" bcoz we have already ended the line of code with semicolon, so thereby we should not use the semicolon at the end of the if statement
            System.out.print("It is not an alien!");
    }
}
