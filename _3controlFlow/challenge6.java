package _3controlFlow;

public class challenge6 {
    public static void main(String[] args) {
        isEvenNumber(5);
    }

    public static boolean isEvenNumber(int number) {
        
        while (number <= 20) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;// if i do not include number++ statement in my code it would have been an infinite loop as it would have always been true for the condition
        }
        return true;
    }
}
