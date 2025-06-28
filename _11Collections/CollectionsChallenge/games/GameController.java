package _11Collections.CollectionsChallenge.games;

import _11Collections.CollectionsChallenge.games.poker.PokerGame;

public class GameController {
    public GameController() {
    }

    public static void main(String[] args) {
        PokerGame fiveCardDraw = new PokerGame(8, 5);
        fiveCardDraw.startPlay();
    }
}
