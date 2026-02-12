package de.gfn.basic.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListTest {

    private static List<String> liste = List.of("Peter", "Bruce", "Carol", "Scott");

    public static void main(String[] args) {

        //List<Integer> list = List.of(2,3,5,6); // Fixed Size Liste ab Java 1.8
        List<Integer> list = Arrays.asList(2,3,5,6); // Fixed Size Liste
        //list.add(25); // Nicht erlaubt

        System.out.println();

        //System.out.println(getName(5).toUpperCase());

        getName(5).ifPresent(e -> System.out.println(e.toUpperCase()));

        System.out.println(getName(5).orElse("Nicht vorhanden!"));

        try {
            //...
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Variable e ist im Multicatch final
            // e = null;
        }
        catch(Exception e) {
            // e ist hier nicht final
            e = new ArrayIndexOutOfBoundsException();
        }

        System.out.println(getZahl(3));

    }

    private static Optional<String> getName(int idx) {
        try {
            return Optional.of(liste.get(idx));
        }
        catch (IndexOutOfBoundsException e) {
            //return null;
            return Optional.empty();
        }
    }

    static int getZahl(int idx) {
        int[] werte = {2,4,6,8,10};
        try {
            return werte[idx];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            idx = 0;
        }
        finally { // Wird auch nach dem return ausgeführt
            return werte[idx];
        }
    }
}
