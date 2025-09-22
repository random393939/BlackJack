import java.util.ArrayList;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name, double money)
    {
        this.name = name;
        this.money = 100;
    }

    public void playTurn()
    {
        //System.out.print("Your hand is:"+ String.);
    }

    public void hit()
    {
        //do stuff
    
    }

    public int getHandValue()
    {
        //do stuff
        return 1;
    }

    public void getCard(Deck deck)
    {
        //do stuff
    }
}