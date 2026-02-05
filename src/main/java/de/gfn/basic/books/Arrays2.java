package de.gfn.basic.books;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {

        int[][] arr = {{}, {3,7,9},{22,21}, null};
        int[] part = arr[1];
        int zahl = arr[1][2];

        // int[] part2 = arr[-20]; // Exception

        int[] zahlen = {5,7,22,18,-1,100,99};
        Arrays.sort(zahlen); // Original wird sortiert
        System.out.println(Arrays.toString(zahlen));

        // Muss vor der Suche sortiert sein
        int idx = Arrays.binarySearch(zahlen, 18);
        System.out.println(idx);
        System.out.println();
        idx = Arrays.binarySearch(zahlen, 27);
        System.out.println(idx);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        //Collections
        //Objects

    }

}
