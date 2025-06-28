package _2Expressions;

public class challenge{
    public static void main(String[] args) {
        
        // all the variables below are not being used
        // String playerName; 
        // int playerPosition;
        // int playerScore;

        displayHighScorePosition("Tim", 2);
        calculateHighScorePosition(7);
    }
    
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        if (playerPosition == 2) {
            System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
        }
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else { //java knows that the else statement is the catch of all the problems it will gonna return something so bcoz of that java is not showing any kind of error here
            return 4;
        }
    }
}