/*Expected Output
 * Tic - Tac - Toe
 *  X | O | X
 * ___ ___ ___
 *  X |   |   
 * ___ ___ ___
 *  X | O | O
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Tic - Tac - Toe\n");
        char[][] board = new char[3][3];
        char player = 'O';
        boolean gameOver = false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }
        PrintBoard(board);

        while (!gameOver) {
            player = (player == 'X') ? 'O' : 'X';
            Scanner in = new Scanner(System.in);
            System.out.print("Player " + player + " move :");
            int row = in.nextInt();
            int col = in.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = player;
            } else {
                System.out.println("Invalid Move!");
            }
            PrintBoard(board);
            gameOver = isGameOver(board, player);

        }
        System.out.println("Player " + player + " wins!");

    }

    static boolean isGameOver(char[][] board, char player) {
        /*
         * Cases when the game will get over!
         * Case 1: When all the rows are same
         * X | X | X
         * ___ ___ ___
         * | |
         * ___ ___ ___
         * | |
         * 
         * Case 2 : When all the cols are same
         * X | |
         * ___ ___ ___
         * X | |
         * ___ ___ ___
         * X | |
         * 
         * Case 3 : When all the diagonal are same
         * X | |
         * ___ ___ ___
         * | X |
         * ___ ___ ___
         * | | X
         * or
         * | | X
         * ___ ___ ___
         * | X |
         * ___ ___ ___
         * X | |
         */

        // Case 1
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Case 2
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Case 3
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        // Case 4
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    static void PrintBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (col != board.length - 1) {
                    System.out.print(" " + board[row][col] + " | ");
                } else {
                    System.out.print(" " + board[row][col]);
                }

            }
            System.out.println();
            if (row != board.length - 1) {
                System.out.println("___  ___  ___");
            }
        }
    }
}
