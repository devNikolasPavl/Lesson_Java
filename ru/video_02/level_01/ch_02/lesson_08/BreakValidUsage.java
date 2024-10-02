package ru.video_02.level_01.ch_02.lesson_08;

public class BreakValidUsage {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();


        // Вверху не корректное использование break;
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
