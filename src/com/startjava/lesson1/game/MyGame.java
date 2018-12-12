package com.startjava.lesson1.game;

public class MyGame {
    public static void main(String[] args) {
        int userNumber = 15;
        int compNumber = 10;
        System.out.println("User input number is " + userNumber);
        do {

            if (userNumber < compNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер" + userNumber);
                userNumber++;
            }
            if (userNumber > compNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер" + userNumber);
                userNumber--;
            }
        }
        while (userNumber != compNumber);
        System.out.println("Вы угадали!");
    }
}
