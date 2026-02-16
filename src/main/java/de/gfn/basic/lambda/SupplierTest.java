package de.gfn.basic.lambda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierTest {

    public static void main(String[] args) {

        // T get();
        Supplier<Integer> sup1 = () -> 1;

        final Supplier<Integer> W6 = () -> (int)(Math.random() * 6) + 1;

        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());

        // int get()
        IntSupplier sup2 = () -> (int)(Math.random() * 100) + 1;

        // long get()
        LongSupplier sup3 = null;

        // double get()
        DoubleSupplier sup4 = null;

        System.out.println();

        IntStream.generate(sup2)
                //.limit(100)
                .map(i -> i * i)
                .filter(i -> i < 1000)
                .forEach(System.out::println);
        System.out.println();

        // Files.lines(...) // liefert einen Stream
    }
}
