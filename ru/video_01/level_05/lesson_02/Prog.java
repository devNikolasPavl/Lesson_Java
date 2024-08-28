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
    private int x = 0, y = 0;
    private int napr = 2;

    public myPanel()
    {
        try
        {
            img = ImageIO.read(new File("C://ff.gif"));
        }
        catch (IOException ex) {}
        Timer tm = new Timer(10, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (napr==0) x--;
                else if (napr==1) y--;
                else if (napr==2) x++;
                else if (napr==3) y++;
                repaint();
            }
        });

        tm.start();
    }

    public void paintComponent(Graphics gr)
    {
        gr.clearRect(x-1, y-1, img.getWidth(null)+1, img.getHeight(null)+1);
        gr.drawImage(img,x,y, null);
    }
}
