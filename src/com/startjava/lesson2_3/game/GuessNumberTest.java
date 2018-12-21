package com.startjava.lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("First Player enter the Name ");
            Player firstPlayer = new Player(s.nextLine(), 10);
            System.out.print("Second Player enter the Name ");
            Player secondPlayer = new Player(s.nextLine(), 10);
            GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
            guessNumber.start();
            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));
        } while (input.equals("yes"));
    }
}
