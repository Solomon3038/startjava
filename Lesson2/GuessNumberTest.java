
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First Player enter the Name ");
        Player player1 = new Player(s.nextLine());
        System.out.println("Second Player enter the Name");
        Player player2 = new Player(s.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String input = "";

        do {
            guessNumber.start();
            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));

        } while (!input.equals("no"));
    }
}
