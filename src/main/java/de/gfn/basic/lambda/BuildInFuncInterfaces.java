package de.gfn.basic.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BuildInFuncInterfaces {

    public static void main(String[] args) {

        // void accept(T t);
        Consumer<String> big = s -> System.out.println(s.toUpperCase());
        big.accept("Das ist das Haus von Nikigraus!");

        System.out.println();
        List<Integer> zahlen = new ArrayList<>(Arrays.asList(5,7,22,18,9,-10,7,0));
        // void accept(T t);
        Consumer<Integer> intCons = i -> System.out.println(i);

        System.out.println();
        //zahlen.forEach(intCons);
        zahlen.forEach(i -> System.out.println(i));

        System.out.println();
        zahlen.forEach(System.out::println); // Verweis auf eine bereits vorhandene Methode mit gleicher Signatur

        System.out.println();
        zahlen.forEach(BuildInFuncInterfaces::print);

        System.out.println();
        //zahlen.forEach(BuildInFuncInterfaces::print2); // print2 ist kein Consumer

    }

    public static void print(Integer j) {
        System.out.println(j + 10);
    }

    public static int print2(Integer j1, Integer j2) {
        return j1 + j2;
    }
}
