package ru.video_02.level_01.lesson_18;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        var day = 9;

        String result;

        switch (day) {
            case 1: {
                result = "Понедельник";
                break;
            }
            case 2: {
                result = "Вторник";
                break;
            }
            case 3: {
                result = "Среда";
                break;
            }
            case 4: {
                result = "Четверг";
                break;
            }
            case 5: {
                result = "Пятница";
                break;
            }
            case 6: {
                result = "Суббота";
                break;
            }
            case 7: {
                result = "Воскресенье";
                break;
            }
            default: {
                result = "Вы ввели не правельное число";
            }
        }

        System.out.println(result);
    }
}
