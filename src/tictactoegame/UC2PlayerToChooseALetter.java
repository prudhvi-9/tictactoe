package tictactoegame;

import java.util.Scanner;

public class UC2PlayerToChooseALetter {
	static char[] board = new char[10];
	static Scanner cs = new Scanner(System.in);
	static char playerLetter;
	static char computerLetter;

	/**
	 * This method is created to allow player to choose a letter.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game.");
		emptyBoard();
		playerToChoose();
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

}
