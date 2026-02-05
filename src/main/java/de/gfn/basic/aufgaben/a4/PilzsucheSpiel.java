package de.gfn.basic.aufgaben.a4;

import de.gfn.basic.aufgaben.a2.Dice;
import de.gfn.basic.aufgaben.a2.DiceCup;

public class PilzsucheSpiel {

    private static DiceCup cup = new DiceCup(Dice.W10);

    private final int MAX_VERSUCHE = 10;
    private final int ANZAHL_PILZE = 10;

    private int[][] spielfeld;
    private int gefunden;
    private int versuche;


    public PilzsucheSpiel() {
        neuesSpiel();
    }

    private void pilzeSetzen() {
        for (int i = 0; i < ANZAHL_PILZE; i++) {
            pilzSetzen();
        }
    }

    private void pilzSetzen() {
            int zeile = cup.roll() - 1;
            int zelle = cup.roll() - 1;
            if(spielfeld[zeile][zelle] == 1) {
                pilzSetzen();
            }
            else {
                spielfeld[zeile][zelle] = 1;
            }
    }

    public boolean spielIstVorbei() {
        return versuche ==  MAX_VERSUCHE;
    }

    public boolean suche(int x, int y) {
        if(spielIstVorbei()) return false;

        if(x < spielfeld.length && y < spielfeld[0].length ) {
            versuche++;
            if(spielfeld[x][y] == 1) {
                gefunden++;
                return true;
            };
        }
        return false;
    }

    public void neuesSpiel() {
        spielfeld = new int[10][10];
        gefunden = 0;
        versuche = 0;
        pilzeSetzen();
    }

    public void zeigeSpielfeld() {
        for(int[] zeile : spielfeld) {
            for(int zelle : zeile) {
                System.out.print(zelle + " ");
            }
            System.out.println();
        }
    }

    public int getGefunden() {
        return gefunden;
    }

    public int getVersuche() {
        return versuche;
    }
}
