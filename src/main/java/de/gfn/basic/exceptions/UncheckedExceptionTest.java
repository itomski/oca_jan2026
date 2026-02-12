package de.gfn.basic.exceptions;

public class UncheckedExceptionTest {

    public static void main(String[] args) {
        System.out.println("MAIN: Start");
        try {
            methodA();
        }
        catch(RuntimeException e) { // Bei UncheckedExceptions ist eine Behandlung jederzeit möglich
            System.out.println("MAIN: try");
        }
        System.out.println("MAIN: Ende");
    }

    private static void methodA() {
        System.out.println("A: Start");
        try {
            methodB();
        }
        catch(RuntimeException e) {
            System.out.println("A: try");
        }
        System.out.println("A: Ende");
    }

    private static void methodB() {
        System.out.println("B: Start");
        try {
            methodC();
        }
        catch(RuntimeException e) {
            System.out.println("B: try");
        }
        System.out.println("B: Ende");
    }

    private static void methodC() {
        System.out.println("C: Start");

        try {
            throw new RuntimeException();
//            Object o = null;
//            System.out.println(o.hashCode());
        }
        catch(RuntimeException e) {
            System.out.println("C: try");
        }

        System.out.println("C: Ende");
    }

    static int machWas(int i) {
        if(i > 0) {
            return 1;
        }
        throw new RuntimeException("Ungültig");
    }
}
