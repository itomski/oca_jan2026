package de.gfn.basic;

import static de.gfn.basic.ImportClass.anzahl;

public class Test2Import {

    public static void main(String[] args) {
        System.out.println(anzahl);
        System.out.println(anzahl());

        final int i = 1;
        final int j = 2;

        switch(i + j) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case i+3 -> System.out.println("C");
            case i+4 -> System.out.println("D");
            default -> System.out.println("Z");
        }

        if(i == 10)
            System.out.println("A");
            if(j == 20)
                System.out.println("B");
        else
            System.out.println("B");

        String output = i == 2 ? "jup" : "nö";

    }
}
