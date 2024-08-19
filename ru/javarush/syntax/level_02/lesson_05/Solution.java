package ru.javarush.syntax.level_02.lesson_05;

/*
    В переменную tagline нужно записать строку "JustDoIt". Используй 3 переменные
 */

public class Solution {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s2 + s1;

        System.out.println(tagline);
    }
}
