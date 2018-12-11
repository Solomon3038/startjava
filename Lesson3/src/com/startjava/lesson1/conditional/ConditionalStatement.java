package com.startjava.lesson1.conditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int myAge = 20;
        double tall = 1.70;
        boolean isFemale = true;
        boolean isMale = true;
        char name = 'M';
        char anotherName = 'I';


        if (myAge > 20) {
            System.out.println("the myAge is 20 years");
        }

        if (isMale) {
            System.out.println("the myGenre is male");
        }

        if (isFemale) {
            System.out.println("the myGenre is female");
        }

        if (tall < 1.80) {
            System.out.println("My height is smaller then 1.80 cm");
        } else {
            System.out.println("My height is higher then 1.80 cm");
        }
        if ((name == 'M')) {
            System.out.println("My name is Martin");
        } else if (name == 'I') {
            System.out.println("My name is India");
        } else {
            System.out.println("the name start not with M or I");
        }
    }
}
