package guessApp;

import java.util.Scanner;

public class Player {
	private int player1;
	private int player2;
	private int player3;
	Scanner userInput = new Scanner(System.in);
	
	
	public void setPlayer1ToGuessNumber() {
		print("Hi Player 1, kindly enter your guess");
		player1 = userInput.nextInt();
	}
	public int getPlayer1Guess() {
		return player1;
	}
	
	public void setPlayer2ToGuessNumber() {
		print("Hi Player 2, kindly enter your guess");
		player2 = userInput.nextInt();
	}
	public int getPlayer2Guess() {
		return player2;
	}
	
	public void setPlayer3ToGuessNumber() {
		print("Hi Player 3, kindly enter your guess");
		this.player3 = userInput.nextInt();
	}
	
	public int getPlayer3Guess() {
		return player3;
	}
	
	public void print(String takeIn) {
		System.out.println(takeIn);
	}
}
