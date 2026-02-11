package de.gfn.basic.datentypen;

import java.util.Arrays;

public class Datentypen2 {

    // Klassen und Instanzvariablen bekommen, wenn initialisiert, einen Standardwert
    static boolean b2;

    public static void main(String[] args) {

        System.out.println(b2);

        // Lokale Variablen MÜSSEN vor der Verwendung initialisiert werden
        // bekommen keine Standardwerte
        boolean b1 = true;
        System.out.println(b1);

        // Arrays werden ebenfalls mit Standardwerten befüllt
        boolean[] bool = new boolean[10];
        System.out.println(Arrays.toString(bool));

        System.out.println();

        // byte < short < int < long < float < double
        //         char <

        byte by1 = 120; // Wird geprüft, ob der Wert im gültigen Bereich liegt
        byte by2 = 10;
        // Bei math. Operationen konvertieren die Operanden zum größeren Typ min. int
        byte bySum = (byte)(by1 + by2); // Erzwungene Konvertierung kann zu einem Über- oder Unterlauf führen
        System.out.println(bySum);
        int sum = by1 + by2;

        showType(100);

        long l1 = 10_000_000_000_000L;
        long l2 = 10_000_000; // primitive widening (atomatisch)
        //int i1 = 10_000L; // primitive narrowing (cast ist nötig)

        int i2 = 0b11001101; // binär
        System.out.println(i2);
        i2 = 0x20AC;
        System.out.println(i2);
        i2 = 012345; // oktal
        System.out.println(i2);

        System.out.println();
        System.out.println(Integer.toHexString(1725)); // Ausgabe als HEX

        showType(10.5);

        // Ganzahlenliterale standard int
        // Fließkommazahlen standard double

        //System.out.println(5 / 0); // ArithmeticException
        double erg = 5 / 2.0;
        if(Double.isInfinite(erg)) {
            System.out.println("Teilung durch 0");
        }

        double x = 0.1 + 0.2;
        System.out.printf("%.1f", x);

        System.out.println('x'); // char
        System.out.println((int)'x'); // char
        System.out.println("x"); // String
        int j = 'z'; // primitive widening
    }

    // Überladen
    static void showType(int v) {
        System.out.println("INT");
    }

    static void showType(short v) {
        System.out.println("SHORT");
    }

    static void showType(byte v) {
        System.out.println("BYTE");
    }

    static void showType(long v) {
        System.out.println("LONG");
    }

    static void showType(float v) {
        System.out.println("FLOAT");
    }

    static void showType(double v) {
        System.out.println("DOUBLE");
    }
}
