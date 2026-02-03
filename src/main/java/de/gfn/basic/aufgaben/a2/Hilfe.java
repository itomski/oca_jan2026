package de.gfn.basic.aufgaben.a2;

public class Hilfe {

    public static void main(String[] args) {

        int durchgaenge = 10;

        // Schleife
        for (int i = 0; i < durchgaenge; i++) {
            System.out.println(i);
        }

        int[] sammlung = new int[10]; // Eine Sammlung von 10 Zahlen
        System.out.println(sammlung[5]); // Zeige Wert an Position 6 (Index 5)

        sammlung[0] = 100; // Am Index 0 den Wert 100 ablegen
    }

    static int[] getWerte() { // gibt ein Array von Ganzzahlen zurück
        int[] werte = new int[10];
        werte[0] = 1;
        // ...
        return werte;
    }
}
