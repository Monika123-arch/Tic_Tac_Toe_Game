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

	public static void main(String[] args) {
		createBoard();
		playerChoice();
	}
}
