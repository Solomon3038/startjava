package com.startjava.lesson2_3.game;


import com.startjava.lesson2_3.game.Player;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomValue;
    private int attempts;

    Scanner s = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomValue = getRandomInRange(0, 100);
        System.out.println(randomValue);
        System.out.println("У вас 10 попыток");
        System.out.println("We have random integer in range [" + " 0" + ", " + " 100" + "]");

        while (attempts < 10) {
            attempts++;
            inputNumber(firstPlayer);
            inputNumber(secondPlayer);
            guess(firstPlayer);
            guess(secondPlayer);
        }
        firstPlayer.getPlayerInput();
        System.out.println();
        secondPlayer.getPlayerInput();
        System.out.println();
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
            System.out.println(secondPlayer.getName() + " is the winner");
        } else if (player.getValue() > randomValue) {
            System.out.println(player.getName() + " wrote value which is bigger than randomValue");
        } else {
            System.out.println(player.getName() + " wrote value which is less than randomValue");
        }
    }
}
