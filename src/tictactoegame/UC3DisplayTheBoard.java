package tictactoegame;

import java.util.Scanner;

public class UC3DisplayTheBoard {
	static char[] board = new char[10];
	static Scanner cs = new Scanner(System.in);
	static char playerLetter;
	static char computerLetter;

	/**
	 * This method is created to display the board.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game.");
		emptyBoard();
		playerToChoose();
		printBoard();
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
}
