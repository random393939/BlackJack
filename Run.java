import java.util.Scanner;
import java.util.ArrayList;
public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        //create dealer
        Dealer dealer = new Dealer();

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
                    System.out.println("What is your player name, player #"+j);
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

                boolean keepPlaying = true;
                Scanner roundScanner = new Scanner(System.in);

                while(keepPlaying){
                    deck.shuffle();

                    //clear hands
                    for(Player p : player_List){
                        p.clearHand();
                    }
                    dealer.clearHand();

                    dealer.getHand(deck); // dealer draws first card
                    System.out.println("-------------------------------------");
                    System.out.println("Dealer's first card: " + dealer.getVisibleCard());

                    //bet + play cycle
                    for(int y = 0; y < players; y++){
                        Player current_player = player_List.get(y);
                        if (current_player.getMoney() <= 0) {
                            System.out.println(current_player.getName() + " has $0 and cannot play this round.");
                            continue;
                        }
                        current_player.playTurn(deck);
                    }

                    //dealer turn
                    System.out.println("Dealer's turn:");
                    dealer.playTurn(deck);
                    int dealerScore = dealer.getHandValue();

                    //compare scores and allocate winnings
                    for(int z = 0; z < players; z++){
                        Player current_player = player_List.get(z);
                        if (current_player.getMoney() <= 0) {
                            continue;
                        }
                        int playerScore = current_player.getHandValue();
                        System.out.println("\n" + current_player.getName() + "'s result:");
                        if(playerScore > 21){
                            System.out.println("Busted. You lose.");
                        } else if(dealerScore > 21 || playerScore > dealerScore){
                            System.out.println("You win!");
                            current_player.addMoney(current_player.getBetAmount() * 2);
                        } else if(playerScore == dealerScore){
                            System.out.println("Tie. Your bet is returned.");
                            current_player.addMoney(current_player.getBetAmount());
                        } else {
                            System.out.println("You lose.");
                        }
                    }

                    //ask to play again
                    System.out.println("Play another round? (yes/no)");
                    String response = roundScanner.nextLine().toLowerCase();
                    if(!response.equals("yes")){
                        keepPlaying = false;
                    }
                }

            }
            else{
                System.out.println("please select up to but not over 4 players");
            }
        }
    }


}
