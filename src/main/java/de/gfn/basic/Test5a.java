package de.gfn.basic;

import java.time.LocalDate;
import java.util.Arrays;

public class Test5a {

    int i = k;
    int j = i;
    static int k;

    final int b;
    final int c;
    int a = b = c = 100;

    public static void main(String[] args) {



        // Führende 0 wird ignoriert
        // Verarbeitet Dezimalwerte
        System.out.println(Integer.parseInt("0123"));

        System.out.println(Integer.decode("0123")); // Beachtet verschiedene Zahlensysteme

        int i = 12_34_56;

        System.out.println(String.copyValueOf(new char[]{'A','B', 'C'}, 1, 2));

        char[] arr = new char[10];
        //Arrays.fill(arr, 'X');
        String str = "123456789";
        //str.getChars(0,8, arr, 6);
        System.out.println(Arrays.toString(arr));

        LocalDate l1 = LocalDate.of(2015,10,17).now();
        LocalDate ld = LocalDate.of(2015,10,17);
        LocalDate l2 = ld.now();

    }
}
