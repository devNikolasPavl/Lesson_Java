package ru.javarush.syntax.level_02.lesson_03;

// Преобразование числа в строку

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digitls = "" + (x + y) + z;
        System.out.println(digitls);
    }
}
