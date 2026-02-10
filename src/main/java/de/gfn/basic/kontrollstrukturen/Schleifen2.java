package de.gfn.basic.kontrollstrukturen;

public class Schleifen2 {

    public static void main(String[] args) {


        var arr = new int[]{1,3,5,7,9};

        //int i = 0; // Variable für den aktuellen Wert im for darf nicht außerhalb des for angelegt werden
        for (int i : arr) {
            System.out.println(++i);
        }

        // primitive Werte werden als Kopie weitergegeben
        // komplexe Werte werden als Referenz weitergegeben

        int j = 0;
        while(j < 100) {
            System.out.println(j++);
        }

        j = 0;
        do {
            System.out.println(j++);
        } while (j < 100);

        System.out.println();

//        do {
//            int k = 0;
//            System.out.println(k++);
//        } while (k < 100); // Error: k ist hier nicht mehr verfügbar

    }
}
