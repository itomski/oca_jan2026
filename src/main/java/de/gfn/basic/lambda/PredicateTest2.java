package de.gfn.basic.lambda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {

        Predicate<String> beginntMitA = s -> s.toUpperCase().startsWith("A");
        Predicate<String> beginntMitB = s -> s.toUpperCase().startsWith("B");
        Predicate<String> endetMitE = s -> s.toUpperCase().endsWith("E");

        String str = "Steve";

        System.out.println(beginntMitA.test(str));
        System.out.println(beginntMitA.and(endetMitE).test(str));
        System.out.println(beginntMitA.or(beginntMitB).test(str));


        LocalDate ld = LocalDate.now();
        ld = ld.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println(ld);
        System.out.println(ld.getLong(ChronoField.DAY_OF_WEEK));

        System.out.println();

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getLong(ChronoField.MINUTE_OF_DAY));

    }
}
