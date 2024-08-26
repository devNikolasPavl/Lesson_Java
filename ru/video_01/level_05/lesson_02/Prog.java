package ru.video_01.level_05.lesson_02;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Prog {
    public static void main(String[] args) {

        myFrame okno = new myFrame();
    }
}


class myFrame extends JFrame {

    public myFrame()
    {
        setBackground(Color.WHITE);
        setBounds(0, 0, 800, 550);
        setTitle("Урок №7");
        myPanel panel = new myPanel();
        Container cont = getContentPane();
        cont.add(panel);
        setVisible(true);
    }
}


class myPanel extends JPanel {

    private Image img;

    public myPanel()
    {
        try
        {
            img = ImageIO.read(new File("img/ff.gif"));
        }
        catch (IOException ex) {}
    }

    public void paintComponent(Graphics gr)
    {
        gr.drawImage(img, 0, 0, null);
    }
}
