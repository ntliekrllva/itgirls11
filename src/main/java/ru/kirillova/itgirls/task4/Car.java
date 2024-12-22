package ru.kirillova.itgirls.task4;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Thread {

    private String name;
    private int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public void run() {
        int speed = generateRandomSpeed(1, 5);
        distance = distance + speed;
        System.out.println(name + " проехала " + distance + " метров!");

    }

    public int generateRandomSpeed(int min, int max) {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }
}
