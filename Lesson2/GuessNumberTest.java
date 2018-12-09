


import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("First Player enter the Name ");
            Player player1 = new Player(s.nextLine());
            System.out.println("Second Player enter the Name");
            Player player2 = new Player(s.nextLine());
            GuessNumber1 guessNumber = new GuessNumber1(player1, player2);
            guessNumber.start();

            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));


        } while (input.equals("yes"));

    }
}

