package de.gfn.basic.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", "Boston"));
        personen.add(new Person("Bruce", "Banner", "New York"));
        personen.add(new Person("Natasha", "Romanov", "Boston"));
        personen.add(new Person("Steve", "Rogers", "Miami"));
        personen.add(new Person("Carol", "Danvers", "New York"));
        personen.add(new Person("Toni", "Stark", "Berlin"));

        Map<String, List<Person>> aufteilung = personen.stream()
                                                    // .limit(100)
                                                    .collect(Collectors.groupingBy(Person::getWohnort));

        for(Person p : aufteilung.get("New York")) {
            System.out.println(p);
        }
    }
}
