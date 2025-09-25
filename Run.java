import java.util.Scanner;
import java.util.ArrayList;
public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        for(Card card : deck.getCards())
        {
            System.out.println(card);
        }

        boolean player_step = true;
        ArrayList<String> player_names_List = new ArrayList<String>();
        ArrayList<Player> player_List = new ArrayList<Player>();


        while(player_step){

            //create amount of players
            Scanner integScanner = new Scanner(System.in); 
            System.out.println("Enter number of players (up to 4)");

            Integer players = integScanner.nextInt();
            integScanner.nextLine();

            //player names
            if(players < 5 && players > 0) {
                for(int j = 1;j<(players+1);j++){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What is your player name, player"+j);
                    String player_name = scanner.next();
                    player_names_List.add(player_name);
                    scanner.nextLine();
                }
                player_step = false;

                //create players
                for(int x = 0; x < players; x++){
                    String current_player_name = player_names_List.get(x);
                    Player player = new Player(current_player_name,100 );
                    player_List.add(player);
                    
                }
                //bet cycle
                for(int y = 0; y < players; y++){
                    Player current_player = (player_List.get(y));
                    current_player.playTurn();
                }
                
                
            }
            else{
                System.out.println("please select up to but not over 4 players");
            }
        }
                
        
    }
}
