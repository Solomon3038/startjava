import java.util.Scanner;
public class Calculator {

    Scanner scan = new Scanner(System.in);
    int numberOne;
    int numberTwo;

    public void calculate() {
        System.out.println("Добро пожаловать в Java калькулятор \n");
        System.out.println("\n Задайте пожалуйста два числа ");
        System.out.print("\n Введите первое число ");
        numberOne = scan.nextInt();
        System.out.println("\n Введите знак математической операции: (*,/,+,-,%,^)\n  ");
        String operation = scan.next();
        String eo = "Вы выбрали операцию ";
        System.out.print("\n Введите второе число:");
        numberTwo = scan.nextInt();

        switch (operation) {

            case "*":
                System.out.println(eo + "* \n Результат операции: " + (numberOne * numberTwo));
                break;
            case "/":
                System.out.println(eo + "/ \n Результат операции: " + (numberOne / numberTwo));
                break;
            case "+":
                System.out.println(eo + "+ \n Результат операции: " + (numberOne + numberTwo));
                break;
            case "-":
                System.out.println(eo + "- \n Результат операции: " + (numberOne % numberTwo));
                break;
            case "^":
                System.out.println(eo + "^ \n Результат операции: " + (doExponent(numberOne, numberTwo)));
                break;
            default:
                System.out.println("\n Задайте действительный знаки!");
        }
    }

    public int doExponent(int xe, int xo) {
        int result = 1;
        for (int i = 0; i < xo; i++) {
            result = result * xe;
        }
        return result;
    }
}
