package de.gfn.basic;

public class StringBuilderTest {

    public static void main(String[] args) {

        // Standard capacity von 16
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // Größe des internen Arrays
        System.out.println(sb.length()); // Anzahl Zeichen

        System.out.println();
        sb.append("Das ist das Haus von Nikigraus"); // Alte Größe * 2 + 2
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println();

        sb = new StringBuilder(1000);
        sb.append("Das ist das Haus von Nikigraus"); // Fügt neuen Inhalt ans Ende der Zeichenkette
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.insert(0, "XYZ"); // Fügt den Inhalt an vorgegebener Stelle ein
        //sb.delete(10, 8); // inkl. Startindex, excl. Endindex
        sb.replace(0, 10, "..."); // Ersetzen
        System.out.println(sb);

        String text = sb.toString();

        sb = new StringBuilder(); // Standard capacity 16
        sb = new StringBuilder(100); // capacity 100
        sb = new StringBuilder("Das ist das"); // capacity = Anzahl der Zeichen + 16

    }

}
