import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomValue;
    private int attempts;
    private boolean isWinnerWasDetected = false;

    Scanner s = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomValue = getRandomInRange(0, 100);
        System.out.println("У вас 10 попыток");
        System.out.println("We have random integer in range [" + " 0" + ", " + " 100" + "]");

        while (!isWinnerWasDetected && attempts != 10) {
            attempts++;
            inputNumber(firstPlayer);
            inputNumber(secondPlayer);
            guess(firstPlayer);
            guess(secondPlayer);
        }

        System.out.print(firstPlayer.getName() + "  player input numbers: ");
        firstPlayer.getPlayerInput();
        System.out.println();
        System.out.print(secondPlayer.getName() + "  player input numbers: ");
        secondPlayer.getPlayerInput();
        System.out.println();

        if (attempts == 10 && !isWinnerWasDetected) {
            System.out.println("у игрока  " + firstPlayer.getName() + " закночились попытки");
            System.out.println("у игрока  " + secondPlayer.getName() + " закночились попытки");
        }

        firstPlayer.setTryToZero();
        secondPlayer.setTryToZero();
    }

    private int getRandomInRange(int min, int max) {
        return ((int) (Math.random() * (max - min + 1))) + min;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", enter your suggestion: ");
        int playerNumber = s.nextInt();
        player.setPlayersInput(playerNumber, attempts - 1);
    }

    private void guess(Player player) {
        if (player.getValue() == randomValue) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomValue + " с " + attempts + " попытки");
            isWinnerWasDetected = true;
        } else if (player.getValue() > randomValue) {
            System.out.println(player.getName() + " wrote value which is bigger than randomValue");
        } else if (player.getValue() < randomValue) {
            System.out.println(player.getName() + " wrote value which is less than randomValue");
        }
    }
}
