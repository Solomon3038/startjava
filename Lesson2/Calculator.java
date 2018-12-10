public class Calculator {
    private char operation;
    private int numberOne;
    private int numberTwo;


    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;

    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void calculate() {
        String eo = "Вы выбрали операцию ";

        switch (operation) {

            case '*':
                System.out.println(eo + " * Результат операции: " + (numberOne * numberTwo));
                break;
            case '/':
                System.out.println(eo + " /  Результат операции: " + (numberOne / numberTwo));
                break;
            case '+':
                System.out.println(eo + " + Результат операции: " + (numberOne + numberTwo));
                break;
            case '-':
                System.out.println(eo + " - Результат операции: " + (numberOne - numberTwo));
                break;
            case '%':
                System.out.println(eo + " %  Результат операции: " + (numberOne % numberTwo));
                break;
            case '^':
                System.out.println(eo + " ^  Результат операции: " + (doExponent(numberOne, numberTwo)));
                break;
            default:
                System.out.println("Задайте действительный знаки!");
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
