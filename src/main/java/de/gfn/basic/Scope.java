package de.gfn.basic;

import java.util.Arrays;

public class Scope {

    private int i; // Ab der Instanzierung bis zum lösen der Referenz verfügbar
    private static int j; // Ab dem laden der Klasse bis zum Ende des Programms verfügbar

    public static void main(String[] args) {
        machWas();
    }

    private static void machWas() {
        // nur bis zum Ende der Methode verfügbar
        int i; // Deklaration
        i = 10; // Speiecher wird erst hier reserviert
        System.out.println(i);

        int $ = 10;
        int _ = 15;

        //boolean String = true; // Gültig aber KEINE gute Idee!!!

        {
            int[] arr = new int[10_000_000];
            Arrays.fill(arr, 100);
            System.out.println(arr[10_000]);
            if(arr.length > 0) {
                int j = 200;
                // lokale Variablen überlagern Instanz oder Klassenvariablen
                System.out.println(arr[10]);
            }
            System.out.println(j);
        }
        //System.out.println(arr[10_000]); // Error: Ist out-of-scope

        System.out.println("...");

        int z = 10;
        //int z = 22; // Redeklaration = NICHT erlaubt
        z = 22; // Neuzuweisung, erlaubt


        for (int j = 0; j < 100; j++) {
            //...
        }
        // j der for-Schleife ist out-of-scope

        for (int j = 0; j < 100; j++) {
            //...
        }

        int x = 10;
                  // 10 + 12 - 11 + 10
        int erg = x++ + ++x - --x + x;
        System.out.println(erg);
        erg = 10;
        erg = erg++; // Bei Neuzuweisung einer Variable geht ein postfix verloren
        System.out.println(erg);

        System.out.println('c' + 'x');
        System.out.println("c" + "x");

        System.out.println('c' + 10 + "Hallo");
    }
}
