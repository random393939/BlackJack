public class Card
{
    private String suit;
    private String face;
    private int value;

    public Card(String suit, String face, int value)
    {
        this.suit = suit;
        this.face = face;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString()
    {
        return this.face + " of " + this.suit + "(" + this.value + ")";
    }
}
