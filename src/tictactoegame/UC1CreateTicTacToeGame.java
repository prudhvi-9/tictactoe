package tictactoegame;

public class UC1CreateTicTacToeGame {

	static char[] board = new char[10];

	/**
	 * This method is created to create empty board for tic tac toe game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game.");
		emptyBoard();
	
	}

	/*
	 * To create a empty board.
	 */
	private static void emptyBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

}
