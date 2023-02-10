package DM575.Lessions.TikTaktoe;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board gameBoard = new Board();
        Scanner input = new Scanner(System.in);
        while(gameBoard.isTie() == false && gameBoard.won() == false) {
            gameBoard.show();
            System.out.print("Current player = " + gameBoard.nextPlayer() + " pick a cell! ");
            int cell = input.nextInt();
            if (gameBoard.makeMove(cell)) {
                gameBoard.player = gameBoard.nextPlayer();
            } else {
                System.out.println("Invalid move try again!");
            }
        }
        if (gameBoard.won() == true) {
            System.out.println("Concrastulation Player " + gameBoard.player + " has won!");
        }
        else if (gameBoard.isTie() == true) {
            System.out.println("The game ended in a tie!");
        }

        input.close();
    }
}
