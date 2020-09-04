package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount < 1000) {
            int difference = boundary - amount;
            System.out.println("Сделайте покупку на " + difference + " руб");
        }
        return boundary - amount % boundary;
    }
}
