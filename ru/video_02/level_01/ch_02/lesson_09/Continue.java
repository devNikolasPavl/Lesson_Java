package ru.video_02.level_01.ch_02.lesson_09;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
