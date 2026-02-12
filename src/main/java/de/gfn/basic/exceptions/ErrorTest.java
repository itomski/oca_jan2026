package de.gfn.basic.exceptions;

public class ErrorTest {

    public static void main(String[] args) {

        try {
            execute(10);
        }
        catch (Error e) { // Error und seine Unterklassen sollten nicht behandelt werden
            System.out.println("Problem!");
        }

    }

    private static void execute(int i) {
        execute(i);
        // throw new RuntimeException();
    }

}
