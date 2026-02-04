package de.gfn.basic;

// Top-Level-Klassen düfen NUR public oder package-private sein
// Top-Level-Klassen düfen NICHT static sein!!!!
public class Mofifier {

    // final Attribute sind Konstanten
    private static String text = "";

    public static void main(String[] args) {

        // Innerhalb von Methoden werden keine Access-Modifier benutzt

        // final bei lokalen Variablen führt zu lokalen Konstanten
        // finale primitive Variablen dürfen ihren Wert nicht ändern
        // finale komplexe Variablen dürfen ihre Referenz nicht ändern

        final int zahl = getZahl(); // Kann nachträglich nicht neu zugewisen werden
        System.out.println(zahl);

        setText();
        //System.out.println(setText());
        System.out.println(); // Produziert eine Leerzeile
        //System.out.print(); // Error

    }

    private static int getZahl() {
        return 10;
    }

    private static void setText() {
        text = "Das ist das Haus von Nikigraus";
    }
}
