package de.gfn.basic.aufgaben.a4;

import java.util.Scanner;

public class PilzsucheTest {

    public static void main(String[] args) {

        PilzsucheSpiel spiel = new PilzsucheSpiel();

        Scanner input = new Scanner(System.in);

        System.out.println("Das Spiel beginnt. Suche die Pilze!");

        while(!spiel.spielIstVorbei()) {

            System.out.print("Zeile: ");
            int x = input.nextInt();
            System.out.print("Reihe: ");
            int y = input.nextInt();
            if(spiel.suche(x, y)) {
                System.out.println("Gefunden");
            }
            else {
                System.out.println("Nicht gefunden");
            }
        }

        System.out.println("\nVersuche: " + spiel.getVersuche());
        System.out.println("Pilze gefunden: " + spiel.getGefunden());
        System.out.println();
        spiel.zeigeSpielfeld();
    }
}
