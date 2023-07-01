package guessApp;

public class LaunchGame {
	public static void main(String...args) {
		Umpire ump = new Umpire();
		ump.print("Hello Welcome to Game Puzzle!!!");
		ump.setNumberToBeGuessed();
		ump.player1PicksAGuess();
		ump.player2PicksAGuess();
		ump.player3PicksAGuess();
		ump.compareTo();
	}
}