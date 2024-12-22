package ru.kirillova.itgirls.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        MyThread thread1 = new MyThread();
        thread1.setName("Поток 1: ");
        System.out.println(thread1.getName());

        thread1.start();
        thread1.join();

        MyThread thread2 = new MyThread();
        System.out.println(thread2.getName());
        thread2.setName("Поток 2: ");

        thread2.start();
        thread2.join();
    }
}
