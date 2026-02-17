package de.gfn.basic.lambda;

// SAM = Single Abstract Methode

public class LambdaTest2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + ": START");

        // void run();
        Runnable aufgabe = () -> {
            int i = 0;
            while(i < 10) {
                System.out.println(Thread.currentThread().getName() + ": " + i++);
            }
        };

        //aufgabe.run();
        Thread t1 = new Thread(aufgabe);
        t1.start(); // Aufgabe wird in einem extra Thread ausgeführt
        t1.join(); // main-Thread wartet, bis t1 fertig ist

        System.out.println(Thread.currentThread().getName() + ": ENDE");

    }
}
