package guessApp;

public class Umpire {
	private int numberTobeGuessed;
	private int player1GuessedNumber;
	private int player2GuessedNumber;
	private int player3GuessedNumber;
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
	public int getPlayer1GuessedNumber() {
		return player1GuessedNumber;
	}
	public void player2PicksAGuess() {
		player.setPlayer2ToGuessNumber();
		player2GuessedNumber = player.getPlayer2Guess();
	}
	public int getPlayer2GuessedNumber() {
		return player2GuessedNumber;
	}
	public void player3PicksAGuess() {
		player.setPlayer3ToGuessNumber();
		player2GuessedNumber = player.getPlayer3Guess();
	}
	public int getPlayer3GuessedNumber() {
		return player3GuessedNumber;
	}
	
	public void compareTo() {
		if(numberToBeGuessed == player1GuessedNumber) {
			
		}
	}

}
