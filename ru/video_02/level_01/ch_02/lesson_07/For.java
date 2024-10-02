package ru.video_02.level_01.ch_02.lesson_07;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // А можно записать и и так, 1 выражение вынести за for,
        // 2 - поместить в вывод
        // Это такое же выражение

        int i = 0;
        for (; i < 5;) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        // 2 выражение можно сделать как while

        int w = 0;
        while (w < 5) {
            System.out.print(w++ + " ");
        }
        System.out.println();
    }
}
