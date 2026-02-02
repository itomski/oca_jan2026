package de.gfn.basic;

import java.util.Date;

// Nur eine public Class pro Datei
// Public Class gibt den Namen für die Datei vor!!!!
public class Namen {

    public static void main(String[] args) {

        Date datum1 = new Date(); // Kurzname möglich, da ein import vorhanden ist

        // Verwendung des Voll-Qualifizierten-Namen
        java.sql.Date datum2 = new java.sql.Date(datum1.getTime());

        // Alle Klassen aus java.lang sind automatisch importiert
        String s = "Hallo Welt";

    }
}

// darf nicht public sein. Ist package private (Auf die Verwendung im gleichen Package eingeschränkt)
// Wird nach dem Kompilieren zu einer eigenen Class-Datei
class Irgendwas {

}