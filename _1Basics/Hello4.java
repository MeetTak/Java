package _1Basics;

public class Hello4 {
    public static void main(String[] args) {
        System.out.print("Hello, Meet");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.print("It is not an alien!");
            System.out.print("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore != 100){ // u can try it with different kinds of operators like >=, <=, ==, <, >
            System.out.print("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar == true){ // instead of this u can also simplfy the statement with "if (isCar)"
                            // for  "if (isCar != true)" we can simplfy this to "if (!isCar)"
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true; // simple way to write this statement is boolean isDomestic = (makeOfCar != "Volkswagen");
                                                                         // this is a ternary operator
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic"; // another example of ternary operator

        System.out.println(s);
    }
}
