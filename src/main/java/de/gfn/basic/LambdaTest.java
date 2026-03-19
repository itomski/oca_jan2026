package de.gfn.basic;

import java.util.function.Predicate;

public class LambdaTest {

    public static void main(String[] args) {

        Ab1 ab1 = (a,b) -> {};
        Ab2 ab2 = a -> {};
        Ab3 ab3 = () -> {};

        ab1.compute(10, 15);
    }
}

@FunctionalInterface
interface Ab1 {

    void compute(int a, int b);

    //void compute(int a);

    String toString(); // Alle Methoden von Object werden als abstrakte Methoden ignoriert

}

@FunctionalInterface
interface Ab2 {

    void compute(int a);

    // Methoden von Object dürfen NICHT als default Methoden implementiert werden!!!!!
//    default String toString() {
//        return "ABC";
//    }
}

@FunctionalInterface
interface Ab3 {

    void compute();
}