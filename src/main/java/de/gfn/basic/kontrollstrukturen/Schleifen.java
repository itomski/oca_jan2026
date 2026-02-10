package de.gfn.basic.kontrollstrukturen;

public class Schleifen {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (; i < 100;) {
            System.out.println(++i);
        }

        for (;;) {
            System.out.println(++i);
            if(i == 100) break;
        }

        i = 0;
        for (;;System.out.println(++i)); // Endlosschleife

        //System.out.println(); // Error: Nicht erreichbar
    }
}
