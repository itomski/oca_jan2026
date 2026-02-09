package de.gfn.basic.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // Raw Type: Object
        list.add("Text");
        // Collections können NUR komplexe Datentypen verwalten
        // primitive Daten werden in ihre Wrapper geboxt
        list.add(100); // Fügt das Element ans Ende hinzu

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println();

        //ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> stringList = new ArrayList<>();
        //stringList = new LinkedList<>();
        stringList.add("Text");
        //stringList.add(200);
        System.out.println(stringList.get(0).toUpperCase());

        System.out.println(stringList.size());
        stringList.add(0, "ABC"); // Fügt ein Element an gewünschter Position ein
        stringList.add(2, "XYZ"); // Nächster freier Index ist ok
        //stringList.add(10, "XYZ"); // Indexproblem

        System.out.println(stringList);

        // Referenztyp: List
        // Objekttyp: ArrayList
        // Standardgröße des inneren Arrays = 10
        List<Integer> integerList = new ArrayList<>(100);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList = new LinkedList<>(integerList); // Von ArrayList auf LinkedList
        integerList = new ArrayList<>(integerList); // Von LinkedList auf ArrayList

        System.out.println();

        integerList = Arrays.asList(1,5,7,99,18,32,73); // Erzeugt eine Fixed-Size Liste
        integerList = List.of(1,5,7,99,18,32,73); // Erzeugt eine Fixed-Size Liste, ab Java 9
        integerList = new ArrayList(Arrays.asList(1,5,7,99,18,32,73)); // Veränderbare Liste

        // List durchlaufen
        for (int i = 0; i < integerList.size() ; i++) {
            System.out.println(integerList.get(i));
        }

        System.out.println();

        for(Integer e : integerList) {
            System.out.println(e);
        }

        System.out.println();

        // Ab Java 8
        integerList.forEach(e -> System.out.println(e)); // Lambda
        integerList.forEach(System.out::println); // Methoden Referenz

    }
}
