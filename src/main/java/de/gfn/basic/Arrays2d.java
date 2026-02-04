package de.gfn.basic;

import java.util.Arrays;

public class Arrays2d {

    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];

        /*
        0 { 0: 0,
            1: 0,
            2: 0
        },
        1 { 0: 0,
            1: 0,
            2: 0
        },
         */

        int[][] arr2 = new int[2][];
        arr2[0] = new int[5];
        arr2[1] = new int[2];

        /*
        0 { 0: 0,
            1: 0,
            2: 0,
            3: 0,
            4: 0,
        },
        1 { 0: 0,
            1: 0
        },
         */

        System.out.println();

        int[][] spiel = new int[5][5];

        for(int[] zeile : spiel) {
            System.out.println(Arrays.toString(zeile));
        }

        System.out.println();

        spiel[3][2] = 1;

        for(int[] zeile : spiel) {
            for(int zelle : zeile) {
                System.out.print(zelle + " ");
            }
            System.out.println();
        }
    }

}
