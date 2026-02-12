package de.gfn.basic.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionTest {

    public static void main(String[] args) {
        System.out.println("MAIN: Start");
//        try {
            methodA();
//        }
//        catch(IOException e) { // Checked Exceptions können nur behandelt werden, wenn sie auch auftauchen können
//            System.out.println("MAIN: try");
//        }
        System.out.println("MAIN: Ende");
    }

    private static void methodA() {
        System.out.println("A: Start");
        try {
            methodB();
        }
        catch(IOException e) {
            System.out.println("A: try");
        }
        System.out.println("A: Ende");
    }

    private static void methodB() throws IOException, RuntimeException{
        System.out.println("B: Start");
//            try {
            methodC();
//            }
//            catch(IOException e) {
//                System.out.println("B: try");
//            }
        System.out.println("B: Ende");
    }

    // throws in der Signatur gibt die Verpflichtung zur Behandlung an den Aufrufer
    private static void methodC() throws IOException {
        System.out.println("C: Start");

        List<String> zeilen = Files.readAllLines(Paths.get("data.txt"));

        System.out.println("C: Ende");
    }
}
