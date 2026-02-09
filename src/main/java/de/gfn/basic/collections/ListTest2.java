package de.gfn.basic.collections;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListTest2 {

    public static void main(String[] args) {

        // Generischer Typ MUSS komplex sein!
        //ArrayList<int> liste = new ArrayList<>();

        // Vergrößerung des internen Arrays = (alte Größe * 3) / 2
        ArrayList<Person> liste = new ArrayList<>();
        liste.add(new Person("Peter", "Parker", LocalDate.of(1990, 7, 20)));
        liste.add(new Person("Carol", "Danvers", LocalDate.of(1985, 3, 27)));
        liste.add(new Person("Bruce", "Banner", LocalDate.of(1979, 2, 3)));

        for (Person person : liste) {
            System.out.println(person); // toString wird automatisch verwendet
        }

        // Element wird an die Position hinzugefügt, nachfolgenede Elemente rücken nach rechts
        liste.add(1, new Person("Tony", "Stark", LocalDate.of(1965, 4, 15)));

        // Element wird an gewünschter Position entfernt, nachfolgenede Elemente rücken nach links
        liste.remove(1);

        // Ersetzt ein Element an vorgegebener Position
        liste.set(1, new Person("Steve", "Rogers", LocalDate.of(1920, 1, 5)));

        System.out.println();

//        System.out.println(liste);
//
//        for (Person person : liste) {
//            if(person.getBirthDate().isBefore(LocalDate.of(1985, 1, 1))) {
//                liste.remove(person);
//            }
//        }
//
//        System.out.println(liste);

        System.out.println(liste);

        liste.removeIf(e -> e.getBirthDate().isBefore(LocalDate.of(1985, 1, 1)));

        System.out.println(liste);
    }
}
