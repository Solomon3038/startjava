import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String input = "";
        do {
            Scanner s = new Scanner(System.in);

            CalculatorTest calculator = new CalculatorTest();
            calculator.calculate();
            do {
                System.out.println("Do you want to continue [yes/no]?");
                input = s.nextLine();
            } while (!input.equals("yes") && !input.equals("no"));
        } while (input.equals("yes"));

    }
}

