package de.gfn.basic.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        // boolean test(T t)
        Predicate<Integer> kleinerAls100 = i -> i < 100;

        List<Integer> zahlen = new ArrayList<>();
        zahlen.addAll(Arrays.asList(10, 100, 7,220, 350, 6, -22, 892));

        System.out.println(zahlen);
        zahlen.removeIf(kleinerAls100);
        System.out.println(zahlen);

        List<String> namen = new ArrayList<>();
        namen.addAll(Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Scott", "Tony"));

        System.out.println(namen);
        Predicate<String> beginntMitS = s -> s.startsWith("S");
        namen.removeIf(beginntMitS);
        System.out.println(namen);


    }
}
