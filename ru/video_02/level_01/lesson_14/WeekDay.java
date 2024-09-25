package ru.video_02.level_01.lesson_14;

import java.awt.geom.RectangularShape;

public class WeekDay {
    public static void main(String[] args) {
        var day = 10;

        String result;
        if (day == 1) {
            result = "Понедельник";
        } else if (day == 2) {
            result = "Вторник";
        } else if (day == 3) {
            result = "Среда";
        } else if (day == 4) {
            result = "Четверг";
        } else if (day == 5) {
            result = "Пятница";
        } else if (day == 6) {
            result = "Суббота";
        } else if (day == 7) {
            result = "Воскресенье";
        } else {
            result = "Неправельно указан день: " + day;
        }

        System.out.println(result);
    }
}
