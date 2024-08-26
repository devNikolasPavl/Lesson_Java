package ru.skillfact.chp_01.level_02.lesson_04;

public class Main {
    public static void main(String[] args) {
        // изменение значения a
        int a = -9;

        if (a > 9) {
            System.out.println("a больше 9");
        } else if (a == 9) {
            System.out.println("a равно 9");
        } else if (a <= 9 && a > 0) {
            System.out.println("a меньше 0");
        } else {
            System.out.println("Условие не выполняется");
        }
    }
}
