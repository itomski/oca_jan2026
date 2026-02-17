package de.gfn.basic.lambda;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(5);
        zahlen.add(7);
        zahlen.add(22);
        zahlen.add(0);
        zahlen.add(-100);
        zahlen.add(2);
        zahlen.addAll(Arrays.asList(8,-2,-35,100,7));

        //Collections.sort(zahlen); // Natürliche Ordnung

        // int compare(T o1, T o2);
        Comparator<Integer> aufsteigend = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> absteigend = (a, b) -> b - a;

        Comparator<Integer> absteigend2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        System.out.println(zahlen);
        // zahlen.sort(absteigend);
        // zahlen.sort(aufsteigend.reversed());
        zahlen.sort(new AufsteigendComparator());
        System.out.println(zahlen);
    }
}
