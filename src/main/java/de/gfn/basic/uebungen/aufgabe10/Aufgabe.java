package de.gfn.basic.uebungen.aufgabe10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Aufgabe {

    /*

    Schreibe für jedes der folgenden BuildIn-FunctionalInterfaces 3 Varianten.
    Consumer, Function, Predicate, Supplier, UnaryOperator
    Verwende unterschiedliche Datentypen.

    Schreibe 2 eigene FunctionalInterfaces und implementiere sie jeweils 3 mal.

     */

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(Arrays.asList(2,5,7,22,19,8,-22,300,1));


        Consumer<Integer> cons = e -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(e);
        };


        //zahlen.forEach(cons);
        zahlen.stream().parallel().forEach(cons);
        //zahlen.stream().filter(...) // Lazy

        Predicate<Integer> pred1 = z -> z < 20;
        Predicate<Integer> pred2 = z -> z > 200;

        System.out.println(zahlen);
        //zahlen.removeIf(pred1.negate());
        //zahlen.removeIf(pred1.or(pred2).negate());
        zahlen.removeIf(Predicate.not(pred1.or(pred2)));
        System.out.println(zahlen);


    }
}
