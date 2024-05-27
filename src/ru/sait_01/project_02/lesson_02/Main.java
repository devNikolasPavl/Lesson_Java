package ru.sait_01.project_02.lesson_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        StaticTest staticTest = new StaticTest();
        staticTest.noStaticMethod();

        StaticTest.staticMethob();
    }
}

class StaticTest {
    public void noStaticMethod() {
        System.out.println("No static");
    }

    public static void staticMethob() {
        System.out.println("Static");
    }
}
