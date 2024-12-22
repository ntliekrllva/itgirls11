package ru.kirillova.itgirls.task4;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Машина номер 1 ", 10);
        Car car2 = new Car("Машина номер 2 ", 10);

        car1.start();
        car2.start();
    }
}
