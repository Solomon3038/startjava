package com.startjava.lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";

        Player firstPlayer = new Player(10);
        Player secondPlayer = new Player(10);
        do {
            System.out.print("First Player enter the Name ");
            firstPlayer.setName(s.nextLine());
            System.out.print("Second Player enter the Name aa");
            secondPlayer.setName(s.nextLine());
            GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
            guessNumber.start();

            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));
        } while (input.equals("yes"));
    }

}
