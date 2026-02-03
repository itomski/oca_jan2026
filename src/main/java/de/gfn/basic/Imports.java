package de.gfn.basic;

// Alle Klassen aus dem Package java.lang sind automatisch verfügbar

import java.util.ArrayList;
import java.util.List;
import java.util.*; // Importiert alle Klassen aus dem Package

// Statisches Inventar einer Klasse kann importiert werden
//import static java.lang.Math.PI;
//import static java.lang.Math.pow;
import static java.lang.Math.*;
import static de.gfn.basic.Wochentag.*;

import static java.lang.System.out;

public class Imports {

    // Instanzeigenschaft
    private int zahl = 200;

    public static void main(String[] args) {

        System.out.print(PI);
        System.out.print(Math.E);
        out.println(pow(2,5)); // durch statischen Import möglich

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        //Wochentag tag = Wochentag.DO;
        Wochentag tag = DO;

        String.format("..."); // Aufruf einer statischen Methode
        // String.class

        // Math m = new Math(); // Nicht möglich, da ein privater Konstruktor

        // Instanzvariablen und Instanzmethoden der gleichen Klasse sind in statischen Methoden nicht sichtbar
        // out.println(zahl);
        // machWas();
    }

    // Instanzmethode
    private void machWas() {

    }

}
