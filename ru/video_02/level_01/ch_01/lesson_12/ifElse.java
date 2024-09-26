package ru.video_02.level_01.ch_01.lesson_12;

public class ifElse {
    public static void main(String[] args) {

        var a = 5;
        var b = 5;

        // если b больше или равно a, то эта операции не сработает
        if (a > b) {
            var result = "a > b";
            System.out.println(result);
        }

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
        }
    }
}
