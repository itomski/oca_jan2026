package de.gfn.basic;

/**
 * @author Tomasz Lubowiecki
 * @version 1.0
 * Das ist einfach nur ein kleiner Test für Variablen
 * @deprecated
 */
public class Variablen {

    // Klassenvariablen: Ab dem Laden der Klasse bis zum Ende des Programm verfügbar

    // Instanzvariablen: Jedes Objekt hat eigene. Ab der Objekterzeugung bis zum Löschen des Objjekts verfügbar

    public static void main(String[] args) {

        // Lokale Variablen - Nur innerhalb der Methode verfügbar
        // Methodenparameter sind auch lokale Variablen

        int i = 100;
        doSomething();
        int k = 300;

        /* Das ist das Haus
        von Nikigraus */
        String s1 = new /* Das ist ja toll */ String("Hallo" /* Moin */);
        String s2 = "Hallo";
        String s3 = new String();

        String neuerText = changeText("hi");
        System.out.println(neuerText);
    }

    /**
     * Das ist ein Java-Doc Kommentar
     */
    public static void doSomething() {
        String s = "Hallo Something";
        int j = 200;
    }

    /**
     * Ändert die Schreibweise in Großbuchstaben
     * @param text Text, der geändert werden soll
     * @return Geänderter Text
     */
    public static String changeText(String text) {
        return text.toUpperCase();
    }
}
