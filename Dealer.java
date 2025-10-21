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
        getCard(deck); // draw 2nd card


        while (getHandValue() < 17) 
        {
            getCard(deck);
        }
        System.out.println("Dealer's full hand:");
        for (Card card : getHand()) {
            System.out.println(card); // this will show actual face and value
        }
        System.out.println("Dealer stands with : " + getHandValue());
    }

}
