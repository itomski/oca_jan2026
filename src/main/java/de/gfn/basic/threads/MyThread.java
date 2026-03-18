package de.gfn.basic.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i);
        }
    }
}
