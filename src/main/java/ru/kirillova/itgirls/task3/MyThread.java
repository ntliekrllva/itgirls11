package ru.kirillova.itgirls.task3;

public class MyThread extends Thread {

    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int res;
        res = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(res);
    }
}
