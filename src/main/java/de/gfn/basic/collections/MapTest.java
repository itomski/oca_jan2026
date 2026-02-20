package de.gfn.basic.collections;

import java.util.HashMap;
import java.util.Map;

// TopLevel-Klassen dürfen nur public oder package-private (default) sein
public class MapTest {

    private int j = 200;

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Kiel", 300_000);
        einwohner.put("München", 1_500_000);

        System.out.println(einwohner.get("Kiel"));

        System.out.println();

        for(Map.Entry<String, Integer> eintrag : einwohner.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        MapTest.Abc ref = new MapTest.Abc();


        // Lokale anonyme Klasse
        Runnable r = new Runnable() {
            @Override
            public void run() {
                //...
            }
        };

        // Lokale Klasse
        class SpecialRunnable implements Runnable {

            @Override
            public void run() {

            }
        }
    }

    // Innere Klasse (können auch private sein)
    class Xyz {

        int k = j * j;

        void machWas() {
            System.out.println(j); // Zugriff auf private Attribute der Äußeren Klasse
        }
    }

    // Statische Innere Klasse
    static class Abc {

        public int i = 100;

        void machWas() {
            System.out.println("I: " + i);
        }
    }
}
