package de.gfn.basic.time;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 10_000_0000; i++) {
//            //System.out.println(i);
//        }
//
//        long stop = System.currentTimeMillis();
//        System.out.println(stop - start + "ms");

        // Instant = Maschienenzeit
        Instant start = Instant.now();

        for (int i = 0; i < 10_000_0000; i++) {
            //System.out.println(i);
        }

        Instant stop = Instant.now();
        System.out.println(Duration.between(start, stop).toNanos() + "ns");
    }
}
