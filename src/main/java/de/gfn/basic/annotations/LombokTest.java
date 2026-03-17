package de.gfn.basic.annotations;

import java.time.LocalDate;

public class LombokTest {

    public static void main(String[] args) {

        Person p = new Person("Peter", "Parker", LocalDate.now());
        System.out.println(p.getNachname());
        System.out.println(p);


    }
}
