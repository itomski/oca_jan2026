package de.gfn.basic;

// Alle Klassen sind Kindklassen der Klasse Object

public class DestruktorTest {

    public static void main(String[] args) throws InterruptedException {

        DestruktorTest test = new DestruktorTest();
        // Jede Klasse erbt Inventar von der Klasse Object
        test = null; // Referenz wird gelöst

        System.gc(); // Bitte an der GC aktiv zu werden

        Thread.sleep(2000); // main-Therad wird für 2 Sekunden pausiert

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHHRRRRRRR....");
    }
}
