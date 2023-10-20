import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int numbersOfTricks;

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

    public void createPlayer() {
        String name;
        System.out.println("Please enter your name.");
        name = sc.nextLine();
        Player player = new Player(name);
    }

}
