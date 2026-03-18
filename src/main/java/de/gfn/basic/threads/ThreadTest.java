package de.gfn.basic.threads;

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("main: START");

        Thread t1 = new Thread(); // Ohne Aufgabe
        t1.start();

        // Aufgabe als Runnable
        t1 = new Thread(() -> {
            for (int i = 0; i < 1_000; i++) {
                System.out.println(i);
            }
        });

        t1.start();

        Thread t2 = new MyThread();
        t2.start();

        System.out.println("main: ENDE");
    }
}
