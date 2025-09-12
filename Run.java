import java.util.Scanner;
public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        for(Card card : deck.getCards())
        {
            System.out.println(card);
        }

        //Player amount
        Scanner playerAmount = new Scanner(System.in); 
        System.out.println("Enter number of players");

        String players = playerAmount.nextLine();
        System.out.println(players +" players");

    }
}
