package de.gfn.basic;

import java.time.LocalDate;
import java.util.Date;

public class KlasseVsArray {

    public static void main(String[] args) {

        String vorname = "Peter";
        String nachname = "Parker";
        LocalDate geburtsDatum = LocalDate.now();
        System.out.println(geburtsDatum);

        Object[] person = {"Peter", "Parker", LocalDate.now()};
        person = new Object[]{"Peter", "Parker", LocalDate.now(), 123};

        Person2 person2 = new Person2("Peter", "Parker", LocalDate.now());
        System.out.println(person2.geburtsDatum);
        person2 = null;

//        Date heute = new Date(2025, 1, 6);
//        System.out.println(heute);
    }
}

class Person2 {

    String vorname;
    String nachname;
    LocalDate geburtsDatum;

    public Person2(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }
}
