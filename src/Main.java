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

        Game game = new Game();
        game.dealCardsToPlayers();

        for (Player player : game.getPlayers()) {
            for( Card card : player.getHand()) {
                System.out.println(card.getSuite() + "" + card.getValue());
            }
            System.out.println();
        }

        //Computer computer = new Computer();
//        for(Player player: game.getPlayers()) {
//            System.out.println(player.getName());
//        }



//        for(Card card : game.getDeckofCards()) {
//            System.out.println(card.getSuite() + "" + card.getValue());
//
//        }
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
