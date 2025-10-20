import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck()
    {
        String[] suits = new String[] {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] faces = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] values = new int[] {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for(String suit : suits) 
        {
            for(int i = 0; i < faces.length; i++)
            {
                this.cards.add(new Card(suit, faces[i], values[i]));
            }
        }

        this.shuffle();
    }

    public void shuffle()
    {
        ArrayList<Card> shuffled = new ArrayList<>();
        while(this.cards.size() > 0)
        {
            int randomIndex = (int) (Math.random() * this.cards.size());
            shuffled.add(this.cards.get(randomIndex));
            this.cards.remove(randomIndex);
        }
        this.cards = shuffled;
    }

    public Card getTopCard()
    {
        Card topCard = this.cards.get(0);
        this.cards.remove(0);
        return topCard;
    }

    public ArrayList<Card> getCards()
    {
        return this.cards;
    }
}
