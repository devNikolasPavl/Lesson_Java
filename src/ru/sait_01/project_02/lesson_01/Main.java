package ru.sait_01.project_02.lesson_01;

public class Main {
    //метод, который стартует ваши программы, то есть
    //это своего рода начальная точка, с этого метода
    //начинается выполнение кода

    public static void main(String[] args) {
        //создаем объект на основании класса
        Cookie cookie = new Cookie();
        //вызываем метод нашего класса. чтобы испеч печеньку
        cookie.bake();
    }
}
