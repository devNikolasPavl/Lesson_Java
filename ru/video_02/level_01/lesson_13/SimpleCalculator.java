package ru.video_02.level_01.lesson_13;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Введите оператор:  +, -, *, /, %");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result;

        if (operator == '+') {
            System.out.println("a + b = " + (a + b));
        } else if (operator == '-') {
            System.out.println("a - b = " + (a - b));
        }else if (operator == '*') {
            System.out.println("a * b = " + (a * b));
        }else if (operator == '/') {
            System.out.println("a / b = " + (a / b));
        }else if (operator == '%') {
            System.out.println("a % b = " + (a % b));
        }
    }
}
