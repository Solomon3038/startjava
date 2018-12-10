import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Добро пожаловать в Java калькулятор");
        System.out.println(" Задайте пожалуйста два числа ");
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print(" Введите первое число ");
            int numberOne = s.nextInt();
            calculator.setNumberOne(numberOne);
            System.out.print(" Введите знак математической операции: (*,/,+,-,%,^)");
            char operation = s.next().charAt(0);
            calculator.setOperation(operation);
            System.out.print("Введите второе число:");
            int numberTwo = s.nextInt();
            calculator.setNumberTwo(numberTwo);
            calculator.calculate();

            do {
                System.out.println("Do you want to continue [yes/no]?");
                answer = s.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
