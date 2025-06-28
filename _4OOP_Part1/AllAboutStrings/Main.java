package _4OOP_Part1.AllAboutStrings;

public class Main {

    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',3));// searching towards the end of the string
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',8));// searching towards the beginning of the string

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")){// the contentEquals method isn't limited to just comparing string object. It can be used to compare a string builder's value which equals method doesn't support.
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;// return in void method is used to exit the method prematurely before reaching the end of the body.
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
