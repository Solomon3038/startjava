package com.startjava.lesson2_3.game;


import com.startjava.lesson2_3.game.Player;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomValue;
    /*private boolean isWinnerWasDetected;*/
    private int[] playersInput;
    private int tryCnt;

    Scanner s = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.firstPlayer = player1;
        this.secondPlayer = player2;
    }

    public void start() {
        randomValue = getRandomInRange(0, 100);
        System.out.println(randomValue);
        System.out.println("We have random integer in range [" + " 0" + ", " + " 100" + "]");

        while (tryCnt <= 2) {
            tryCnt++;
            inputNumber(firstPlayer);
            inputNumber(secondPlayer);
            guess(firstPlayer);
            guess(secondPlayer);
        }
        firstPlayer.getPlayersInput();
        secondPlayer.getPlayersInput();
    }

    private int getRandomInRange(int min, int max) {
        return ((int) (Math.random() * (max - min + 1))) + min;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", enter your suggestion: ");
        int input = s.nextInt();
        player.setValue(input);
        player.setValu(input, tryCnt - 1);
    }

    private void guess(Player player) {
        if (player.getValue() == randomValue) {
            System.out.println(secondPlayer.getName() + " is the winner");
            /*isWinnerWasDetected = true;*/
        } else if (player.getValue() > randomValue) {
            System.out.println(player.getName() + " wrote value which is bigger than randomValue");
        } else {
            System.out.println(player.getName() + " wrote value which is less than randomValue");
        }
    }
}
