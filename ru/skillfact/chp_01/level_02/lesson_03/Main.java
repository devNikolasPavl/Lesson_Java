package ru.skillfact.chp_01.level_02.lesson_03;

public class Main {
    public static void main(String[] args) {

        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
    }
}


class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Да иду уже...");
    }

    private void sharpenBlade() {
        System.out.println("Точим мечи");
    }

    private void getFood() {
        System.out.println("Собираем консервы");
    }

    private void assembleTeam() {
        System.out.println("Будим оруженосца");
    }


}