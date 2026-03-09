package de.gfn.basic.patterns.builder;

import java.time.LocalDate;

public class BuilderTest2 {

    public static void main(String[] args) {

        Kunde pParkerTest = new Kunde("Peter", "Parker", LocalDate.of(1995, 10,17), KundenTyp.TEST);
        show(pParkerTest);

        Kunde pParkerPrivat = new Kunde("Peter", "Parker", LocalDate.of(1995, 10,17), KundenTyp.PRIVAT);
        show(pParkerPrivat);

        Kunde.Builder builder = new Kunde.Builder();
        Kunde k = builder.build();
        show(k);

        builder.setVorname("Peter").setNachname("Parker");
        k = builder.build();
        show(k);

        builder.setGeburtsDatum(LocalDate.of(1995, 10, 22));
        k = builder.build();
        show(k);
    }

    private static void show(Kunde kunde) {
        System.out.println(kunde);
        System.out.println();
    }
}
