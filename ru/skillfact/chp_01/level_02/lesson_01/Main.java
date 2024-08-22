package ru.skillfact.chp_01.level_02.lesson_01;

public class Main {
    // метод, который стартует ваши программы, то есть это своего рода начальная
    // точка, с этого метода начинается выполнение кода

    public static void main(String[] args) {
        // Создаем объект на основании класса
        Cookie cookie = new Cookie();
        // Вызываем метод нашего класса, чтобы испечь печеньки
        cookie.bake();
    }
}
