package de.gfn.basic;

import java.util.Arrays;

public class Test2a {

    public static void main(String[] args) {

        machWas(new int[]{1,2,3});

        // machWas({1,2,3}); // Nicht erlaubt. Parameter ist bereits deklariert

        int[] x = {1,2,3}; // Nur bei gleichzeitiger Deklaration erlaubt
        int[] y = new int[]{1,2,3}; // Immer erlaubt

        y = new int[3];

        int[][] z = new int[3][2];
        z[0] = new int[3];
        z[2] = new int[]{1,2,3};
        /*
        {
            0: {0,0,0}
            1: {0,0},
            2: {1,2,3}
        }
        */

        int[][] ints = new int[2][];
        Arrays.sort(ints[1]);
        /*
        {
            0: null
            1: null
        }
        */

    }

    static void machWas(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
