package de.gfn.basic.collections;

import java.util.*;

public class ListTest4 {

    public static void main(String[] args) {

        // Listen sind geordnet aber nicht sortiert

        List<String> namen = new ArrayList<String>();
        namen.addAll(Arrays.asList("Peter", "Carol", "Steve", "Natasha", "Scott", "Bruce"));

        //Arrays.sort(); // Sortiert nur Arrays
        Collections.sort(namen); // Sortierung für alle Listen

        Iterator<String> it = namen.iterator();
        while(it.hasNext()) {
            System.out.println(it.next()); // next liefert den aktuellen Wert
        }

    }
}
