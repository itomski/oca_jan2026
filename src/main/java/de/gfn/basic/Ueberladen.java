package de.gfn.basic;

import java.util.Arrays;

public class Ueberladen {

    public static void main(String[] args) {

        // Reihenfolge der Abarbeitung
        // 1. passender Typ
        // 2. primitive Widening
        // 3. Auto Boxing
        // 4. komplex Widening
        // 5. primitive Var-Arg
        // 6. komplex Var-Arg

        // Überladen = Parameterliste muss unterschiedlich sein

        short s = 100;
        short s2 = 200;
        machWas(s);
        machWas(s, s2);

    }

    private static void machWas(byte value) {
        System.out.println("BYTE");
    }

//    private static void machWas(Short value) {
//        System.out.println("Short-Obj");
//    }

//    private static void machWas(Integer value) {
//        System.out.println("Integer-Obj");
//    }

//    private static void machWas(Number value) {
//        System.out.println("Number-Obj");
//    }

//    private static void machWas(Object value) {
//        System.out.println("Object-Obj");
//    }

    // 0 oder n Parameter
    private static void machWas(byte... value) {
        System.out.println("byte Var-Arg");
    }

    private static void machWas(short... value) {
        System.out.println(Arrays.toString(value));
        System.out.println("short Var-Arg");
    }

//    private static void machWas(Short... value) {
//        System.out.println("Short Var-Arg");
//    }

//    private static void machWas(int value) {
//        System.out.println("INT");
//    }

//    private static void machWas(double value) {
//        System.out.println("DOUBLE");
//    }


}
