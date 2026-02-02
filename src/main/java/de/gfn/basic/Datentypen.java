package de.gfn.basic; // Wenn vorhanden, dann immer die erste Anweisung

public class Datentypen {

    public static void main(String[] args) {

        int i = 100;
        var j = 200; // Kompiler ermittelt automatisch den Datentyp (ab Java 1.10)
        // j = 2.5; // Kompiler-Error, Typ des Werts passt nicht zum Typ der Variable
        j = (int)2.5; // Konvertierung wird erzwungen
        System.out.println(j);

        short s;

        byte b = 10;
        j = b; // Konvertierung per Cast nicht nötig
        System.out.println(j);
    }
}
