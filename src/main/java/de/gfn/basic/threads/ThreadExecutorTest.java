package de.gfn.basic.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": START");

//        new Thread(()-> {
//            System.out.println(Thread.currentThread().getName() + ": HALLO");
//        }).start();

        ExecutorService service = Executors.newFixedThreadPool(10);

        Runnable aufgabe = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    System.out.println(Thread.currentThread().getName() + ": abgebrochen.");
//                }
            }
        };

        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);
        service.execute(aufgabe);

        service.shutdown();

        System.out.println(Thread.currentThread().getName() + ": ENDE");

    }
}
