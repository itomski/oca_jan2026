package de.gfn.basic;

public class Methoden2 {

    public static void main(String[] args) {

        machWas();

        final boolean test1 = true; // Kompiletimekonstante: Bekommen bei der Deklaration ihren Wert

        final boolean test2; // Runtimekonstante: Initialisierung findet später statt
        test2 = true;

        while(test2) { // Endlosschleife
            System.out.println("...");
        }

        System.out.println("Ende"); // Error
    }

    private static void machWas() {

        System.out.println("machWas");
        return; // Verlässt die Methode
        // System.out.println("Nach dem return"); // Error

    }

}
