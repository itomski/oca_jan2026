package de.gfn.basic.collections;

import java.util.Scanner;

public class ParkhausTest {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String ROW_TPL = "| %-12s | %-20s | %-20s | \n";

    public static void main(String[] args) {

        Parkhaus parkhaus = new Parkhaus();

        System.out.println("Programm wurde gestartet.");

        app: while(true) { // Endlosschleife

            System.out.print("Eingabe: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("exit")) {
                break app; // while-Schleife wird abgebrochen
            }
            else if(input.equals("new")) {
                System.out.println("Einparken".toUpperCase());
                Fahrzeug f = createFahrzeug();

                if(parkhaus.einparken(f)) {
                    System.out.println("Erfolgreich eingeparkt.");
                }
                else {
                    System.out.println("Fahrzeug konnte nicht eingeparkt werden.");
                }
            }
            else if(input.equals("remove")) {
                System.out.println("Ausparken");
            }
            else if(input.equals("show")) {
                System.out.println("Geparten Fahrzeuge");
                System.out.printf(ROW_TPL, "KENNZEICHEN", "MARKE", "MODELL");
                for(Fahrzeug f : parkhaus.getFahrzeuge()) {
                    System.out.printf(ROW_TPL, f.getKennzeichen(), f.getMarke(), f.getModell());
                }
            }
            else {
                System.out.println("Falsche Auswahl!");
            }
        }

        System.out.println("Programm wurde beendet!");
    }

    private static Fahrzeug createFahrzeug() {
        Fahrzeug f = new Fahrzeug();
        System.out.print("Kennzeichen: ");
        f.setKennzeichen(scanner.nextLine());
        System.out.print("Marke: ");
        f.setMarke(scanner.nextLine());
        System.out.print("Modell: ");
        f.setModell(scanner.nextLine());
        return f;
    }

}
