package guessnumber;


public class GuessNumberTest {
	public static void main(String[] args) {
		int playerCnt = 2;
		int rangeStart = 5;
		int rangeEnd = 100;
		GuessNumber businessLogic = new GuessNumber(playerCnt, rangeStart, rangeEnd);
		businessLogic.start();
	}
}