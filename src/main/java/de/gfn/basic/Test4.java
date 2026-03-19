package de.gfn.basic;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(3,"D"); // Verfügbare Position oder die nächste
        //list.set(4,"E"); // Exception: Position muss bereits verfügbar sein
        System.out.println(list);

        Period p = Period.of(2, 3, 0);
        System.out.println(p);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
    }
}
