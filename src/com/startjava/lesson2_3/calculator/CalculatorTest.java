package com.startjava.lesson2_3.calculator;


import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Java калькулятор");
        System.out.println(" Задайте пожалуйста два числа ");
        String answer = "yes";

        while (answer.equals("yes")) {
            Scanner s = new Scanner(System.in);
            Calculator calculator = new Calculator();
            System.out.print(" Введите математическое выражение через пробел : ");
            String matOp = s.nextLine();
            String[] words = matOp.split("\\s");
            String firstNumber = words[0];
            String secondNumber = words[2];
            int numberOne = Integer.parseInt(firstNumber);
            int numberTwo = Integer.parseInt(secondNumber);
            calculator.setNumberOne(numberOne);
            char operation = words[1].charAt(0);
            calculator.setOperation(operation);
            calculator.setNumberTwo(numberTwo);
            calculator.calculate();
            do {
                System.out.println("Do you want to continue [yes/no]?");
                answer = s.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
