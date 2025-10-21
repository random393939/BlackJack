public class Dealer extends Player
{
    public Dealer()
    {
        super("Robert",100);
    }
    public Card getVisibleCard() 
    {
        return getHand().get(0);
    }


    @Override
    public void playTurn(Deck deck)
    {
        getHand(deck); //draw 1st card
        System.out.println("Dealer's card: " + getVisibleCard());

        while (getHandValue() < 17) 
        {
            getCard(deck);
        }

        System.out.println("Dealer stands with : " + getHandValue());
    }
}
