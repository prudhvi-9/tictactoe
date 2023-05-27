package tictactoegame;

import java.util.Scanner;

public class UC4MakeAMoveToADesiredLocation {
	static char[] board = new char[10];
	static Scanner cs = new Scanner(System.in);
	static char playerLetter;
	static char computerLetter;

	/**
	 * This method is created for user to make a move to a desired location in the
	 * board. .
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game.");
		emptyBoard();
		playerToChoose();
		printBoard();
		playerTurn();
	}

	/*
	 * To create a empty board.
	 */
	private static void emptyBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

	/*
	 * Player to choose a letter X or O.
	 */
	public static void playerToChoose() {
		System.out.println("Enter the letter X or O");
		playerLetter = cs.next().charAt(0);
		System.out.println("You have choosen letter " + playerLetter + ".");

		computerLetter = (playerLetter == 'O') ? 'X' : 'O';
		System.out.println("Computer choosen letter " + computerLetter + ".");

	}

	/*
	 * To display the board.
	 */
	private static void printBoard() {
		System.out.print(board[1]);
		System.out.print("|");
		System.out.print(board[2]);
		System.out.print("|");
		System.out.println(board[3]);
		System.out.println("-----");

		System.out.print(board[4]);
		System.out.print("|");
		System.out.print(board[5]);
		System.out.print("|");
		System.out.println(board[6]);
		System.out.println("-----");

		System.out.print(board[7]);
		System.out.print("|");
		System.out.print(board[8]);
		System.out.print("|");
		System.out.println(board[9]);

	}

	/*
	 * User to make a move to a desired location in the board.
	 */
	private static void playerTurn() {
		int userInput;
		System.out.println("Enter Your Move:");
		userInput = cs.nextInt();

		if (userInput <= 9 && userInput >= 1) {
			System.out.println(userInput + " is a valid move.");
		} else {
			System.out.println(userInput + " is not a valid move.");
		}
		board[userInput] = playerLetter;
	}

	/*
	 * Computer to make a move by using random numbers.
	 */
	private static void computerTurn() {

		int compMove = (int) (Math.random() * 9 + 1);
		System.out.println("Computer has choose " + compMove);
		if (compMove <= 9 && compMove >= 1) {
			System.out.println(compMove + " is a valid move.");
		} else {
			System.out.println(compMove + " is not a valid move.");
		}
		board[compMove] = computerLetter;

	}
}
