package com.startjava.lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Java калькулятор");
        System.out.println(" Задайте пожалуйста два числа ");
        String answer = "yes";
        Scanner s = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (answer.equals("yes")) {

            System.out.print(" Введите математическое выражение через пробел : ");
            String[] mathOp = s.nextLine().split("\\s");
            int numberOne = Integer.parseInt(mathOp[0]);
            int numberTwo = Integer.parseInt(mathOp[2]);
            calculator.setNumberOne(numberOne);
            char operation = mathOp[1].charAt(0);
            calculator.setOperation(operation);
            calculator.setNumberTwo(numberTwo);
            calculator.calculate();
            do {
                System.out.println("Do you want to continue [yes/no]?");
                answer = s.nextLine();//next() считывает строку до первого пробела или энтера
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
