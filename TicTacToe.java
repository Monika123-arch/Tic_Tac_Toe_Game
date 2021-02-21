public class TicTacToe {

    //Static Variables
    public static char[] board = new char[10];

    //CreateBoard() method to initialise a char array of size 10 to be a blank space
    public static void createBoard() {
        for (int i = 1; i < 10; i ++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        createBoard();
    }
}
