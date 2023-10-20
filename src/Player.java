import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private int numbersOfTricks;

    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
        this.numbersOfTricks = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbersOfTricks() {
        return numbersOfTricks;
    }

    public void setNumbersOfTricks(int numbersOfTricks) {
        this.numbersOfTricks = numbersOfTricks;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    static public Player createPlayer() {
        String name;
        System.out.println("Please enter your name.");
        name = sc.nextLine();
        return new Player(name);
    }

}
