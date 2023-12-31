import java.util.Comparator;
import java.util.Objects;

public class Card {
    private String suite;
    private int value;

    public Card(String suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Comparator<Card> CompareCard = new Comparator<Card>() {

        @Override
        public int compare(Card o1, Card o2) {
            int card1 = o1.getValue();
            int card2 = o2.getValue();

            return card1 - card2;
        }



    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suite.equals(card.suite) && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suite, value);
    }
}
