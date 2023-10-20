import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private ArrayList<Card> deckofCards = new ArrayList<>();

    private ArrayList<Player> players = new ArrayList<>();

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
        this.players.add(new Player("Computer"));
        this.players.add(Player.createPlayer());
    }

    public ArrayList<Card> getDeckofCards() {
        return deckofCards;
    }

    public void setDeckofCards(ArrayList<Card> deckofCards) {
        this.deckofCards = deckofCards;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void dealCardsToPlayers() {
        for (Player player : players) {
            for(int i = 0; i < 5; i++) {
                player.getHand().add(deckofCards.get(i));
                deckofCards.remove(deckofCards.get(i));
            }
        }
        sortPlayersHands();
    }

    public void sortPlayersHands() {
        for (Player player : players) {
            player.getHand().sort(Card.CompareCard);
        }
    }
}
