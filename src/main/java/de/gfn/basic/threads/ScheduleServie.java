package de.gfn.basic.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleServie {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        Runnable aufgabe = () -> {
            System.out.println(Thread.currentThread().getName() + ": check for Mails");
        };

        //service.schedule(aufgabe, 10, TimeUnit.SECONDS); // Ausführung mit Verzögerung
        service.scheduleAtFixedRate(aufgabe, 0, 5, TimeUnit.SECONDS);

        //service.shutdown();
    }
}
