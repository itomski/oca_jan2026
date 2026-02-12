package de.gfn.basic.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionTest {

    public static void main(String[] args) {

        // UncheckedExceptions = Kompiler verpflichtet NICHT zur Behandlung

        int[] arr = new int[5];
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        Object o = null;
        // System.out.println(o.hashCode()); // NullPointerException

        // System.out.println(5 / 0); // ArithmeticException

        try {
            Path path = Paths.get("data.txt");
            Files.lines(path); // CheckedException = Kompiler verpflichtet zur Behandlung
        }
        catch (NoSuchFileException e) {
            System.out.println("Datei nicht da!");
        }
        catch (IOException e) {
            System.out.println("Problem mit der Datei!");
        }
        catch (Exception e) {
            System.out.println("Irgendeine Ausnahme");
        }
        catch (Throwable e) {
            System.out.println("Irgendein ein anderes Problem");
        }

    }
}
