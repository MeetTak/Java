package _2Expressions;

public class Main8 {
    public static void main(String[] args) {
        
        // variables below which are commented are not being used
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);

        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;

        System.out.println("The new highScore is " + calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
