package de.gfn.basic.threads;

public class ThreadTest2 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        final Object LOCK = new Object();

        Runnable aufgabe = () -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (LOCK) {
                    counter.up();
                    counter.down();
                }
            }
        };

        Thread t1 = new Thread(aufgabe);
        Thread t2 = new Thread(aufgabe);
        t1.start();
        t2.start();

        t1.join(); // Der aktuell aktive Thread wartet auf das Ende vom t1
        t2.join();

        System.out.println("Counter: " + counter.getZahl());
    }
}

class Counter {

    private int zahl = 0;

    public void up() {
        zahl++;
    }

    public void down() {
        zahl--;
    }

    public int getZahl() {
        return zahl;
    }
}
