package ru.kirillova.itgirls.task3;

public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread(5);
        MyThread thread2 = new MyThread(3);

        thread1.start();
        thread2.start();
    }
}
