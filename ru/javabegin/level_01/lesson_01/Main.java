package ru.javabegin.level_01.lesson_01;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car1.color = "black";
        car2.color = "red";
        car3.color = "blue";
        car4.color = "green";
        System.out.println(car1.color);
        System.out.println(car2.color);
        System.out.println(car3.color);
        System.out.println(car4.color);
    }
}
