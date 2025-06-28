package _4OOP_Part1.StringFormatting;

public class Main {

    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List
                        \u2022 First Point
                            \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float)age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
            // %d is the format specifier for a decimal integer.
            // 6 specifies the minimum width of the output. If the number has fewer digits than this width, the output will be padded with spaces on the left to meet this minimum width.
            // if the number has more digits, the width will be expanded to accommodate the number without truncation.
        }

        String formattedString = String.format("Your age is %d", age); // the line creates a formatted string where %d is replaced by the value of age, and then prints the formatted string.
        System.out.println(formattedString);

        formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
    }
}
