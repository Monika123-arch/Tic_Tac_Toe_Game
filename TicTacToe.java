import java.util.*;
public class TicTacToe {
	
	//Static Variables
	public static char[] board = new char[10];
	public static char userChoice, compChoice; 	

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
	public static void main(String[] args) {
		createBoard();
		playerChoice();
		displayBoard();
	}
}
