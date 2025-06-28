package _2Expressions;

public class Main5 {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Challenges
        // boolean newGameOver = true;
        // int newScore = 10000;
        // int newLevelCompleted = 8;
        // int newBonus = 200;

        // int newFinalScore = newScore;

        // if (newGameOver == true) {
        //     newFinalScore += (newLevelCompleted * newBonus);
        //     System.out.println("Your final score was " + newFinalScore);
        // }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}

