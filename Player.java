import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name, double money)
    {
        this.name = name;
        this.money = money;
    }

    public void playTurn()
    {
        playerMoney();
        
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

    public double getMoney()
    {
        return money;
    }
    public String getName()
    {
        return name;
    }
    public void playerMoney(){ 
        System.out.println(name +" your total money is: $"+ money);
    }
}
