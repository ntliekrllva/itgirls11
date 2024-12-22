package ru.kirillova.itgirls.task2;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(currentThread().getName() + i);
        }
    }
}
