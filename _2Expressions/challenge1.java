package _2Expressions;

public class challenge1 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get into the position " + highScorePosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500){ // && playerScore < 1000) you can include this condition as well but it will affect the readability of the code 
            return 2;
        }
        else if (playerScore >= 100){ // && playerScore < 500) same reason as above
            return 3;
        }
        // else { 
        //     return 4; insted of these 3 statements you can simply write the return statement
        // }
        return 4;

        // Alternatively you could have done this,
        // int position = 4;
        // if (playerScore >= 1000) {
        //     position = 1;
        // }
        // else if (playerScore >= 500) {
        //     position = 2;
        // }
        // else if (playerScore >= 100) {
        //     position = 3;
        // }
        // return position;
    }
}
