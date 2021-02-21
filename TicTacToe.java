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
		System.out.println(userChoice + " will play first. Enter a slot number to place "+userChoice+" in:");
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
        // Variable always stays true if any of the winning conditions are not met
        boolean win = true;
        // Loop to check varios winning conditions
        for (int i = 1; i < 10; i++) {
            switch(i) {
                /* Case:1 (1,2,3)(1,5,9)(1,4,7) winning conditions
                i.e., if (2,3)(5,9)(4,7) is equal then the computer plays at position 1 */
                case 1:
                    if( (board[2] == compChoice && board[3] == compChoice)
                            || (board[4] == compChoice && board[7] == compChoice)
                            || (board[5] == compChoice && board[9] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:2 (1,2,3)(2,5,8) winning conditions
                i.e., if (1,3)(5,8) is equal then the computer plays at position 2 */
                case 2:
                    if( (board[1] == compChoice && board[3] == compChoice)
                            || (board[5] == compChoice && board[8] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:3 (1,2,3)(3,6,9)(3,5,7) winning conditions
                i.e., if (1,2)(6,9)(5,7) is equal then the computer plays at position 3 */
                case 3:
                    if( (board[1] == compChoice && board[2] == compChoice)
                            || (board[6] == compChoice && board[9] == compChoice)
                            || (board[5] == compChoice && board[7] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:4 (4,5,6)(1,4,7) winning conditions
                i.e., if (5,6)(1,7) is equal then the computer plays at position 4 */
                case 4:
                    if( (board[1] == compChoice && board[7] == compChoice)
                            || (board[5] == compChoice && board[6] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:5 (4,5,6)(2,5,8)(1,5,9)(3,5,7) winning conditions
                i.e., if (2,8)(1,9)(3,7)(4,6) is equal then the computer plays at position 5 */
                case 5:
                    if( (board[1] == compChoice && board[9] == compChoice)
                            || (board[4] == compChoice && board[6] == compChoice)
                            || (board[3] == compChoice && board[7] == compChoice)
                            || (board[2] == compChoice && board[8] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:6 (4,5,6)(3,6,9) winning conditions
                i.e., if (3,9)(4,5) is equal then the computer plays at position 6 */
                case 6:
                    if( (board[3] == compChoice && board[9] == compChoice)
                            || (board[4] == compChoice && board[5] == compChoice)) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:7 (7,5,3)(7,8,9)(7,4,1) winning conditions
                i.e., if (5,3)(8,9)(1,4) is equal then the computer plays at position 7 */
                case 7:
                    if( (board[1] == compChoice && board[4] == compChoice)
                            || (board[5] == compChoice && board[3] == compChoice)
                            || (board[8] == compChoice && board[9] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:8 (8,5,2)(8,7,9) winning conditions
                i.e., if (7,9)(2,5) is equal then the computer plays at position 8 */
                case 8:
                    if( (board[7] == compChoice && board[9] == compChoice)
                            || (board[2] == compChoice && board[5] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:9 (9,5,1)(7,8,9)(9,6,3) winning conditions
                i.e., if (6,3)(8,7)(1,5) is equal then the computer plays at position 9 */
                case 9:
                    if( (board[8] == compChoice && board[7] == compChoice)
                            || (board[6] == compChoice && board[3] == compChoice)
                            || (board[5] == compChoice && board[1] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
            }
        }

        if (win) {
            // Checking the opponent position whether it can win and stopping it by playing that position
            for (int i = 1; i < 10; i++) {
                switch(i) {
                /* Case:1 (1,2,3)(1,5,9)(1,4,7) winning conditions
                i.e., if (2,3)(5,9)(4,7) is equal then the computer plays at position 1 */
                    case 1:
                        if( (board[2] == userChoice && board[3] == userChoice)
                                || (board[4] == userChoice && board[7] == userChoice)
                                || (board[5] == userChoice && board[9] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:2 (1,2,3)(2,5,8) winning conditions
                i.e., if (1,3)(5,8) is equal then the computer plays at position 2 */
                    case 2:
                        if( (board[1] == userChoice && board[3] == userChoice)
                                || (board[5] == userChoice && board[8] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:3 (1,2,3)(3,6,9)(3,5,7) winning conditions
                i.e., if (1,2)(6,9)(5,7) is equal then the computer plays at position 3 */
                    case 3:
                        if( (board[1] == userChoice && board[2] == userChoice)
                                || (board[6] == userChoice && board[9] == userChoice)
                                || (board[5] == userChoice && board[7] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:4 (4,5,6)(1,4,7) winning conditions
                i.e., if (5,6)(1,7) is equal then the computer plays at position 4 */
                    case 4:
                        if( (board[1] == userChoice && board[7] == userChoice)
                                || (board[5] == userChoice && board[6] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:5 (4,5,6)(2,5,8)(1,5,9)(3,5,7) winning conditions
                i.e., if (2,8)(1,9)(3,7)(4,6) is equal then the computer plays at position 5 */
                    case 5:
                        if( (board[1] == userChoice && board[9] == userChoice)
                                || (board[4] == userChoice && board[6] == userChoice)
                                || (board[3] == userChoice && board[7] == userChoice)
                                || (board[2] == userChoice && board[8] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:6 (4,5,6)(3,6,9) winning conditions
                i.e., if (3,9)(4,5) is equal then the computer plays at position 6 */
                    case 6:
                        if( (board[3] == userChoice && board[9] == userChoice)
                                || (board[4] == userChoice && board[5] == userChoice)) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:7 (7,5,3)(7,8,9)(7,4,1) winning conditions
                i.e., if (5,3)(8,9)(1,4) is equal then the computer plays at position 7 */
                    case 7:
                        if( (board[1] == userChoice && board[4] == userChoice)
                                || (board[5] == userChoice && board[3] == userChoice)
                                || (board[8] == userChoice && board[9] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:8 (8,5,2)(8,7,9) winning conditions
                i.e., if (7,9)(2,5) is equal then the computer plays at position 8 */
                    case 8:
                        if( (board[7] == userChoice && board[9] == userChoice)
                                || (board[2] == userChoice && board[5] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:9 (9,5,1)(7,8,9)(9,6,3) winning conditions
                i.e., if (6,3)(8,7)(1,5) is equal then the computer plays at position 9 */
                    case 9:
                        if( (board[8] == userChoice && board[7] == userChoice)
                                || (board[6] == userChoice && board[3] == userChoice)
                                || (board[5] == userChoice && board[1] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                }
            }
        }

        if (win){
        /*Only when win has yet to change as False the bellow statement is executed.
        Taking a array of only corners available in the game board (1, 3, 4, 9)
        Initialising a random varialble to give a position between the max length of the array */
            int[] corners = {1, 3, 6, 9};
            int rnd = new Random().nextInt(corners.length);
            for (int i = 0; i < corners.length ; i++){
                if (board[corners[rnd]] == ' ') {
                    board[corners[rnd]] = compChoice;
                    win = false;
                    break;
                }
            }
        }
    if (win) {
        /*Only when win has yet to change as False the bellow statement is executed.
        Taking a array of only corners available in the game board (5, 2, 4, 6, 8)
        Initialising a random variable to give a position between the max length of the array */
            int[] corners = {5, 2, 4, 6, 8};
            int rnd = new Random().nextInt(corners.length);
            for (int i = 0; i < corners.length ; i++){
                if (board[corners[rnd]] == ' ') {
                    board[corners[rnd]] = compChoice;
                    win = false;
                    break;
                }
            }
        }

        /* If the win is not false from the above winning conditions then go for random
        to generate computer to move position */

		while (win) {
			int random = (int)(Math.floor(Math.random() * 10) % 9)+1;
				if (board[random] == ' ') {
					board[random] = compChoice;
					break;
				}
				else
					continue;
		}
	}

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
		System.out.println(userChoice + " will play first. Enter a slot number to place "+userChoice+" in:");
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
        // Variable always stays true if any of the winning conditions are not met
        boolean win = true;
        // Loop to check varios winning conditions
        for (int i = 1; i < 10; i++) {
            switch(i) {
                /* Case:1 (1,2,3)(1,5,9)(1,4,7) winning conditions
                i.e., if (2,3)(5,9)(4,7) is equal then the computer plays at position 1 */
                case 1:
                    if( (board[2] == compChoice && board[3] == compChoice)
                            || (board[4] == compChoice && board[7] == compChoice)
                            || (board[5] == compChoice && board[9] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:2 (1,2,3)(2,5,8) winning conditions
                i.e., if (1,3)(5,8) is equal then the computer plays at position 2 */
                case 2:
                    if( (board[1] == compChoice && board[3] == compChoice)
                            || (board[5] == compChoice && board[8] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:3 (1,2,3)(3,6,9)(3,5,7) winning conditions
                i.e., if (1,2)(6,9)(5,7) is equal then the computer plays at position 3 */
                case 3:
                    if( (board[1] == compChoice && board[2] == compChoice)
                            || (board[6] == compChoice && board[9] == compChoice)
                            || (board[5] == compChoice && board[7] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:4 (4,5,6)(1,4,7) winning conditions
                i.e., if (5,6)(1,7) is equal then the computer plays at position 4 */
                case 4:
                    if( (board[1] == compChoice && board[7] == compChoice)
                            || (board[5] == compChoice && board[6] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:5 (4,5,6)(2,5,8)(1,5,9)(3,5,7) winning conditions
                i.e., if (2,8)(1,9)(3,7)(4,6) is equal then the computer plays at position 5 */
                case 5:
                    if( (board[1] == compChoice && board[9] == compChoice)
                            || (board[4] == compChoice && board[6] == compChoice)
                            || (board[3] == compChoice && board[7] == compChoice)
                            || (board[2] == compChoice && board[8] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:6 (4,5,6)(3,6,9) winning conditions
                i.e., if (3,9)(4,5) is equal then the computer plays at position 6 */
                case 6:
                    if( (board[3] == compChoice && board[9] == compChoice)
                            || (board[4] == compChoice && board[5] == compChoice)) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:7 (7,5,3)(7,8,9)(7,4,1) winning conditions
                i.e., if (5,3)(8,9)(1,4) is equal then the computer plays at position 7 */
                case 7:
                    if( (board[1] == compChoice && board[4] == compChoice)
                            || (board[5] == compChoice && board[3] == compChoice)
                            || (board[8] == compChoice && board[9] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:8 (8,5,2)(8,7,9) winning conditions
                i.e., if (7,9)(2,5) is equal then the computer plays at position 8 */
                case 8:
                    if( (board[7] == compChoice && board[9] == compChoice)
                            || (board[2] == compChoice && board[5] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
                /* Case:9 (9,5,1)(7,8,9)(9,6,3) winning conditions
                i.e., if (6,3)(8,7)(1,5) is equal then the computer plays at position 9 */
                case 9:
                    if( (board[8] == compChoice && board[7] == compChoice)
                            || (board[6] == compChoice && board[3] == compChoice)
                            || (board[5] == compChoice && board[1] == compChoice) ) {
                        board[i] = compChoice;
                        win = false;
                    }
                    break;
            }
        }

        if (win) {
            // Checking the opponent position whether it can win and stopping it by playing that position
            for (int i = 1; i < 10; i++) {
                switch(i) {
                /* Case:1 (1,2,3)(1,5,9)(1,4,7) winning conditions
                i.e., if (2,3)(5,9)(4,7) is equal then the computer plays at position 1 */
                    case 1:
                        if( (board[2] == userChoice && board[3] == userChoice)
                                || (board[4] == userChoice && board[7] == userChoice)
                                || (board[5] == userChoice && board[9] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:2 (1,2,3)(2,5,8) winning conditions
                i.e., if (1,3)(5,8) is equal then the computer plays at position 2 */
                    case 2:
                        if( (board[1] == userChoice && board[3] == userChoice)
                                || (board[5] == userChoice && board[8] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:3 (1,2,3)(3,6,9)(3,5,7) winning conditions
                i.e., if (1,2)(6,9)(5,7) is equal then the computer plays at position 3 */
                    case 3:
                        if( (board[1] == userChoice && board[2] == userChoice)
                                || (board[6] == userChoice && board[9] == userChoice)
                                || (board[5] == userChoice && board[7] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:4 (4,5,6)(1,4,7) winning conditions
                i.e., if (5,6)(1,7) is equal then the computer plays at position 4 */
                    case 4:
                        if( (board[1] == userChoice && board[7] == userChoice)
                                || (board[5] == userChoice && board[6] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:5 (4,5,6)(2,5,8)(1,5,9)(3,5,7) winning conditions
                i.e., if (2,8)(1,9)(3,7)(4,6) is equal then the computer plays at position 5 */
                    case 5:
                        if( (board[1] == userChoice && board[9] == userChoice)
                                || (board[4] == userChoice && board[6] == userChoice)
                                || (board[3] == userChoice && board[7] == userChoice)
                                || (board[2] == userChoice && board[8] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:6 (4,5,6)(3,6,9) winning conditions
                i.e., if (3,9)(4,5) is equal then the computer plays at position 6 */
                    case 6:
                        if( (board[3] == userChoice && board[9] == userChoice)
                                || (board[4] == userChoice && board[5] == userChoice)) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:7 (7,5,3)(7,8,9)(7,4,1) winning conditions
                i.e., if (5,3)(8,9)(1,4) is equal then the computer plays at position 7 */
                    case 7:
                        if( (board[1] == userChoice && board[4] == userChoice)
                                || (board[5] == userChoice && board[3] == userChoice)
                                || (board[8] == userChoice && board[9] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:8 (8,5,2)(8,7,9) winning conditions
                i.e., if (7,9)(2,5) is equal then the computer plays at position 8 */
                    case 8:
                        if( (board[7] == userChoice && board[9] == userChoice)
                                || (board[2] == userChoice && board[5] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                /* Case:9 (9,5,1)(7,8,9)(9,6,3) winning conditions
                i.e., if (6,3)(8,7)(1,5) is equal then the computer plays at position 9 */
                    case 9:
                        if( (board[8] == userChoice && board[7] == userChoice)
                                || (board[6] == userChoice && board[3] == userChoice)
                                || (board[5] == userChoice && board[1] == userChoice) ) {
                            if (board[i] == ' ') {
                                board[i] = compChoice;
                                win = false;
                            }
                        }
                        break;
                }
            }
        }

        if (win) {
        /*Only when win has yet to change as False the bellow statement is executed.
        Taking a array of only corners available in the game board (5, 2, 4, 6, 8)
        Initialising a random variable to give a position between the max length of the array */
            int[] corners = {5, 2, 4, 6, 8};
            int rnd = new Random().nextInt(corners.length);
            for (int i = 0; i < corners.length ; i++){
                if (board[corners[rnd]] == ' ') {
                    board[corners[rnd]] = compChoice;
                    win = false;
                    break;
                }
            }
        }

        /* If the win is not false from the above winning conditions then go for random
        to generate computer to move position */

		while (win) {
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
        }

        if (win){
        /*Only when win has yet to change as False the bellow statement is executed.
        Taking a array of only corners available in the game board (1, 3, 4, 9)
        Initialising a random varialble to give a position between the max length of the array */
            int[] corners = {1, 3, 6, 9};
            int rnd = new Random().nextInt(corners.length);
            for (int i = 0; i < corners.length ; i++){
                if (board[corners[rnd]] == ' ') {
                    board[corners[rnd]] = compChoice;
                    win = false;
                    break;
                }
            }
        }
        /* If the win is not false from the above winning conditions then go for random
        to generate computer to move position */

		while (win) {
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
		createBoard();
		playerChoice();
		displayBoard();
		boolean turn = toss();
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

