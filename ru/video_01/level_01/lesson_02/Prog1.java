package ru.video_01.level_01.lesson_02;

import javax.swing.*;

public class Prog1 {
    public static void main(String[] args) {

        // Создаем новое окно
        JFrame nf = new JFrame();
        // Размеры окна и как оно будет выводится на мониторе расстояние 100 пикселей
        nf.setBounds(100, 100, 300, 300);
        // Название окна
        nf.setTitle("Добро пожаловать в Java");
        // делаем окно видимым
        nf.setVisible(true);
    }
}
