package ru.skillfact.chp_01.level_02.lesson_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        StaticTest staticTest = new StaticTest();
        staticTest.noStaticMethod();

        StaticTest.staticMethod();
    }
}

class StaticTest {
    public void noStaticMethod() {
        System.out.println("No static");
    }

    public static void staticMethod() {
        System.out.println("Static");
    }
}