package de.gfn.basic.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Function<T, R>
        // R apply(T t);
        Function<String, Integer> intParser = s -> Integer.parseInt(s);
        Function<Integer, Integer> pow5 = i -> (int) Math.pow(i, 5);

        Function<String, Integer> newFunc = intParser.andThen(pow5);

        int i = newFunc.apply("500");
        System.out.println(i);

        Function<String, String> transform1 = s -> {
            if(s.length() > 20) {
                return s.substring(0, 20) + "...";
            }
            return s;
        };

        System.out.println(transform1.apply("Das ist das Haus von Nikigraus!"));
        System.out.println(transform1.apply("Moin Moin"));

        System.out.println();

        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> div = (a, b) -> a / b;
        System.out.println(add.apply(10.0, 15.0));
    }
}
