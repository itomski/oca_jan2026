package de.gfn.basic.exceptions;

import java.util.*;
import java.util.Map.*; // Innere Klassen/Interfaces
//import static java.util.Map.*; // statisches Inventar
import static de.gfn.basic.exceptions.Xyz.*; // statisches Inventar


public class ErrorTest2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        for(Entry e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println(Xyz.wert); // ohne statischen Import
        System.out.println(wert); // mit statischen Import möglich

        System.out.printf("|%06d|", 123);
        System.out.printf("|%-6s|", 123);
        // System.out.printf("|%~6.2f|", 123.123f); // geht nicht!

    }
}

interface Xyz {

    int wert = 100;

}
