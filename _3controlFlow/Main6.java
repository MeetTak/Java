package _3controlFlow;

public class Main6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (true) {// if we do not included the if statement in the while loop it would have been a infinite loop. 
            if  (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}
