import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String checkCard;
        boolean cardExist = false;

        ArrayList<Card> deckOfCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
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
                deckOfCards.add(new Card(suite, j));
            }
        }
        while (true) {
            cardExist = false;
            System.out.println("which card do you wanna check?");
            checkCard = sc.nextLine().toUpperCase();
            for (Card card : deckOfCards) {
                if (card.equals(new Card(checkCard.charAt(0), Integer.parseInt(checkCard.substring(1))))) {
                    cardExist = true;
                    break;

                }
            }
            if (cardExist) {
                System.out.println("Card exists!");
            } else {
                System.out.println("Card doesnt exists...");
            }
           Collections.sort(deckOfCards, Card.CompareCard);

            for(Card card: deckOfCards) {
                System.out.println(card.getSuite()+ "" + card.getValue());
            }

        }




    }
}