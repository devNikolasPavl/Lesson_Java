package ru.video_01.level_04.lesson_03;

import javax.swing.*;
import java.awt.*;

public class Prog4 {
    public static void main(String[] args) {
        myFrame mf = new myFrame();
    }
}



class myFrame extends JFrame {
    public myFrame() {
        Container con = getContentPane();
        myPanel np = new myPanel();
        con.add(np);
        setBounds(10, 10, 400, 400);
        setVisible(true);
    }
}

class myPanel extends JPanel {
    public void paintComponent(Graphics gr) {
        gr.setColor(Color.BLUE);
        gr.fillRect(10, 10, 200, 200);
    }
}