import java.util.*;

public class TicTacToeAI {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    // Check winner
    static boolean isWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static boolean isFull() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == ' ') return false;
        return true;
    }

    // Minimax algorithm
    static int minimax(boolean isMax) {
        if (isWinner('O')) return 1;
        if (isWinner('X')) return -1;
        if (isFull()) return 0;

        int best = isMax ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = isMax ? 'O' : 'X';
                    int score = minimax(!isMax);
                    board[i][j] = ' ';

                    if (isMax)
                        best = Math.max(best, score);
                    else
                        best = Math.min(best, score);
                }
            }
        }
        return best;
    }

    // AI move
    static void aiMove() {
        int bestScore = Integer.MIN_VALUE;
        int row = -1, col = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    int score = minimax(false);
                    board[i][j] = ' ';

                    if (score > bestScore) {
                        bestScore = score;
                        row = i;
                        col = j;
                    }
                }
            }
        }

        board[row][col] = 'O';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printBoard();

            // Player move
            System.out.print("Enter row and column (0-2): ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (board[r][c] != ' ') {
                System.out.println("Invalid move!");
                continue;
            }

            board[r][c] = 'X';

            if (isWinner('X')) {
                printBoard();
                System.out.println("You Win!");
                break;
            }

            if (isFull()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }

            // AI move
            aiMove();

            if (isWinner('O')) {
                printBoard();
                System.out.println("AI Wins!");
                break;
            }

            if (isFull()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }
        }

        sc.close();
    }
}