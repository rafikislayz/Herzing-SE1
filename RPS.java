import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int player1Wins = 0;
            int player2Wins = 0;

            while (true) {
                System.out.println("Player 1, choose rock (r), paper (p), or scissors (s):");
                String player1Choice = sc.nextLine();
                System.out.println("Player 2, choose rock (r), paper (p), or scissors (s):");
                String player2Choice = sc.nextLine();

                if (player1Choice.equals("r") && player2Choice.equals("s")) {
                    player1Wins++;
                    System.out.println("Player 1 wins!");
                } else if (player1Choice.equals("p") && player2Choice.equals("r")) {
                    player1Wins++;
                    System.out.println("Player 1 wins!");
                } else if (player1Choice.equals("s") && player2Choice.equals("p")) {
                    player1Wins++;
                    System.out.println("Player 1 wins!");
                } else if (player1Choice.equals(player2Choice)) {
                    System.out.println("Tie!");
                } else {
                    player2Wins++;
                    System.out.println("Player 2 wins!");
                }

                System.out.println("Player 1 wins: " + player1Wins);
                System.out.println("Player 2 wins: " + player2Wins);
                System.out.println("Do you want to play again? (y/n)");
                String playAgain = sc.nextLine();
                if (!playAgain.equals("y")) {
                    break;
                }
            }
            System.out.println("Final score: ");
            System.out.println("Player 1 wins: " + player1Wins);
            System.out.println("Player 2 wins: " + player2Wins);
        }
    }
}