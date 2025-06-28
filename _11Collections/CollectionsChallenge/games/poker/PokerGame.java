package _11Collections.CollectionsChallenge.games.poker;

import _11Collections.CollectionsChallenge.Card;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;

public class PokerGame {
    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        this.pokerHands = new ArrayList(cardsInHand);
    }

    public void startPlay() {
        Collections.shuffle(this.deck);
        Card.printDeck(this.deck);
        int randomMiddle = (new Random()).nextInt(15, 35);
        Collections.rotate(this.deck, randomMiddle);
        Card.printDeck(this.deck);
        this.deal();
        System.out.println("---------------------------");
        Consumer<PokerHand> checkHand = PokerHand::evalHand;
        List var10000 = this.pokerHands;
        PrintStream var10002 = System.out;
        Objects.requireNonNull(var10002);
        var10000.forEach(checkHand.andThen(var10002::println));
        int cardsDealt = this.playerCount * this.cardsInHand;
        int cardsRemaining = this.deck.size() - cardsDealt;
        this.remainingCards = new ArrayList(Collections.nCopies(cardsRemaining, (Object)null));
        this.remainingCards.replaceAll((c) -> {
            return (Card)this.deck.get(cardsDealt + this.remainingCards.indexOf(c));
        });
        Card.printDeck(this.remainingCards, "Remaining Cards", 2);
    }

    private void deal() {
        Card[][] hands = new Card[this.playerCount][this.cardsInHand];
        int playerNo = 0;

        int j;
        for(int i = 0; i < this.cardsInHand; ++i) {
            for(j = 0; j < this.playerCount; ++j) {
                hands[j][i] = (Card)this.deck.get(playerNo++);
            }
        }

        playerNo = 1;
        Card[][] var7 = hands;
        j = hands.length;

        for(int var5 = 0; var5 < j; ++var5) {
            Card[] hand = var7[var5];
            this.pokerHands.add(new PokerHand(playerNo++, Arrays.asList(hand)));
        }

    }
}