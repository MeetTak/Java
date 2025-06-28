package _11Collections._2CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public enum Suit { // enum is a special data type which used to define a fixed set of constants
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()]; // ordinal value is the pos'n of the enum const starting with 0.
            // Hearts: 0, Diamonds: 1, Clubs: 2 and Spades: 3; Ordinal Values
        }
    }

    @Override
    public String toString() {

        int index = face.equals("10") ? 2 : 1; // if face is 10, then index is 2, else 1
        String faceString = face.substring(0, index);
        // for example if face is 10, then faceString = 10.substring(0, 2) = 10.substring(0, 2) = 10; as charAt(0) = 1 and charAt(1) = 0 remember that index starts from 0 and ends just before 2.
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Card getNumericCard(Suit suit, int cardNumber) {

        if (cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2); // here we are subtracting 2 from the cardNumber as these ranks is used internally to compare cards.
        } // rank of 2 is 0, 3 is 1, 4 is 2, 5 is 3, 6 is 4, 7 is 5, 8 is 6, 9 is 7 and 10 is 8
        System.out.println("Invalid Numeric card selected");
        return null;
    }

    public static Card getFaceCard(Suit suit, char abbrev) { // abbrev is the abbreviation/representation of the face card

        int charIndex = "JQKA".indexOf(abbrev);
        if (charIndex > -1) {
            return new Card(suit, "" + abbrev, charIndex + 9);
        } // rank of J is 9, Q is 10, K is 11 and A is 12
        System.out.println("Invalid Face card selected");
        return null;
    }

    public static List<Card> getStandardDeck() {

        List<Card> deck = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(getNumericCard(suit, i));
            }
            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
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
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            // when i = 0, deck (0, 13) is printed, when i = 1, deck (13, 26) is printed, when i = 2, deck (26, 39) is printed and when i = 3, deck (39, 52) is printed.
            // subList method is used to get the sublist of the deck from startIndex to endIndex including the startIndex and excluding the endIndex.
            System.out.println();
        }
    }

}
