import java.util.Scanner;
public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        for(Card card : deck.getCards())
        {
            System.out.println(card);
        }

        //Player amount
        boolean player_step = true;
        while(player_step){
            Scanner integScanner = new Scanner(System.in); 
            System.out.println("Enter number of players (up to 4)");

            Integer players = integScanner.nextInt();
            integScanner.nextLine();

            if(players < 5 && players > 0) {
                System.out.println(players +" players selected");
                player_step = false;
            }
            else{
                System.out.println("please select up to but not over 4 players");
            }
        }
    }
}
