package ru.books_01.chapter_01.lesson_02;

public class PhraseOMatic {
    public static void main(String[] args) {
        // создайте три набора слов для выбора.
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
                "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм",
                "метод критического пути", "динамичный"};

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный", "нестандартныйц ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий",
                "современный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант",
                "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец",
                "пункт следования"};

        // вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // генерируем 3 случайных числа
        int rand1 = (int) (Math.random()) * oneLength;
        int rand2 = (int) (Math.random()) * twoLength;
        int rand3 = (int) (Math.random()) * threeLength;

        // тепрь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - " + phrase);
    }
}
