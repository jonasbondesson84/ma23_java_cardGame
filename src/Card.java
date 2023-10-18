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
    
}
