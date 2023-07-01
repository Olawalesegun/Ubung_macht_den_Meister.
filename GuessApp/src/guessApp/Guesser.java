package guessApp;
import java.security.SecureRandom;

public class Guesser {
	private int numberToBeGuessed;
	SecureRandom secRan = new SecureRandom();

	public int getNumberToBeGuessed() {
		return numberToBeGuessed;
	}

	public void setNumberToBeGuessed() {
		this.numberToBeGuessed = secRan.nextInt(1, 9);
	}
}
