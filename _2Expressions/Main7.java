package _2Expressions;

public class Main7 {
    public static void main(String[] args) {
        
        // variables below which are commented are not being used
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        calculateScore(true, 800, 5, 100);

        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;
        
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
