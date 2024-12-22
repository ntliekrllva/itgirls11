package ru.kirillova.itgirls.task5;

public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(this.getName());
        }
    }
}
