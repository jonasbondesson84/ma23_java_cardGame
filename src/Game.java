import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private ArrayList<Card> deckofCards = new ArrayList<>();

    public Game() {
        for (int i = 0; i < 4; i++) {
            String suite = "";
            switch (i) {
                case 0 -> {
                    suite = "♦";
                }
                case 1 -> {
                    suite = "♥";
                }
                case 2 -> {
                    suite = "♣";
                }
                case 3 -> {
                    suite = "♠";
                }
            }
            for (int j = 2; j <= 14; j++) {
                this.deckofCards.add(new Card(suite, j));
            }
        }
        Collections.shuffle(this.deckofCards);
    }

    public ArrayList<Card> getDeckofCards() {
        return deckofCards;
    }

    public void setDeckofCards(ArrayList<Card> deckofCards) {
        this.deckofCards = deckofCards;
    }
}
