package ru.video_02.level_01.ch_02.lesson_05;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {

        // исходные данные
        var from = 0;
        var to = 50;
        var step = 2;

        // решение и вывод результата
        for (var i = from; i <= to; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
