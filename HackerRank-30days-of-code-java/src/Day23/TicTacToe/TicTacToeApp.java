package Day23.TicTacToe;

import java.util.Scanner;

public class TicTacToeApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Allows for continuous games

        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            System.out.println("Welcome to TicTacToe! Are you ready? \n" +
                    "Pick a character you want to be and which character I will be");
            //setting up our tokens an AI
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board");
            char playerToken = scan.next().charAt(0); //will take only first character of the input
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = scan.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            //Set up the game
            System.out.println();
            System.out.println("Let's start the game. To play enter a number and your token shall be put in its place.\nNumbers go from 1-9, left to right.");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("Not Over")) {
                if (game.currentMarker == game.userMarker) {
                    //USER turn
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scan.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println(spot + "is invalid. Tru again");
                        spot = scan.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    //AI turn
                    System.out.println("It's my turn");
                    //Picks spot:
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            //set up a new game or not
            System.out.println("Do you want to play a game? Yes/No:");
            char response = scan.next().charAt(0);
            doYouWantToPlay = (response == 'y');
            System.out.println();
            System.out.println();
        }

    }
}
