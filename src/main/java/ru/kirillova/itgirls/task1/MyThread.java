package ru.kirillova.itgirls.task1;

public class MyThread extends Thread {

    private final boolean isEven;

    public MyThread(boolean isEven) {
        this.isEven = isEven;
    }

    @Override
    public void run() {
        if (isEven) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(this.getName() + i + " - " + " четное число");
                } else {
                    System.out.println(this.getName() + i + " - " + "нечетное число");
                }
            }
        }
    }
}
