package de.gfn.basic.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        Stream<String> namen = Stream.of("Peter", "Bruce", "Natasha", "Carol");
        namen.map(s -> s.toUpperCase())
                .limit(3)
                .forEach(System.out::println);

        //namen.forEach(System.out::println); //IllegalStateException: stream has already been operated upon or closed

        IntStream zahlen = IntStream.of(2,7,22,19,18,0,-22);
        // LongStream
        // DoubleStream

        // System.out.println(zahlen.reduce(0, (a, b) -> a + b));

        OptionalInt opt = zahlen.reduce((a, b) -> a + b);
        opt.ifPresent(System.out::println);


        Random rand = new Random();

        List<Integer> zahlen2 = IntStream.generate(() -> rand.nextInt(6) + 1)
                .limit(100)
                .boxed()// Wechsel vom int auf Integer
                //.collect(ArrayList::new, List::add, List::addAll);
                .collect(Collectors.toList()); // Nur für komplexe Typen

        System.out.println(zahlen2);


    }
}
