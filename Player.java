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
        playerBet();
        getHand(deck);
        
    }

    public void hit()
    {
        
    
    }

    public int getHandValue(Deck deck)
    {
        return 1;
    }

    public ArrayList<Card> getHand(Deck deck){
        hand.add();
        return hand;
    }
    public void returnDeck(ArrayList<Card> hand){
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
    public void playerBet(){
        boolean player_bet_amount=true;
        while(player_bet_amount){
            Scanner integScanner2 = new Scanner(System.in); 
            System.out.println("Enter bet amount");
            Integer bet_amount = integScanner2.nextInt();
            while(0 >= bet_amount || bet_amount > money){
                System.out.println("Enter a valid bet amount");
                bet_amount = integScanner2.nextInt();

            }
            money = money - bet_amount;
            System.out.println("you have: $ "+money+" left");
            integScanner2.nextLine();
            player_bet_amount=false;
        }
    }
}
