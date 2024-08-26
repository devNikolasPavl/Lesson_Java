package ru.video_01.level_04.lesson_01;

import javax.swing.*;

public class Prog4 {
    public static void main(String[] args) {

        JFrame nf = new JFrame();
        nf.setBounds(100, 50, 500, 300);
        nf.setVisible(true);

        Givotn slon1 = new Givotn();
        slon1.mass = 5000;
        slon1.podvodn = false;
        slon1.suhoput = true;
        slon1.letaush = false;

        Givotn slon2 = new Givotn();
        slon2.mass = 6000;
        slon2.podvodn = false;
        slon2.suhoput = true;
        slon2.letaush = false;

        Givotn rak = new Givotn();
        rak.mass = 1;
        rak.podvodn = true;
        rak.suhoput = true;
        rak.letaush = false;

        Okno myokno = new Okno();
        myokno.shirina = 300;
        myokno.visota = 200;
        myokno.pX = 50;
        myokno.pY = 20;
    }
}

class Givotn {
    int mass;
    boolean podvodn;
    boolean suhoput;
    boolean letaush;

}

class Okno {
    int shirina;
    int visota;
    int pX;
    int pY;
}