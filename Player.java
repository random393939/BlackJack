import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private int betAmount;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name, double money)
    {
        this.name = name;
        this.money = money;
    }

    public void playTurn(Deck deck)
    {
        playerMoney();
        playerBet();
        getHand(deck);
        for (Card card : hand) 
        {
            System.out.println(card);
        }
        Scanner scanner = new Scanner(System.in);
        boolean turnOver = false;
        while (!turnOver) {
            System.out.println("Hit or Stay?");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("hit")) {
                getCard(deck);
                System.out.println("Your hand:");
                for (Card card : hand) {
                    System.out.println(card);
                }
                if (getHandValue() > 21) {
                    System.out.println("Bust!");
                    turnOver = true;
                }
            } else if (choice.equals("stay")) {
                turnOver = true;
            }
        }
    }

    public void hit()
    {
    }

    public int getHandValue() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }

    public ArrayList<Card> getHand(Deck deck){
        hand.add(deck.getTopCard());
        return hand;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }


    public void returnDeck(ArrayList<Card> hand){
    }

    public void getCard(Deck deck)
    {
        hand.add(deck.getTopCard());
    }

    public double getMoney()
    {
        return money;
    }

    public String getName()
    {
        return name;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void playerMoney(){ 
        System.out.println("-------------------------------------");
        System.out.println(name +" your total money is: $"+ money);
        System.out.println("-------------------------------------");
    }

    public void playerBet(){
        boolean player_bet_amount = true;
        while(player_bet_amount)
        {
            Scanner integScanner2 = new Scanner(System.in); 
            System.out.print("Enter bet amount " + name +": $ ");
            Integer bet_amount = integScanner2.nextInt();

            while(0 >= bet_amount || bet_amount > money)
            {
                System.out.println("Enter a valid bet amount" + name);
                bet_amount = integScanner2.nextInt();
            }
            betAmount = bet_amount;
            money -= betAmount;
            System.out.println("you have: $"+money+" left");
            integScanner2.nextLine();
            player_bet_amount = false;
        }
    }
    public void clearHand() {
        hand.clear();
    }

}
