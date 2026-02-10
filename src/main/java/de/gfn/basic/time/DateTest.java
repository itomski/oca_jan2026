package de.gfn.basic.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {

        final DateTimeFormatter DT_FMT =  DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        final DateTimeFormatter D_FMT =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final DateTimeFormatter T_FMT =  DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDate date = LocalDate.now(); // Aktuelles Datum
        LocalTime time = LocalTime.now(); // Aktuelle Uhrzeit
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(date.format(D_FMT));

        System.out.println();
        System.out.println(time);
        System.out.println(time.format(T_FMT));

        System.out.println();
        System.out.println(dateTime);
        System.out.println(dateTime.format(DT_FMT));

        System.out.println();
        String d1 = "2026-10-01";
        LocalDate date2 = LocalDate.parse(d1); // ISO
        System.out.println(date2);

        System.out.println();
        d1 = "01.10.2026";
        LocalDate date3 = LocalDate.parse(d1, D_FMT); // deutsches Standard-Format
        System.out.println(date3);

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.of(d, t);

        System.out.println(ldt.isAfter(LocalDateTime.now()));
        System.out.println(ldt.isBefore(LocalDateTime.now()));

        LocalDate d3 = LocalDate.now();
        LocalDate d4 = LocalDate.now().plusDays(20);

        System.out.println(d3.compareTo(d4));
        System.out.println(d4.compareTo(d3));
    }
}
