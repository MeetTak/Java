package _2Expressions;

public class Main1 {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" + " another" + " still more.");
        
        // variables below which are commented are not being used
        // int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);
        // int anotherVariable=50;myVariable--;System.out.println("myVariable =
        // "+myVariable); same as above

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
