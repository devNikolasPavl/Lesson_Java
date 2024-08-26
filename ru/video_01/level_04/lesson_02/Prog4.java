package ru.video_01.level_04.lesson_02;

public class Prog4 {
    public static void main(String[] args) {

        Slon slon = new Slon();
        slon.skorost = 30;
        slon.mass = 5000;
        slon.suhopt = true;
        slon.letaush = false;
        slon.podvodn = false;

        Orel orel = new Orel();
        orel.visota = 400;
        orel.mass = 20;
        orel.letaush = true;
        orel.podvodn = false;
        orel.suhopt = false;
    }
}


class Givotn {
    int mass;
    boolean suhopt;
    boolean podvodn;
    boolean letaush;
}


class Slon extends Givotn {
    int skorost;
}


class Orel extends Givotn {
    int visota;
}