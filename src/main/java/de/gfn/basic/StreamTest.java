package de.gfn.basic;

import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        IntStream.range(0, 10_000)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .forEach(i -> System.out.println(i));


    }
}
