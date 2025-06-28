package _11Collections.CollectionsChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB,
        DIAMOND,
        HEART,
        SPADE;

        private Suit() {
        }

        public char getImage() {
            return (new char[]{'\u2663', '\u2666', '\u2665', '\u2660'})[this.ordinal()];
        }
    }

    public Card(Suit suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }

    public static Comparator<Card> sortRankReversedSuit() {
        return Comparator.comparing(Card::rank).reversed().thenComparing(Card::suit);
    }

    public String toString() {
        int index = this.face.equals("10") ? 2 : 1;
        String faceString = this.face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, this.suit.getImage(), this.rank);
    }

    public static Card getNumericCard(Suit suit, int cardNumber) {
        if (cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);
        } else {
            System.out.println("Invalid Numeric card selected");
            return null;
        }
    }

    public static Card getFaceCard(Suit suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);
        if (charIndex > -1) {
            return new Card(suit, "" + abbrev, charIndex + 9);
        } else {
            System.out.println("Invalid Face card selected");
            return null;
        }
    }

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList(52);
        Suit[] var1 = _11Collections.CollectionsChallenge.Card.Suit.values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Suit suit = var1[var3];

            for(int i = 2; i <= 10; ++i) {
                deck.add(getNumericCard(suit, i));
            }

            char[] var9 = new char[]{'J', 'Q', 'K', 'A'};
            int var6 = var9.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                char c = var9[var7];
                deck.add(getFaceCard(suit, c));
            }
        }

        return deck;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("---------------------------");
        if (description != null) {
            System.out.println(description);
        }

        int cardsInRow = deck.size() / rows;

        for(int i = 0; i < rows; ++i) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach((c) -> {
                System.out.print("" + c + " ");
            });
            System.out.println();
        }

    }

    public Suit suit() {
        return this.suit;
    }

    public String face() {
        return this.face;
    }

    public int rank() {
        return this.rank;
    }
}
