package com.startjava.lesson2_3.game;

import java.util.Scanner;
import com.startjava.lesson2_3.game.GuessNumber;
import com.startjava.lesson2_3.game.Player;

public class GuessNumberTest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";

            Player playerw = new Player("",2);
            Player playerq = new Player("",2);




        do {
            playerw.setTryToZero();
            playerq.setTryToZero();
            System.out.println("First Player enter the Name ");
            playerw.setName(s.nextLine());
            System.out.println("Second Player enter the Name");
            playerq.setName(s.nextLine());
            GuessNumber guessNumber = new GuessNumber(playerw, playerq);
            guessNumber.start();

            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));
        } while (input.equals("yes"));
    }

}
