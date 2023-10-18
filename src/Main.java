import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Card> deckOfCards = new ArrayList<>();
        for( int i = 0; i < 4; i++) {
            char suite = ' ';
            switch (i) {
                case 0 -> {
                    suite = 'D';
                }
                case 1 -> {
                    suite = 'H';
                }
                case 2 -> {
                    suite = 'C';
                }
                case 3 -> {
                    suite = 'S';
                }
            }
            for (int j = 2; j <= 14; j++) {
                deckOfCards.add(new Card(suite, String.valueOf(j)));
            }
        }
        System.out.println(deckOfCards.get(0).equals(new Card('D', "2")));
    }
}