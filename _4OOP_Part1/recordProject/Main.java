package _4OOP_Part1.recordProject;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "John";
                        case 3 -> "Peter";
                        case 4 -> "Sarah";
                        case 5 -> "Kevin";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
