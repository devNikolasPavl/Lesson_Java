package ru.video_02.level_01.ch_01.lesson_05;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {

        // чтение исходных данных
        var i = new Scanner(System.in).nextInt();
        var y = new Scanner(System.in).nextInt();

        // обработка исходных данных, что бы получить результат
        var z = i + y;

        // вывод или отображение результата
        System.out.println(z);


    }
}
