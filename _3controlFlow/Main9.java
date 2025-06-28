package _3controlFlow;

public class Main9 {
    public static void main(String[] args) {
        int currentYear = 2022;
        String userDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(userDateOfBirth); // we are taking the string userDateOfBirth and converting it from string to an integer using Integer.parseInt and assigning it to dateOfBirth.

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);
    }
}
