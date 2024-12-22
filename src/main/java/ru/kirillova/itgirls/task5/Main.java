package ru.kirillova.itgirls.task5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        thread1.setName("Поток 1");
        MyThread thread2 = new MyThread();
        thread2.setName("Поток 2");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}