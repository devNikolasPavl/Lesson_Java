package ru.video_02.level_01.ch_01.lesson_11;

public class RelationalExpressions {
    public static void main(String[] args) {

        // оператор сравнения ==
        // операция не равно !=

        var a = 2;
        var b = 3;

        boolean s = a == b;
        boolean t = a != b;

        // больше и больше или равно
        boolean u = a > b;
        boolean v = a >= b;

        // меньще и меньше или равно
        boolean w = a < b;
        boolean x = a <= b;

        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);
    }
}
