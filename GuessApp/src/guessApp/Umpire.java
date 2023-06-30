package guessApp;

public class Umpire {
	private int numberTobeGuessed;
	private int player1GuessedNumber;
	private int player2GuessedNumber;
	Player player = new Player();
	Guesser guess = new Guesser();
	
	public void setNumberToBeGuessed(){
		guess.setNumberToBeGuessed();
		numberTobeGuessed = guess.getNumberToBeGuessed()
	}
	public int getNumberToBeGuessed() {
		return numberTobeGuessed;
	}
	
	
	public void player1PicksAGuess() {
		
		player.setPlayer1ToGuessNumber();
		player1GuessedNumber = player.getPlayer1Guess();
	}
	public void player2PicksAGuess() {
		player.setPlayer2ToGuessNumber(player2GuessedNumber);
	}

}
