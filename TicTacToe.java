import java.util.*;
public class TicTacToe {
	//Static Variables
	public static char[] board = new char[10];
	public static char userChoice, compChoice; 	
	public static String line;

	//CreateBoard() method to initialise a char array of size 10 to be a blank space
	public static void createBoard() {
		for (int i = 1; i < 10; i ++) {
			board[i] = ' ';
		}
	}
	//playerChoice() method to choose User's and Computer's choice of X and O
	public static void playerChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose letter 'X' or 'O': ");
		userChoice = sc.next().charAt(0);
		if ( userChoice == 'X' || userChoice == 'x') {
			userChoice = 'X';
			compChoice = 'O';
		}
		else {
			userChoice = 'O';
			compChoice = 'X';
		}
		System.out.println("User: "+userChoice+"\nComputer: "+compChoice);
	}

	//displayBoard() method to print the  TicTacToe  Board
	public static void displayBoard() {
		System.out.println("  " + board[1] + " | "+ board[2] + " | " + board[3] + "  ");
		System.out.println("--------------");
		System.out.println("  " + board[4] + " | "+ board[5] + " | " + board[6] + "  ");
		System.out.println("--------------");
		System.out.println("  " + board[7] + " | "+ board[8] + " | " + board[9] + "  ");
	}

	//playerMove() method  To Input Position In Board
	public static void playerMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Slot Number To Place"+userChoice+" in:");
		while (true) {
			int num = sc.nextInt();
			if (num > 0 && num < 10) {
				if (board[num] == ' ') {
					board[num] = userChoice;
					break;
				}
				else {
					System.out.println("Position filled");
					continue;
				}
			}
			else {
				System.out.println("Not a Valid Input");
				continue;
			}
		}
	}

	//compMove() method to play move for a computer which takes position(1-9) by the use of random

	public static void compMove() {
		while (true) {
			int random = (int)(Math.floor(Math.random() * 10) % 9)+1;
			if (board[random] == ' ') {
				board[random] = compChoice;
				break;
			}
			else
				continue;
		}
	}

	public static boolean toss(){
		int random = (int)Math.floor(Math.random() * 10) % 2;
		if ( random == 0) {
			System.out.println(userChoice + " will play first.");
			return true;
		}
		else {
			System.out.println(compChoice + " will play first.");
			return false;
		}
	}

    /* checkWinner() method is to check either X or O has won the game or the game is draw */
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            switch (a) {
                case 0:
                    line = new StringBuilder().append(board[1]).append(board[2]).append(board[3]).toString();
                    break;
                case 1:
                    line = new StringBuilder().append(board[4]).append(board[5]).append(board[6]).toString();
                    break;
                case 2:
                    line = new StringBuilder().append(board[7]).append(board[8]).append(board[9]).toString();
                    break;
                case 3:
                    line = new StringBuilder().append(board[1]).append(board[4]).append(board[7]).toString();
                    break;
                case 4:
                    line = new StringBuilder().append(board[2]).append(board[5]).append(board[8]).toString();
                    break;
                case 5:
                    line = new StringBuilder().append(board[3]).append(board[6]).append(board[9]).toString();
                    break;
                case 6:
                    line = new StringBuilder().append(board[1]).append(board[5]).append(board[9]).toString();
                    break;
                case 7:
                    line = new StringBuilder().append(board[3]).append(board[5]).append(board[7]).toString();
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        /* In case of No-Winner the e check for anu any empty cells in the board, if they are present we
        return null else we return the game is a draw */
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                return null;
            }
        }
        return "draw";
    }

    /* printWinner method checks for win or draw from the argument passed from the return statement from
    the checkWinner method and prints the necessary output*/
    public static void printWinner (String condition) {
        if (condition == "draw") {
            System.out.println("Draw");
            System.exit(0);
        }
        else if(condition == "X" || condition == "O"){
            System.out.println("The winner is : " + condition);
            System.exit(0);
        }
    }
	public static void main(String[] args) {
		String winner = null;
        if (turn){
            while (winner == null) {
                playerMove();
                displayBoard();
                winner = checkWinner();
                printWinner(winner);
                System.out.println();
                compMove();
                displayBoard();
                winner = checkWinner();
                printWinner(winner);
            }
        }
        else {
            while (winner == null) {
                compMove();
                displayBoard();
                winner = checkWinner();
                printWinner(winner);
                System.out.println();
                playerMove();
                displayBoard();
                winner = checkWinner();
                printWinner(winner);
            }
        }
	  }
}
