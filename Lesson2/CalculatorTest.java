import java.util.Scanner;

public class CalculatorTest {

    public void calculate() {


        System.out.println("Добро пожаловать в Java калькулятор \n");
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n Задайте пожалуйста два числа ");
        int xe;
        int xo;

        System.out.print("\n Введите первое число ");
        xe = Scan.nextInt();

        System.out.println("\n Введите знак математической операции: (*,/,+,-,%,^)\n  ");
        String Operation = Scan.next();
        String EO = "Вы выбрали операцию ";

        System.out.print("\n Введите второе число:");
        xo = Scan.nextInt();


        switch (Operation) {

            case "*":
                System.out.println(EO + "* \n Результат операции: " + (xe * xo));
                break;
            case "/":
                System.out.println(EO + "/ \n Результат операции: " + (xe / xo));
                break;
            case "+":
                System.out.println(EO + "+ \n Результат операции: " + (xe + xo));
                break;
            case "-":
                System.out.println(EO + "- \n Результат операции: " + (xe % xo));
                break;
            case "^":
                System.out.println(EO + "^ \n Результат операции: " + (exponent(xe, xo)));
                break;
            default:
                System.out.println("\n Задайте действительный знаки!");
        }

        Scan.close();
        System.out.println(" Приложение закрыто");
    }

    public static int exponent(int xe, int xo) {
        int result = 1;
        for (int i = 0; i < xo; i++) {
            result = result * xe;

        }
        return result;
    }
}

