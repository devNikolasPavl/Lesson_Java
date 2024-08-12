package ru.javarush.syntax.level_02.lesson_04;

// Преобразование строк в целое число

public class Solution {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = 0 + Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);
        System.out.println(hugeAmount);
    }
}
