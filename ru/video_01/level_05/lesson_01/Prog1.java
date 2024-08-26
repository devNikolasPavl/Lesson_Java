package ru.video_01.level_05.lesson_01;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Prog1 {
    public static void main(String[] args) {

        //создание главного окна программы
        myFrame okno = new myFrame();
    }
}


// Класс главного окна программы (наследуется от класса всех окон)
class myFrame extends JFrame {

    //Метод, который устанавливает основные настройки окна
    public myFrame()
    {
        setBackground(Color.WHITE);                  //установка цвета фона
        setBounds(0, 0, 800, 550);  //размер окна и его положение
        setTitle("Урок №7");                         //заголовок окна
        myPanel panel = new myPanel();               //создание панели с графикой
        Container cont = getContentPane();
        cont.add(panel);                             //вложение панели в окно программы
        setVisible(true);                            //отображение окна на экране
    }
}



//Класс панели окна, которая вложена в окно (наследуется от класса всех панелей окон)
class myPanel extends JPanel {
    public myPanel() {

    }

    // Метод, который отображает графические объекты на панели
    public void paintComponent(Graphics gr) {

        // Здесь пишется код, который выводит графику в панель окна
    }
}