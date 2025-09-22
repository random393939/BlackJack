import java.util.Scanner;
import java.util.ArrayList;
public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        for(Card card : deck.getCards())
        {
            System.out.println(card);
        }

        //Player amount
        boolean player_step = true;
        ArrayList<String> player_List = new ArrayList<String>();
        while(player_step){
            Scanner integScanner = new Scanner(System.in); 
            System.out.println("Enter number of players (up to 4)");

            Integer players = integScanner.nextInt();
            integScanner.nextLine();

            if(players < 5 && players > 0) {
                System.out.println(players +" players selected");
                for(int j = 1;j<(players+1);j++){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What is your player name, player"+j);
                    String player_name = scanner.next();
                    player_List.add(player_name);

                    Player player = new Player(player_name, 100);

                    scanner.nextLine();
                }
                System.out.println(player_List);
                int player_amount = player_List.size();
                System.out.println(player_amount);
                player_step = false;

                boolean player_bet_amount = true;
                while(player_bet_amount){

                    for(int x = 0; x < player_amount; x++){
                        String current_player = player_List.get(x);
                        System.out.println(current_player + current_player.(this.money)); //Left off here
                    }
                    player_bet_amount=false;
                }
            }
            else{
                System.out.println("please select up to but not over 4 players");
            }
        }
    }
}
