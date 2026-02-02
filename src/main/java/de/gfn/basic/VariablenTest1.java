package de.gfn.basic;

public class VariablenTest1 {

    // Klassenvariable
    static int zahl1 = 100;

    // Instanzvariable
    int zahl2 = 200;

    public static void main(String[] args) {

        // lokale Variable
        int zahl3 = 300;

        System.out.println(zahl1); // Zugriff auf die Klassenvariable

        // Instanzvariablen brauchen ein Objekt
        VariablenTest1 test1 = new VariablenTest1(); // Instanzierung
        System.out.println(test1.zahl2);

        // Lokale Variable ist in der gleichen Methode direkt ansprechbar
        System.out.println(zahl3);

        // Klassenmethode
        method2();

        // Instanzmethode. Wird auf einem Objekt ausgeführt
        test1.method3();
    }

    private static void method2() {
        // Lokale Variablen aus anderen Methoden sind hier nicht sichtbar
        // System.out.println(zahl3);

        // Klassenvariable ist in jeder statischen Methode der gleichen Klasse sichtbar
        System.out.println(zahl1);

        // Da das Objekt hier nicht sichtbar ist, ist seine Instanzvariable auch nicht verfügbar
        // System.out.println(test1.zahl2);
    }

    // Instanzmethode
    private void method3() {
        // Klassenvariable ist in jeder statischen Methode der gleichen Klasse sichtbar
        System.out.println(zahl1);

        // Da das Objekt hier nicht sichtbar ist, ist seine Instanzvariable auch nicht verfügbar
        System.out.println(zahl2);
    }
}
