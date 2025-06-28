package _1Basics;

public class challenge {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValueTotal);
        double theRemainder = myValueTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
