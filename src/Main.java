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
                deckOfCards.add(new Card(suite, j));
            }

        }
//        while (true) {
//            cardExist = false;
//            System.out.println("which card do you wanna check?");
//            checkCard = sc.nextLine().toUpperCase();
//
//            for (Card card : deckOfCards) {
//                if (card.equals(new Card(checkCard.substring(0,1), Integer.parseInt(checkCard.substring(1))))) {
//                    cardExist = true;
//                    break;
//
//                }
//            }
//            if (cardExist) {
//                System.out.println("Card exists!");
//            } else {
//                System.out.println("Card doesnt exists...");
//            }
//           Collections.sort(deckOfCards, Card.CompareCard);
//
//        }




    }
}
