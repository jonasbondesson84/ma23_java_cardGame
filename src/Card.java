import java.util.Objects;

public class Card {
    private char suite;
    private String value;

    public Card(char suite, String value) {
        this.suite = suite;
        this.value = value;
    }

    public char getSuite() {
        return suite;
    }

    public void setSuite(char suite) {
        this.suite = suite;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suite == card.suite && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suite, value);
    }
}
