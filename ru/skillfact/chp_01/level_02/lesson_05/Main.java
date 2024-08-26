package ru.skillfact.chp_01.level_02.lesson_05;

public class Main {
    public static void main(String[] args) {
        int grade = 3;

        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Можно было бы и лучше");
                break;
            case 2:
                System.out.println("Придеться переделать");
            case 1:
                System.out.println("Придеться переделать");
                break;
            default:
                System.out.println("Неверная оценка");
        }
    }
}
