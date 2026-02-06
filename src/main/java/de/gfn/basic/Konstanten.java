package de.gfn.basic;

public class Konstanten {

    public static void main(String[] args) {

        final String TEXT1 = "Moin"; // Kompiletime
        final String TEXT2; // Runtime
        TEXT2 = "Moin Moin";

        System.out.println(TEXT1);
        System.out.println(TEXT2);

        // Aufruf des default Konstruktors
        Konstanten konst = new Konstanten();
        konst.Konstanten(); // Aufruf der Methode aus Zeile 21

    }

    // Kein Konstruktor mehr
    public int Konstanten() {
        return 1;
    }

    int getZahl() {
        return 10;
    }

    String getObject() {
        return null;
    }

    String getOtherObject() {
        throw new UnsupportedOperationException("Noch nicht implementiert...");
    }
}
