package _11Collections.CollectionsChallenge.games.poker;

import _11Collections.CollectionsChallenge.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PokerHand {
    private List<Card> hand;
    private List<Card> keepers;
    private List<Card> discards;
    private Ranking score;
    private int playerNo;

    public PokerHand(int playerNo, List<Card> hand) {
        this.score = Ranking.NONE;
        hand.sort(Card.sortRankReversedSuit());
        this.hand = hand;
        this.playerNo = playerNo;
        this.keepers = new ArrayList(hand.size());
        this.discards = new ArrayList(hand.size());
    }

    public String toString() {
        return "%d. %-16s Rank:%d %-40s Best:%-7s Worst:%-6s %s".formatted(this.playerNo, this.score, this.score.ordinal(), this.hand, Collections.max(this.hand, Comparator.comparing(Card::rank)), Collections.min(this.hand, Comparator.comparing(Card::rank)), this.discards.size() > 0 ? "Discards:" + this.discards : "");
    }

    private void setRank(int faceCount) {
        switch (faceCount) {
            case 2:
                if (this.score == Ranking.NONE) {
                    this.score = Ranking.ONE_PAIR;
                } else if (this.score == Ranking.THREE_OF_A_KIND) {
                    this.score = Ranking.FULL_HOUSE;
                } else {
                    this.score = Ranking.TWO_PAIR;
                }
                break;
            case 3:
                if (this.score == Ranking.NONE) {
                    this.score = Ranking.THREE_OF_A_KIND;
                } else {
                    this.score = Ranking.FULL_HOUSE;
                }
                break;
            case 4:
                this.score = Ranking.FOUR_OF_A_KIND;
        }

    }

    public void evalHand() {
        List<String> faceList = new ArrayList(this.hand.size());
        this.hand.forEach((card) -> {
            faceList.add(card.face());
        });
        List<String> duplicateFaceCards = new ArrayList();
        faceList.forEach((face) -> {
            if (!duplicateFaceCards.contains(face) && Collections.frequency(faceList, face) > 1) {
                duplicateFaceCards.add(face);
            }

        });
        Iterator var3 = duplicateFaceCards.iterator();

        while(var3.hasNext()) {
            String duplicate = (String)var3.next();
            int start = faceList.indexOf(duplicate);
            int last = faceList.lastIndexOf(duplicate);
            this.setRank(last - start + 1);
            List<Card> sub = this.hand.subList(start, last + 1);
            this.keepers.addAll(sub);
        }

        this.pickDiscards();
    }

    private void pickDiscards() {
        List<Card> temp = new ArrayList(this.hand);
        temp.removeAll(this.keepers);
        int rankedCards = this.keepers.size();
        Collections.reverse(temp);
        int index = 0;
        Iterator var4 = temp.iterator();

        while(true) {
            while(var4.hasNext()) {
                Card c = (Card)var4.next();
                if (index++ < 3 && (rankedCards > 2 || c.rank() < 9)) {
                    this.discards.add(c);
                } else {
                    this.keepers.add(c);
                }
            }

            return;
        }
    }
}
