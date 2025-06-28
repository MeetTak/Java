package Exercises;

public class BarkingDog {

    public static void main(String[] args) {
        // Example test call to shouldWakeUp method
        boolean wakeUp = shouldWakeUp(true, 2);
        System.out.println(wakeUp); // This should print true if the dog is barking at 2 AM

        // Add more test calls if needed
    }
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // if the dog is barking, and it's before 8am or after 10pm,
        // then you should wake up.
        return barking && (hourOfDay < 8 || hourOfDay > 22);

//         barking && (hourOfDay < 8 || hourOfDay > 22): This is a boolean expression that evaluates to true if both conditions are met:barking is true: This means the dog is currently barking.
// (hourOfDay < 8 || hourOfDay > 22): This means the current hour of the day is before 8 AM (hourOfDay < 8) or after 10 PM (hourOfDay > 22).

    }
}


