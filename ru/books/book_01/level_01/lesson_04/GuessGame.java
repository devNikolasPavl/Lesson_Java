package ru.books.book_01.level_01.lesson_04;

public class GuessGame {
    // GuessGame содержит 3 переменных экземпляра для 3 объектов Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        // Создаем 3 объекта Player и присваиваем их 3 переменным экземпляра
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Объявляем 3 переменные для хранения вариантов от каждого игрока
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Объявляем 3 переменные для хранения правильности или неправельности (true & false) ответов игроков
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // создаем число которое игроки должны угадать
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадал число от 0 до 9 ...");

        while (true) {
            System.out.println("Число. которое нужно угадать, - " + targetNumber);

            // Вызываем метод guess() из каждого объекта Player
            p1.guess();
            p2.guess();
            p3.guess();

            // Извлекаем варианты каждого игрока (результаты работы их методов guess()), получая доступ к их переменным number
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Первый игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Первый игрок думает, что это " + guessp3);

            // Проверяем варианты каждого из игроков на соответствие загаданному числу. Если игрок угадал, то
            // присваеваем соответствующие переменной значение true (помните, что по умолчанию она хранит
            // значение false)
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // Если первый игрок, ИЛИ второй игрок, ИЛИ третий игрок угадал (оператор || означает ИЛИ)
            if (p1isRight|| p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры");
                break;
            } else {

                // Иначе остаемся в цикле и просим игроков сделать еще одну попытку
                System.out.println("Игроки должны попробывать еще раз.");
            }
        }
    }
}





























