package ru.books.book_02.level_02.lesson_02;

// импортируется класс JOptionPane
import javax.swing.JOptionPane;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {

        // текст для названия окна
        String title = "Сообщение";
        // текст сообщения
        String text = "Продолжаем изучать Java";
        // Отображение диалогового окна с сообщениями
        JOptionPane.showMessageDialog(null, title, text, JOptionPane.WARNING_MESSAGE);

    }
}
