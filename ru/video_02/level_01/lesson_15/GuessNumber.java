package ru.video_02.level_01.lesson_15;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        String result;
        if (number == userCase) {
            result = "Вы угадали число";
        } else {
            result = "Попробуйте еще раз";
        }

        System.out.println(result);
    }
}
