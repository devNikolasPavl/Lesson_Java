package ru.video_02.level_01.ch_02.lesson_04;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {

        // чтение исходных данных
        // благодоря этим данным, если нам понадобится вывести результат
        // от 100 до 60, то мы поменяем одно значение var to = 60;
        var from = 100;
        var to = 1;
        var step = 1;

        // решение и вывод результата
        for (int i = from; i >= to; i-=step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
