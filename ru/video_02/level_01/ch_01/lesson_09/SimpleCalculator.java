package ru.video_02.level_01.ch_01.lesson_09;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.println("Введите первое значение: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе значение: ");
        var b = new Scanner(System.in).nextInt();

        var result1 = a + b;
        System.out.println(result1);
        var result2 = a - b;
        System.out.println(result2);
        var result3 = a * b;
        System.out.println(result3);
        var result4 = a / b;
        System.out.println(result4);
        var result5 = a % b;
        System.out.println(result5);
    }
}
