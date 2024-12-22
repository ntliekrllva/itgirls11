package ru.kirillova.itgirls.task1;

public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(true);
        myThread1.setName("Поток 1: ");
        MyThread myThread2 = new MyThread(false);
        myThread2.setName("Поток 2: ");

        myThread1.start();
        myThread2.start();
    }
}
