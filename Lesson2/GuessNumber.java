package guessnumber;
import java.util.Scanner;


public class GuessNumber {
	private Player[] players;
	private int rangeStart;
	private int rangeEnd;
	
	public GuessNumber(int playerCnt, int startOfRange, int endOfRange) {
		this.players = new Player[playerCnt];
		this.rangeStart = startOfRange;
		this.rangeEnd = endOfRange;
	}
	
	public void start() {
		this.createPlayers();
		int randomValue = this.getRandomInRange(this.rangeStart, this.rangeEnd);
		Scanner s = new Scanner(System.in);
		String rangeStr = "We have random integer in range [";
		rangeStr += this.rangeStart + ", ";
		rangeStr += this.rangeEnd + "]";
		System.out.println(rangeStr);
		while (true) {
			for (int i = 0; i < this.players.length; i++) {
				Player currentPlayer = this.players[i];
				String prompt = currentPlayer.getName() + ", enter your suggestion: ";
				System.out.print(prompt);
				int value = s.nextInt();
				currentPlayer.setValue(value);
			}

			boolean winnerWasDetected = false;
			for (int i = 0; i < this.players.length; i++) {
				Player currentPlayer = this.players[i];
				int value = currentPlayer.getValue();
				if (value == randomValue) {
					System.out.println(currentPlayer.getName() + " is the winner");
					winnerWasDetected = true;
				} else if (value > randomValue) {
					System.out.println(currentPlayer.getName() + " wrote value which is bigger than randomValue");
				} else {
					System.out.println(currentPlayer.getName() + " wrote value which is less than randomValue");
				}
			}
			if (winnerWasDetected) {
				break;
			}
		}
	}
	
	private int getRandomInRange(int min, int max) {
		return ((int)(Math.random() * (max - min + 1))) + min;
	}

	private void createPlayers() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < this.players.length; i++) {
			String prompt = "Enter your name, player №" + i + ": ";
			System.out.print(prompt);
			String userName = s.nextLine();
			this.players[i] = new Player(userName);
		}
	}
}