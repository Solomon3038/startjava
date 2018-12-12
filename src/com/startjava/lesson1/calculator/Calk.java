package com.startjava.lesson1.calculator;

public class Calk {
    public static void main(String[] args) {
        int num1 = 3;
        System.out.println(num1);
        int num2 = 3;
        System.out.println(num2);

        char mathOperation = '^';
        System.out.println("Math operation is " + mathOperation);


        if (mathOperation == '+') {
            System.out.println("your answer is" + " " + (num1 + num2));
        } else if (mathOperation == '-') {
            System.out.println("your answer is" + " " + (num1 - num2));
        } else if (mathOperation == '/') {
            System.out.println("your answer is" + " " + (num1 / num2));
        } else if (mathOperation == '*') {
            System.out.println("your answer is" + " " + (num1 * num2));
        } else if (mathOperation == '%') {
            System.out.println("your answer is" + " " + (num1 % num2));
        } else if (mathOperation == '^') {
            int result = 1;
            for (int i = 0; i < num2; i++) {
                result = result * num1;

            }
            System.out.println(+num1 + " в степени " + num2 + " =" + result);
        }
    }
}
