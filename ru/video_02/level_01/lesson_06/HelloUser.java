package ru.video_02.level_01.lesson_06;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        System.out.println("Как вас зовут?");
        var name = new Scanner(System.in).nextLine();

        var result = "Вас зовут, " + name + "!";

        System.out.println(result);
    }
}
