package de.gfn.basic.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {

        // Alle diese Objekte sind immutable

        LocalDate ld;
        // ld = new LocalDate(); // Konstruktor ist privat
        ld = LocalDate.now();
        ld = LocalDate.of(2020, 5, 22);
        ld = LocalDate.of(2020, Month.FEBRUARY, 25); // Gültigkeit wird über einen Kalender geprüft
        ld = LocalDate.parse("2020-05-22"); // Standard ist ISO
        //ld = LocalDate.parse("22.05.2020"); // .DateTimeParseException: Ein Formatter muss vorgegeben werden
        System.out.println(ld);

        ld = ld.plusDays(100);
        System.out.println(ld);
        ld = ld.minusWeeks(15);
        System.out.println(ld);

        ld = ld.plus(100, ChronoUnit.DAYS);
        // ld = ld.minus(100, ChronoUnit.MILLIS); // UnsupportedTemporalTypeException

        System.out.println();

        Period p = Period.ofWeeks(10); // Abstand in Jahren, Monaten, Wochen und Tagen
        System.out.println(p);
        p = Period.of(2, 23, 117);
        System.out.println(p.normalized());

        System.out.println(ld);
        ld = ld.plus(p);
        System.out.println(ld);

        System.out.println();

        LocalTime lt; // Hat einen privaten Konstruktor
        lt = LocalTime.now();
        lt = LocalTime.of(10, 20, 20);

        LocalDateTime ldt; // Hat einen privaten Konstruktor
        ldt = LocalDateTime.now();
        ldt = LocalDateTime.of(ld, lt);
        ldt = LocalDateTime.of(2025,10,22,15,22,17);
        System.out.println(ldt);

        System.out.println();

        // ChronoUnit.MILLIS
        // ChronoField.DAY_OF_MONTH

        LocalDateTime ldt2 = ld.atTime(lt); // Datum wird mit einer Zeit kombiniert
        ldt2 = lt.atDate(ld);

        Year y = Year.of(2000);
        // MonthDay = Kombi aus Monat und Tag
        // YearMonth = Kombi aus Jahr und Monat
        ld = y.atMonthDay(MonthDay.now());

        // Formatierung
        //ld = ld.withYear(10); // Jahr wird überschrieben
        ld = ld.withDayOfMonth(3);
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //System.out.println(lt.format(DATE_FMT)); // UnsupportedTemporalTypeException
        System.out.println(ld.format(DATE_FMT));

        Locale.setDefault(Locale.CHINA);
        final DateTimeFormatter DATE_LOC_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(ld.format(DATE_LOC_FMT));
    }
}
